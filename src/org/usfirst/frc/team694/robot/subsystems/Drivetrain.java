package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.DrivetrainDriveCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem {

    private WPI_TalonSRX leftTopMotor;
    private WPI_TalonSRX rightTopMotor;
    private WPI_TalonSRX leftBottomMotor;
    private WPI_TalonSRX rightBottomMotor;
    
    private SpeedControllerGroup leftMotors;
    private SpeedControllerGroup rightMotors;
    
    private DifferentialDrive differentialDrive;

    public Drivetrain() {
    	leftTopMotor = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_TOP_MOTOR);
    	rightTopMotor = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_TOP_MOTOR);
    	leftBottomMotor = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_BOTTOM_MOTOR);
    	rightBottomMotor = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BOTTOM_MOTOR);
    	
    	leftMotors = new SpeedControllerGroup(leftTopMotor, leftBottomMotor);
    	rightMotors = new SpeedControllerGroup(rightTopMotor, rightBottomMotor);
    	
    	differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new DrivetrainDriveCommand());
    }
    
    public double getLeftSpeed() {
    	return leftTopMotor.get();
    }
    
    public double getRightSpeed() {
    	return rightTopMotor.get();
    }

    public double getEncoderDistance() {
        return (leftBottomMotor.getSelectedSensorPosition(0) + rightBottomMotor.getSelectedSensorPosition(0)) / 2;
    }
    
    public double getSpeed() {
    	return Math.max(Math.abs(getLeftSpeed()), Math.abs(getRightSpeed()));
    }
    
    public void tankDrive(double leftspeed, double rightspeed) {
    	differentialDrive.tankDrive(leftspeed, rightspeed);
    }
    
    
}

