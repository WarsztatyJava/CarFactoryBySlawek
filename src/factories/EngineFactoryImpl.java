package factories;


import enums.EngineType;

public class EngineFactoryImpl implements EngineFactory {

    public EngineFactory(EngineType engineType){
        this.produce(EngineType.GASOLINE_1_2);
    }

}
