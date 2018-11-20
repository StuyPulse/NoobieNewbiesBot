package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;


public class DrivetrainMoveInchesEncoderCommand extends Command {

    protected double targetDistance;
    protected double speed;

    public DrivetrainMoveInchesEncoderCommand(double targetDistance, double speed) {
        requires(Robot.drivetrain);
        this.targetDistance = targetDistance;
        this.speed = speed;
    }

    protected void initialize() {
        targetDistance += Robot.drivetrain.getEncoderDistance();
    }

    protected void execute() {
        Robot.drivetrain.tankDrive(speed, speed);
    }

    protected boolean isFinished() {
        if(Robot.drivetrain.getEncoderDistance() == targetDistance) return true;
    }

}