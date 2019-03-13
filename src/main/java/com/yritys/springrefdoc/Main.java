/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.springrefdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Tommi
 * 
 * ALA TEKEMÄÄN TÄLLÄ PROJECKTILLA:
 * https://spring.io/guides/
 * 
 * - Yks kerrallaan guidet läpi :)
 */
@SpringBootApplication
@EnableScheduling
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
