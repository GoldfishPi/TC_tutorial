package org.firstinspires.ftc.teamcode.gfp.states.servo;

import com.qualcomm.robotcore.hardware.Servo;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by t420 on 4/7/2018.
 */

public class RampingServo extends State {
    private Servo servo;
    private double position;
    boolean firstRun = true;
    double startingPosition;
    int rampDelay;
    public RampingServo(Engine engine, double position,int rampDelayms ){
        this.engine = engine;
        this.position = position;
        this.rampDelay = rampDelayms;
    }
    public void init(){
        this.servo = engine.hardwareMap.servo.get("servo");
    }

    @Override
    public void exec() {
        if(firstRun) {
            position = servo.getPosition();
        }
        if(servo.getPosition() < position){
            position ++;
            servo.setPosition(position);
            sleep(rampDelay);
        }else{
            setFinished(true);
        }
    }
}
