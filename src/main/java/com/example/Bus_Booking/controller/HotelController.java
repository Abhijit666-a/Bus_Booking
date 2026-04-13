package com.example.Bus_Booking.controller;

import com.example.Bus_Booking.model.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private static final List<Hotel> MOCK_HOTELS = new ArrayList<>();

    static {
        MOCK_HOTELS.add(new Hotel("ESSOTTO RECREATION HUB", "Hotel", "Bangalore", "Brookefield", 3.6, 1844, "Flash deal · 83% off", "₹1886", "₹324", "assets/demo_hotel_1.png"));
        MOCK_HOTELS.add(new Hotel("Loop by Zolo", "Hostel", "Bangalore", "Koramangala, Bangalore", 4.8, 227, "Flash deal · 62% off", "₹1116", "₹419", "assets/demo_hotel_2.png"));
        MOCK_HOTELS.add(new Hotel("UPAR Hotels Brookefield", "Apartment", "Bangalore", "Brookefield", 4.7, 120, "Flash deal · 49% off", "₹2340", "₹1196", "assets/demo_hotel_3.png"));
        MOCK_HOTELS.add(new Hotel("HOTEL SCARLET", "Hotel", "Bangalore", "ORR - Marathahalli", 3.3, 592, "Flash deal · 55% off", "₹3207", "₹1455", "assets/demo_hotel_4.png"));
        MOCK_HOTELS.add(new Hotel("FabHotel Atithi Residency - Nr....", "Hotel", "Bangalore", "Sarjapur Road (Near IT Hub Bellandur)", 3.7, 147, "Flash deal · 62% off", "₹3500", "₹1540", "assets/demo_hotel_5.png"));
    }

    @GetMapping("/search")
    public List<Hotel> searchHotels(@RequestParam(required = false) String city) {
        if (city == null || city.isEmpty()) {
            return MOCK_HOTELS;
        }
        return MOCK_HOTELS.stream()
                .filter(h -> h.getLocation().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}
