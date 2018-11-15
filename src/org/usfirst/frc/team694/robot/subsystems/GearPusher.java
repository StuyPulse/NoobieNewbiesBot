package org.usfirst.frc.team694.robot.subsystems;
import org.usfirst.frc.team694.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearPusher extends Subsystem {

    private Solenoid gearPusher;
    private boolean isPushed;

    public GearPusher () {
        gearPusher = new Solenoid(RobotMap.GEARPUSHER_GEARPUSHER);
    }
    public void push() {
        gearPusher.set(true);
        isPushed = true;
    }
    public void retract() {
        gearPusher.set(false);
        isPushed = false;
    }
    public void toggle() {
        if (isPushed) {
            gearPusher.set(false);
            isPushed = false;
        }
        else {
            gearPusher.set(true);
            isPushed = true;
        }
    }
	@Override
	protected void initDefaultCommand() {
		
	}
}
