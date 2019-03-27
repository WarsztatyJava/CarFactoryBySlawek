import enums.Brand;
import enums.EngineType;
import factories.CarFactory;
import factories.CarFactoryImpl;

public class Application {

    public static void main(String[] args) {

        CarFactory carFactory =  new CarFactoryImpl(Brand.OPEL,
                engineFactory.produce(EngineType.GASOLINE_1_2,
                enums.Colour.BLUE));
    }
}


//Zadanie - zaimplementować wzorzec fabryki oraz pozostałych części aplikacji aby
// można było wykonać taki kod
// i zostanie wygenerowany obiekt typu Car zgodnie z ustawionymi parametrami
//Car car = carFactory.produce(BRAND.OPEL, engineFactory.produce(EngineType.GASOLINE_1_2),enums.Colour.BLUE);
//CarFactory carFactory =  new CarFactoryImpl();