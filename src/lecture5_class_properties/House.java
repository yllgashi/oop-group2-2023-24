package lecture5_class_properties;

import java.time.LocalDate;

class House {
    // attributes
    private int length;
    private int width;
    private String owner;
    private int salePrice;
    private int rentPrice;
    private String address;
    private int yearBuilt;
    private int nrOfBathrooms;
    private int nrOfBedrooms;
    private boolean isSold;
    private boolean isRented;

    // properties
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getNrOfBathrooms() {
        return nrOfBathrooms;
    }

    public void setNrOfBathrooms(int nrOfBathrooms) {
        this.nrOfBathrooms = nrOfBathrooms;
    }

    public int getNrOfBedrooms() {
        return nrOfBedrooms;
    }

    public void setNrOfBedrooms(int nrOfBedrooms) {
        this.nrOfBedrooms = nrOfBedrooms;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }


    // other methods

    public void updateOwner(String owner) {
        this.owner = owner;
    }

    public int ageOfHouse() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - this.yearBuilt;
    }

    public int rentPrice() {
        return 100000;
    }

    public int rentPrice(int timeRented) {
        int monthlyMortage = 100;
        return monthlyMortage * timeRented;
    }

    public String isAvailable() {
        if (!isSold && !isRented) {
            return "lecture5_properties.House is available!";
        } else {
            return "lecture5_properties.House is not available!";
        }
    }

    public String calculateSizeOfHouse() {
        return length * width + " square feet.";
    }
}