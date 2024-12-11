package org.landlord.abstract_factory.factory;

import org.landlord.abstract_factory.product.AbstractFreezer;
import org.landlord.abstract_factory.product.AbstractTV;
import org.landlord.abstract_factory.product.HairFreezer;
import org.landlord.abstract_factory.product.HairTV;

/**
 * 具体工厂

 **/
public class HairFactory implements AppliancesFactory {


    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}
