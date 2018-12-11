package org.usfirst.frc.team694.robot.commands.auton;

import org.usfirst.frc.team694.robot.commands.BlenderSpinCommand;
import org.usfirst.frc.team694.robot.commands.ShooterShootCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ShootBallsCommand extends CommandGroup {

    public ShootBallsCommand() {
        addSequential(new BlenderSpinCommand());
        addParallel(new ShooterShootCommand());
    }
}
