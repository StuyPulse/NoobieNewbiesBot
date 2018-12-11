package org.usfirst.frc.team694.robot.commands.auton;

import org.usfirst.frc.team694.robot.commands.GearPusherPushCommand;
import org.usfirst.frc.team694.robot.commands.GearPusherRetractCommand;
import org.usfirst.frc.team694.robot.commands.GearTrapReleaseCommand;
import org.usfirst.frc.team694.robot.commands.GearTrapTrapCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ScoreGearCenterPegCommand extends CommandGroup {

    public ScoreGearCenterPegCommand() {
    	//TODO: Code the DrivetrainMoveInchesEncoderCommand & slap Winston
        addSequential(new DrivetrainMoveInchesEncoderCommand(120, 0.5));
        addSequential(new GearTrapReleaseCommand());
        addSequential(new DelaySecondsCommand(0.5));
        addSequential(new GearPusherPushCommand());
        addSequential(new DelaySecondsCommand(0.5));
        addSequential(new GearPusherRetractCommand());
        addSequential(new GearTrapTrapCommand());
    }
}
