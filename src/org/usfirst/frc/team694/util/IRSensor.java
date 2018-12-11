package org.usfirst.frc.team694.util;
import edu.wpi.first.wpilibj.AnalogInput;

public class IRSensor {
    AnalogInput irsensor;
    
    public IRSensor() {
	irsensor = new AnalogInput(IR_SENSOR_PORT);
    }
    public double getValue() {
	return irsensor.getValue();
    }
}
