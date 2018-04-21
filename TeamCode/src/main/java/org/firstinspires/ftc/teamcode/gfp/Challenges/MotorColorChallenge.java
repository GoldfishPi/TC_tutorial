package org.firstinspires.ftc.teamcode.gfp.Challenges;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 4/21/2018.
 */

public class MotorColorChallenge extends State {
    DcMotor motor;
    ColorSensor colorSensor;
    Servo servo;
    public MotorColorChallenge(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void init() {
        motor = engine.hardwareMap.dcMotor.get("motor");
        colorSensor = engine.hardwareMap.colorSensor.get("colorSensor");
        servo = engine.hardwareMap.servo.get("servo");
    }

    @Override
    public void exec() {
        if( colorSensor.blue() < 5){
            motor.setPower((colorSensor.red()*0.05));
        }
        else if(colorSensor.red() < 5 && colorSensor.blue() > 20){
            motor.setPower(0.0);
        }else {
           motor.setPower(0.0);
           servo.setPosition(1.0);
           sleep(500);
           servo.setPosition(0.0);
        }
    }
}
