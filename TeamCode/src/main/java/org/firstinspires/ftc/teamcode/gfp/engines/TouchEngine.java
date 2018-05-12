package org.firstinspires.ftc.teamcode.gfp.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.gfp.states.sensors.TCTouchSensor;

/**
 * Created by t420 on 5/5/2018.
 */
@Autonomous(name="TouchSensor")
public class TouchEngine extends Engine {

    @Override
    public void setProcesses() {
        addState(new TCTouchSensor(this));
    }
}
