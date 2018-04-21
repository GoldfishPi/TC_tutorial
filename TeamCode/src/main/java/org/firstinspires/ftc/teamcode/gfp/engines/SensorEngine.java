package org.firstinspires.ftc.teamcode.gfp.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.gfp.states.sensors.TCColorSensor;

/**
 * Created by t420 on 4/21/2018.
 */
@Autonomous(name = "Sensor Engine")
public class SensorEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new TCColorSensor(this,14));
    }
}
