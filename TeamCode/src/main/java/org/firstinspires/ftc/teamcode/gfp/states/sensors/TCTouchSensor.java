package org.firstinspires.ftc.teamcode.gfp.states.sensors;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 5/5/2018.
 */

public class TCTouchSensor extends State {
    TouchSensor touchSensor;
    DcMotor dcMotor;
    public TCTouchSensor(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void init() {
        super.init();
        touchSensor = engine.hardwareMap.touchSensor.get("myTouchSensor");
        dcMotor = engine.hardwareMap.dcMotor.get("myDcMotor");
        dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    @Override
    public void exec() {
        if(touchSensor.isPressed()){
            dcMotor.setPower(1.0);
        }else {
            dcMotor.setPower(0.0);
        }
        engine.telemetry.update();
    }
}
