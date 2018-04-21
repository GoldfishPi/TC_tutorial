    package org.firstinspires.ftc.teamcode.gfp.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.gfp.states.servo.RampingServo;

/**
 * Created by t420 on 4/7/2018.
 */
@Autonomous(name="Servo Engine")
public class ServoEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new RampingServo(this,0.5,50));
    }
}