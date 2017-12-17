/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucll.reviewservice;

/**
 *
 * @author Bram
 */
public class Review {
    
    private String city, review;
    private int rating;
    
    public Review(){
        
    }
    
    public Review(String city, String review, int rating){
        setCity(city);
        setReview(review);
        setRating(rating);
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setReview(String review){
        this.review = review;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getReview(){
        return this.review;
    }
    
    public int getRating(){
        return this.rating;
    }
    
}
