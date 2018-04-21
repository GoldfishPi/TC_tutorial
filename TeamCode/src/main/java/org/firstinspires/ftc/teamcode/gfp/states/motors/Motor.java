package org.firstinspires.ftc.teamcode.gfp.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 4/14/2018.
 */

public class Motor extends State {
    private DcMotor motor;
    private double power;
    private int ticks;

    public Motor(Engine engine, double power,int ticks) {
        this.engine = engine;
        this.power = power;
        this.ticks = ticks;
    }

    @Override
    public void init() {
        motor = engine.hardwareMap.dcMotor.get("myDcMotor");
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    @Override
    public void exec() {
        motor.setTargetPosition(ticks);
        motor.setPower(power);
        engine.telemetry.addData("Ticks",motor.getCurrentPosition());
        engine.telemetry.update();
    }
}
