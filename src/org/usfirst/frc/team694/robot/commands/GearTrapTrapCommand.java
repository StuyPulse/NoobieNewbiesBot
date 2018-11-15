package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearTrapTrapCommand extends Command {

    public GearTrapTrapCommand() {
        requires(Robot.m_geartrap);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.m_geartrap.trap();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled twzQZSASWSZ	`WS1Zo run
    protected void interrupted() {
    }
}
