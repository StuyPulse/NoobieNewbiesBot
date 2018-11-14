/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team694.robot;

import org.usfirst.frc.team694.robot.commands.GearTrapReleaseCommand;
import org.usfirst.frc.team694.util.Gamepad;
import org.usfirst.frc.team694.util.Gamepad.GamepadSwitchMode;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Gamepad driverGamepad;
	public Gamepad operatorGamepad;
	
	public OI() {
		driverGamepad = new Gamepad(0, GamepadSwitchMode.SWITCH_X);
		operatorGamepad = new Gamepad(1, GamepadSwitchMode.SWITCH_X);
		
		operatorGamepad.getRightButton().whenPressed(new GearTrapReleaseCommand());
	}
	
}
