package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirtY;

    public Room(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.price = 120.00;
        this.isOccupied = false;
        this.isDirtY = false;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirtY() {
        return isDirtY;
    }



    public boolean isAvailable() {
//        if (isOccupied || isDirtY) {
//            return false;
//        }
//        else {
//            return true;
//        }

//        return !(isOccupied || isDirtY);

        return (!isOccupied && !isDirtY);
    }

        @Override
        public String toString() {
            return "Room{" +
                    "numberOfBeds=" + numberOfBeds +
                    ", price=" + price +
                    ", isOccupied=" + isOccupied +
                    ", isDirtY=" + isDirtY +
                    ", isAvailable=" + isAvailable() +
                    '}';
        }


}
