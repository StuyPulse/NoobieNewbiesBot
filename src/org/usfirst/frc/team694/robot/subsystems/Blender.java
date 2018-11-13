package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.Spin;
import org.usfirst.frc.team694.robot.commands.SpinBackwards;
import org.usfirst.frc.team694.robot.commands.Stop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Blender extends Subsystem {
	
	public Blender() {
		centerMotor = new WPI_TalonSRX(RobotMap.BLENDER_CENTER_WHEEL_MOTOR);
		outerMotor = new WPI_TalonSRX(RobotMap.BLENDER_OUTER_WHEEL_MOTOR);
	}
	
	private WPI_TalonSRX centerMotor;
	private WPI_TalonSRX outerMotor;
	
	public void spin() {
		centerMotor.set(1.0);
		outerMotor.set(0.5);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	

}
