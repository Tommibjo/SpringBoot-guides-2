/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.springrefdoc.quoteservices;

import com.yritys.springrefdoc.jdbc.JdbcConnection;
import com.yritys.springrefdoc.quoteservices.pojo.Quote;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Tommi
 */
@RestController
public class QuoteWebService {

    @Autowired
    private RestTemplate restTemplate;
    private Quote quote;
    @Autowired
    private JdbcConnection connection;

    public QuoteWebService() {
    }

    @PostConstruct
    public void init() {
        connection.createTable();
    }

    @Scheduled(fixedDelay = 5000)
    public void getQuote() {
        Quote quote = this.restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        connection.insertRow(quote.getValue().getId(), quote.getValue().getQuote());
        connection.getQuotes();
    }
}
