package org.firstinspires.ftc.teamcode.gfp.subengines;

import org.engine.Engine;
import org.engine.SubEngine;
import org.firstinspires.ftc.teamcode.gfp.states.motors.Motor;

public class ExampleSubEngine extends SubEngine {
    Engine engine;
    double value;
    public ExampleSubEngine(Engine engine, double value) {
        this.engine = engine;
        this.value = value;
    }
    @Override
    public void setProcesses() {
        addState(new Motor(engine, 0.5,500));
        addState(new Motor(engine, 0.5,500));
    }

    @Override
    public void evaluate() {
        if(value >= 15) {
            setRunable(true);
        }else {
            setRunable(false);
        }
    }
}
