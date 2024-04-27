package com.microuser.controller;

import com.microuser.entities.Rating;
import com.microuser.service.impl.RatingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/rating/")
public class RatingController {
    @Autowired
    private RatingImpl ratingImpl;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return new ResponseEntity<>(this.ratingImpl.createRating(rating), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return new ResponseEntity<>(this.ratingImpl.getAllRating(), HttpStatus.OK);
    }


    @GetMapping("get/{userid}")
    public ResponseEntity<List<Rating>> getRatingByuserid(@PathVariable String userid){
        return new ResponseEntity<>(this.ratingImpl.getRatingByuserId(userid), HttpStatus.OK);
    }

    @GetMapping("hotel/{hotelid}")
    public ResponseEntity<List<Rating>> getRatingByhotelid(@PathVariable String hotelid){
        return new ResponseEntity<>(this.ratingImpl.getRatingbyHotelId(hotelid), HttpStatus.OK);
    }

}
