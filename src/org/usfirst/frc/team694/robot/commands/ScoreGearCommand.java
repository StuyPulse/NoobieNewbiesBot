package org.usfirst.frc.team694.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScoreGearCommand extends CommandGroup {

    public ScoreGearCommand() {
        addSequential(new GearTrapReleaseCommand());
        addSequential(new GearPusherRealeaseCommand());
    }

}