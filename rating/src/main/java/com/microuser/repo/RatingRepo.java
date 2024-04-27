package com.microuser.repo;

import com.microuser.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating, String> {

    List<Rating> findByUserid(String userid);
    List<Rating> findByHotelid(String hotelid);

}
