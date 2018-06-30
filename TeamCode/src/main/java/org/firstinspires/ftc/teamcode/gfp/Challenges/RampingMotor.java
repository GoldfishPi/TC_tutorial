package org.firstinspires.ftc.teamcode.gfp.Challenges;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

public class RampingMotor extends State {

    DcMotor motor;
    int ticks;
    double ramp;
    int rampTime;
    double endPower;
    double currentPower = 0.1;
    int index = 1;
    int rampTicks;

    public RampingMotor(Engine engine, int ticks, double ramp, double power) {
        this.engine = engine;
        this.ticks = ticks;
        this.ramp = ramp;
        this.endPower = power;

        rampTicks =(int) ramp*ticks;
        rampTime = (int)(rampTicks/(power/0.01));
    }


    @Override
    public void init() {
        super.init();
        motor = engine.hardwareMap.dcMotor.get("motor");
    }

    @Override
    public void exec() {
        if(motor.getCurrentPosition() < rampTicks && motor.getCurrentPosition() >= rampTime*index) {
            currentPower += 0.01;
            index++;
        }else if(motor.getCurrentPosition() >= ticks-(rampTime*index)) {
            currentPower -= 0.1;
            index--;
        }

        if(motor.getCurrentPosition() >= ticks) {
            motor.setPower(0);
            setFinished(true);
        }
        motor.setPower(currentPower);
    }
}
