package org.firstinspires.ftc.teamcode.gfp.states.servo;

import com.qualcomm.robotcore.hardware.Servo;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 4/7/2018.
 */

public class ServoState extends State {
    private Servo armServo;
    private double position;

    public ServoState(Engine engine) {
        this.engine = engine;
        this.position = 0.0;//
    }
    public ServoState(Engine engine,double position) {
        this.engine = engine;
        this.position = position;
    }
    @Override
    public void init(){
        armServo = engine.hardwareMap.servo.get("servo");
    }
    @Override
    public void exec() {
        armServo.setPosition(position);
        setFinished(true);
    }
}