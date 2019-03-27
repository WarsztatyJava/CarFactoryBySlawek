package factories;

import enums.Brand;
import enums.Colour;
import model.Car;
import model.Engine;

public class CarFactoryImpl implements CarFactory {


    @Override
    public Car produce(Brand brand, Engine engine, Colour colour) {
        return new Car(engine,colour,enums.Brand brand); //ciagle czepia sie tego brand
    }
}