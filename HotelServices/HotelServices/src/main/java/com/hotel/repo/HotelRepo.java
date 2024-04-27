package com.hotel.repo;

import com.hotel.entities.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepo extends MongoRepository<Hotel, String> {

    Hotel findByHotelid(String hotelid);

}
