/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team694.robot;

import org.usfirst.frc.team694.robot.commands.GearTrapReleaseCommand;
import org.usfirst.frc.team694.robot.commands.ScoreGearCommand;
import org.usfirst.frc.team694.robot.commands.ShooterBrakeCommand;
import org.usfirst.frc.team694.robot.commands.ShooterShootCommand;
import org.usfirst.frc.team694.robot.commands.startWinchFast;
import org.usfirst.frc.team694.robot.commands.stopWinch;
import org.usfirst.frc.team694.util.Gamepad;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Gamepad driverGamepad;
	public Gamepad operatorGamepad;
	
	public OI() {
		driverGamepad = new Gamepad(0, Gamepad.GamepadSwitchMode.SWITCH_X);
		operatorGamepad = new Gamepad(1, Gamepad.GamepadSwitchMode.SWITCH_X);
		
		operatorGamepad.getRightButton().whenPressed(new GearTrapReleaseCommand());
		operatorGamepad.getTopButton().whenPressed(new ScoreGearCommand());
		
		operatorGamepad.getDPadDown().whenPressed(new ShooterBrakeCommand());
		operatorGamepad.getDPadLeft().whileHeld(new ShooterShootCommand());
		
		operatorGamepad.getLeftBumper().whileHeld(new startWinchFast());
		operatorGamepad.getLeftBumper().whenReleased(new stopWinch());
		
	}
	
}
