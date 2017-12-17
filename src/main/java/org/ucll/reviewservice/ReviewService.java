/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bram
 */
public class ReviewService {
    
    private List<Review> reviews;
    
    public ReviewService(){
        reviews = new ArrayList<>();
        createReviews();
    }
    
    public List<Review> getAll(){
        return this.reviews;
    }
    
    public List<Review> getForCity(String city){
        List<Review> result = new ArrayList<>();
        for(Review r : reviews){
            if(r.getCity().equals(city)){
                result.add(r);
            }
        }
        return result;
    }

    private void createReviews() {
        reviews.add(new Review("Leuven", "Gezellig!", 5));
        reviews.add(new Review("Brussel", "Leuk zeg!", 5));
        reviews.add(new Review("Brussel", "Niet leuk zeg!", 1));
        reviews.add(new Review("Hasselt", "Lekkere jenever!", 4));
        reviews.add(new Review("Antwerpen", "'t Stad is parking!", 1));
        reviews.add(new Review("Gent", "Mooi", 4));
        reviews.add(new Review("Brugge", "Ma how zeh!", 5));
        reviews.add(new Review("Brugge", "Schoon", 4));
        reviews.add(new Review("Leuven", "Klein en gezellig", 4));
        reviews.add(new Review("Antwerpen", "Meh..", 3));
    }
    
}
