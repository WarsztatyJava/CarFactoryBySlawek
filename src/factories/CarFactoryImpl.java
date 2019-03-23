package factories;

import enums.Brand;
import enums.Colour;
import enums.EngineType;
import model.Engine;

public class CarFactoryImpl implements CarFactory {
    public CarFactory(Brand brand, EngineType engineType, Colour colour) {
        this.produce(Brand.OPEL, EngineType.GASOLINE_1_2 ,Colour.BLUE);

    }
}
