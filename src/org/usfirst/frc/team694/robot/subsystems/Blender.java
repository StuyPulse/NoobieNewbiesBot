package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.Spin;
import org.usfirst.frc.team694.robot.commands.SpinBackwards;
import org.usfirst.frc.team694.robot.commands.Stop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Blender extends Subsystem {
	
	public Blender() {
		centerMotor = new WPI_TalonSRX(RobotMap.BLENDER_CENTER_PORT);
		wheelMotor = new WPI_TalonSRX(RobotMap.BLENDER_WHEEL_PORT);
		
		spinCommand = new Spin();
		spinBackwardsCommand = new SpinBackwards();
		stopCommand = new Stop();
	}
	
	public WPI_TalonSRX centerMotor;
	public WPI_TalonSRX wheelMotor;
	
	public Spin spinCommand;
	public SpinBackwards spinBackwardsCommand;
	public Stop stopCommand;
	
	public int direction = 0;
	
	public void run() {
		if (direction == -1) {
			spinBackwardsCommand.cancel();
		}
		spinCommand.start();
		direction = 1;
	}
	
	public void runBackwards() {
		if (direction == 1) {
			spinCommand.cancel();
		}
		spinBackwardsCommand.start();
		direction = -1;
	}
	
	public void stop() {
		if (direction == -1) {
			spinBackwardsCommand.cancel();
		} else if (direction == 1) {
			spinCommand.cancel();
		}
		stopCommand.start();
		direction = 0;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	

}
