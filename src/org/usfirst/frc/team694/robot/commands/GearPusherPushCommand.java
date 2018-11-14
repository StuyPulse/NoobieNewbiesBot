package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearPusherPushCommand extends Command {

    public GearPusherPushCommand() {
        requires(Robot.gearpusher);
    }

    protected void initialize() {
        Robot.gearpusher.push();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

}
