package org.firstinspires.ftc.teamcode.gfp.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.engine.State;
import org.firstinspires.ftc.teamcode.gfp.Challenges.RampingMotor;
import org.firstinspires.ftc.teamcode.gfp.states.motors.Motor;
import org.firstinspires.ftc.teamcode.gfp.states.sensors.TCColorSensor;
import org.firstinspires.ftc.teamcode.gfp.subengines.ExampleSubEngine;


/**
 * Created by t420 on 3/31/2018.
 */
@Autonomous(name="Test Engine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
        TCColorSensor colorSensor = new TCColorSensor(this, 1.0);
        addState(colorSensor);

        addSubEngine(new ExampleSubEngine(this,colorSensor.getValue()));
        //addState(new RampingMotor(this,2000,0.2,1.0));
    }
}
