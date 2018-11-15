package org.usfirst.frc.team694.robot.subsystems;
import org.usfirst.frc.team694.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Geartrap extends Subsystem {

	private Solenoid gearTrap;
	private boolean trapped;
	
	public Geartrap(){
		gearTrap = new Solenoid(RobotMap.GEAR_TRAP_SOLENOID_PORT);
		gearTrap.set(true);
		trapped = true;
	}

	public void trap() {
		gearTrap.set(true);
		trapped = true;
	}
	public void release() {
		gearTrap.set(false);
		trapped = false;
	}
	public boolean position() {
		return trapped;
	}
    public void initDefaultCommand() {
    }
}

