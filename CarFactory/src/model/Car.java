package model;

import enums.EngineType;
import enums.Brand;
import enums.Colour;
import factories.CarFactory;


public class Car {

    Car car = CarFactory.produce(enums.Brand.OPEL, engineFactory.produce(EngineType.GASOLINE_1_2), enums.Colour.BLUE);
// metoda produce jest non-static?
}