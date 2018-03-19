package com.example.android.tourguide;


public class Places {
    private int namePlaces;
    private int descriptionPlaces;
    private int imageOfPlaces;

    public Places(int namePlaces, int descriptionPlaces, int imageOfPlaces) {
        this.namePlaces = namePlaces;
        this.descriptionPlaces = descriptionPlaces;
        this.imageOfPlaces = imageOfPlaces;
    }


    public int getNamePlaces() {
        return this.namePlaces;
    }

    public int getDescriptionPlaces() {
        return this.descriptionPlaces;
    }

    public int getImageOfPlaces() {
        return this.imageOfPlaces;
    }

}
