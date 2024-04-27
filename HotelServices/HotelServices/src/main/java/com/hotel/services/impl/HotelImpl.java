package com.hotel.services.impl;

import com.hotel.entities.Hotel;
import com.hotel.repo.HotelRepo;
import com.hotel.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelImpl implements HotelServices {
    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return this.hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return this.hotelRepo.findAll();
    }

    @Override
    public Hotel updateHotel(String hotelid, Hotel hotel) {
        Hotel hotelById = this.hotelRepo.findByHotelid(hotelid);
        hotelById.setHotelname(hotel.getHotelname());
        hotelById.setHoteladdress(hotel.getHoteladdress());
        return this.hotelRepo.save(hotelById);
    }

    @Override
    public Hotel getHotelByid(String hotelid) {
        return this.hotelRepo.findByHotelid(hotelid);
    }

    @Override
    public void deleteHotel(String hotelid) {
        this.hotelRepo.deleteById(hotelid);
    }
}
