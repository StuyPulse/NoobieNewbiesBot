package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearPusherRetractCommand extends Command {

    public GearPusherRetractCommand() {
        requires(Robot.gearpusher);
    }

    protected void initialize() {
        Robot.gearpusher.retract();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

}
