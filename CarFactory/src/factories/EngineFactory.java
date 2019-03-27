package factories;

import enums.EngineType;
import model.Engine;

public interface EngineFactory {

    Engine produce(EngineType engineType);

}
