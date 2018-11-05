package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivetrainDriveCommand extends Command {

    public DrivetrainDriveCommand() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.tankDrive(Robot.oi.driverGamepad.getLeftY(), Robot.oi.driverGamepad.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }
    
}
