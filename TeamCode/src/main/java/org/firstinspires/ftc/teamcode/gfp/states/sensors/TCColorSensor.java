package org.firstinspires.ftc.teamcode.gfp.states.sensors;

import com.qualcomm.robotcore.hardware.ColorSensor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 4/21/2018.
 */

public class TCColorSensor extends State {
    private ColorSensor colorSensor;
    private double value;
    public TCColorSensor(Engine engine,double value) {
        this.engine = engine;
        this.value = value;
    }
    @Override
    public void init(){
        colorSensor = engine.hardwareMap.colorSensor.get("myColorSensor");
    }
    @Override
    public void exec() {
        if(colorSensor.red() > value) {
            engine.telemetry.addData("Finished",true);
            setFinished(true);
        }else{
            engine.telemetry.addData("Color data",colorSensor.red());
        }
        engine.telemetry.update();
    }
}
