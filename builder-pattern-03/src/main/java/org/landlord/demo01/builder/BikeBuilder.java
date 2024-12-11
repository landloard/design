package org.landlord.demo01.builder;

import org.landlord.demo01.product.Bike;

public abstract class BikeBuilder {

    public Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

}
