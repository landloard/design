package org.landlord.demo01.builder;

import org.landlord.demo01.product.Bike;

public class MoBikeBuilder extends BikeBuilder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
