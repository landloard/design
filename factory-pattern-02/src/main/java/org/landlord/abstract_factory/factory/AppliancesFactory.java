package org.landlord.abstract_factory.factory;

import org.landlord.abstract_factory.product.AbstractFreezer;
import org.landlord.abstract_factory.product.AbstractTV;

/**
 * 抽象工厂: 在抽象工厂中可以声明多个工厂方法,用于创建不同类型的产品

 **/
public interface AppliancesFactory {

    AbstractTV createTV();  //工厂方法一

    AbstractFreezer createFreezer(); //工厂方法二
}
