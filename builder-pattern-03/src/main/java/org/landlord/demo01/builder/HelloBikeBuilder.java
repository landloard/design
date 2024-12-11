package org.landlord.demo01.builder;

import org.landlord.demo01.product.Bike;

public class HelloBikeBuilder extends BikeBuilder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
