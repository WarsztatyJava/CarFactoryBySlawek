package model;


import enums.EngineType;
import factories.EngineFactory;

public class Engine implements EngineFactory {

    @Override
    public Engine produce(EngineType engineType) {
        return new Engine(engineType);  // ???
    }
}