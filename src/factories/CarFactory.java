package factories;

import enums.Brand;
import enums.Colour;
import model.Car;
import model.Engine;

public interface CarFactory {

    Car produce(Brand brand, Engine engine, Colour colour);

}