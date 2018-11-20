package org.usfirst.frc.team694.robot.commands.auton;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BasicMobilityCommand extends CommandGroup {

    public BasicMobilityCommand() {
        addSequential(new DrivetrainMoveInchesEncoderCommand(120, 0.5));
    }

}