package com.microuser.service.impl;

import com.microuser.entities.Rating;
import com.microuser.repo.RatingRepo;
import com.microuser.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating createRating(Rating rating) {
        return this.ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return this.ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByuserId(String userid) {
        return this.ratingRepo.findByUserid(userid);
    }

    @Override
    public List<Rating> getRatingbyHotelId(String hotelid) {
        return this.ratingRepo.findByHotelid(hotelid);
    }
}
