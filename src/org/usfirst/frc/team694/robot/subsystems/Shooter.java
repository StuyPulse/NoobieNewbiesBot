package org.usfirst.frc.team694.robot.subsystems;


import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private WPI_TalonSRX motorX;
	private WPI_TalonSRX motorY;
	
	
    public Shooter() {
    		motorX = new WPI_TalonSRX(-1);
    		motorY = new WPI_TalonSRX(-1);
    		motorX.setInverted(true);
    		motorY.setInverted(true);
    		motorX.setNeutralMode(NeutralMode.Brake);
    		motorY.setNeutralMode(NeutralMode.Brake);
    	
    }
    
    public void initDefaultCommand() {
    	
    }
    
    public void setSpeed(double speed) {
    		motorX.set(speed);
    		motorY.set(speed);
    }
    public void brake() {
    		motorX.set(0.0);
    		motorY.set(0.0);
    }
    public double getSpeed () {
    		return Math.max(motorX.get() , motorY.get());
    }
}