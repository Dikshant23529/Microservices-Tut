package com.hotel.services;

import com.hotel.entities.Hotel;

import java.util.List;

public interface HotelServices {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel updateHotel(String hotelid, Hotel hotel);

    Hotel getHotelByid(String hotelid);

    void deleteHotel(String hotelid);

}
