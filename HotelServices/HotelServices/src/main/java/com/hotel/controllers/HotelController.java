package com.hotel.controllers;

import com.hotel.entities.Hotel;
import com.hotel.services.impl.HotelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/hotel/")
public class HotelController {

    @Autowired
    private HotelImpl hotelImpl;

    @PostMapping
    public ResponseEntity<Hotel> createhotel(@RequestBody Hotel hotel) {
        return new ResponseEntity<>(this.hotelImpl.createHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping("get/{hotelid}")
    public ResponseEntity<Hotel> getHotelByid(@PathVariable String hotelid) {
        return new ResponseEntity<>(this.hotelImpl.getHotelByid(hotelid), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return new ResponseEntity<>(this.hotelImpl.getAllHotel(), HttpStatus.OK);
    }

    @PutMapping("update/hotelid")
    public ResponseEntity<Hotel> updateHotel(@PathVariable String hotelid, @RequestBody Hotel hotel) {
        return new ResponseEntity<>(this.hotelImpl.updateHotel(hotelid, hotel), HttpStatus.OK);
    }

}
