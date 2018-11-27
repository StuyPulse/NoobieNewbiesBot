package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.commands.auton.DelaySecondsCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScoreGearCommand extends CommandGroup {

    public ScoreGearCommand() {
        addSequential(new GearTrapReleaseCommand());
        addSequential(new DelaySecondsCommand(0.5));
        addSequential(new GearPusherPushCommand());
    }

}