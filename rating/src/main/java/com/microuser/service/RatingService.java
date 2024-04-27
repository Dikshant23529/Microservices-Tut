package com.microuser.service;

import com.microuser.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByuserId(String userid);

    List<Rating> getRatingbyHotelId(String hotelid);

}
