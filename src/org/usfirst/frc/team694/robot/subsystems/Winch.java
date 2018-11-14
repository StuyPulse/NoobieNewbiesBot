package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team694.robot.commands.startWinchSlow;
import org.usfirst.frc.team694.robot.commands.stopWinch;

public class Winch extends Subsystem {

	private WPI_TalonSRX winchMotor;

	public Winch() {
		winchMotor = new WPI_TalonSRX(RobotMap.WINCHMOTOR);
	}

	// Put methods for controlling this subsystem here. Call these with commands.
  public void initDefaultCommand() {
  	setDefaultCommand(new stopWinch());
    // default command for a subsystem
    // setDefaultCommand(new MySpecialCommand());
  }

  public void startWinchHigh() {
  	winchMotor.set(1.0);
  }
  public void startWinchLow() {
  	winchMotor.set(0.3);
  }
  public void stopWinch() {
  	winchMotor.set(0.0);
  }

}
