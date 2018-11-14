package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearPusherToggleCommand extends Command {

    public GearPusherToggleCommand() {
        requires(Robot.gearpusher);
    }

    protected void initialize() {
        Robot.gearpusher.toggle();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

}
