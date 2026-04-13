package com.example.Bus_Booking.model;

public class Hotel {
    private String name;
    private String type;
    private String location;
    private String subLocation;
    private double rating;
    private int reviews;
    private String discountRibbon;
    private String oldPrice;
    private String newPrice;
    private String imagePath;

    public Hotel() {}

    public Hotel(String name, String type, String location, String subLocation, double rating, int reviews, String discountRibbon, String oldPrice, String newPrice, String imagePath) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.subLocation = subLocation;
        this.rating = rating;
        this.reviews = reviews;
        this.discountRibbon = discountRibbon;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.imagePath = imagePath;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getSubLocation() { return subLocation; }
    public void setSubLocation(String subLocation) { this.subLocation = subLocation; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public int getReviews() { return reviews; }
    public void setReviews(int reviews) { this.reviews = reviews; }
    public String getDiscountRibbon() { return discountRibbon; }
    public void setDiscountRibbon(String discountRibbon) { this.discountRibbon = discountRibbon; }
    public String getOldPrice() { return oldPrice; }
    public void setOldPrice(String oldPrice) { this.oldPrice = oldPrice; }
    public String getNewPrice() { return newPrice; }
    public void setNewPrice(String newPrice) { this.newPrice = newPrice; }
    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
}
