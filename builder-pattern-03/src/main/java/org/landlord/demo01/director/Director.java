package org.landlord.demo01.director;

import org.landlord.demo01.builder.BikeBuilder;
import org.landlord.demo01.product.Bike;

public class Director {

    public BikeBuilder bikeBuilder;

    public Director(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public Bike constructBike() {
        bikeBuilder.buildFrame();
        bikeBuilder.buildSeat();
        return bikeBuilder.createBike();
    }
}
