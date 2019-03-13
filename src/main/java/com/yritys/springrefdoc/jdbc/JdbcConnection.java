/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.springrefdoc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tommi
 */
@Component
public class JdbcConnection {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     Drops table
     */
    public void dropTable(){
        this.jdbcTemplate.execute("DROP TABLE quotes IF EXISTS");
    }
    
    public void createTable(){
        this.jdbcTemplate.execute("CREATE TABLE quotes(id SERIAL, quote VARCHAR(255))");
    }
    
    public void insertRow(Long id, String quote){
        this.jdbcTemplate.update("INSERT INTO quotes(id, quote) VALUES (?,?)", id, quote);
    }
    
    public void getQuotes(){
        this.jdbcTemplate.query("Select * from quotes", (rse, row) -> new MotivationalQuote(rse.getLong("id"), rse.getString("quote"))).forEach(motivationalQuote -> System.out.println(motivationalQuote.toString()));
    }
}
