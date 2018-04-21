package org.firstinspires.ftc.teamcode.gfp.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.gfp.states.motors.Motor;


/**
 * Created by t420 on 3/31/2018.
 */
@Autonomous(name="Test Engine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new Motor(this,0.8,600));
    }
}
