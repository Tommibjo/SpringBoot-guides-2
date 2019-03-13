/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.springrefdoc.jdbc;

/**
 *
 * @author Tommi
 */
public class MotivationalQuote {

    private Long id;
    private String quote;

    public MotivationalQuote(Long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "MotivationalQuote{" + "id=" + id + ", quote=" + quote + '}';
    }

}
