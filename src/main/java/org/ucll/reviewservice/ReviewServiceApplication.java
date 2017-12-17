/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author Bram
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReviewServiceApplication {
    
    private static ReviewController controller;
    
    public static void main(String[] args){
        controller = new ReviewController();
        SpringApplication.run(ReviewServiceApplication.class, args);
    }
}
