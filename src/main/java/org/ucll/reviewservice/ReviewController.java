/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bram
 */
@RestController
public class ReviewController {
    
    private ReviewService service;
    
    public ReviewController(){
        this.service = new ReviewService();
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Review> getAll(){
        return service.getAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/{city}")
    public List<Review> getForCity(@PathVariable String city){
        return service.getForCity(city);
    }
    
}
