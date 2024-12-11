package org.landlord.abstract_factory.factory;

import org.landlord.abstract_factory.product.AbstractFreezer;
import org.landlord.abstract_factory.product.AbstractTV;
import org.landlord.abstract_factory.product.HisenseFreezer;
import org.landlord.abstract_factory.product.HisenseTV;

/**

 **/
public class HisenseFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
