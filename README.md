# NoobieNewbieRobot

This is a practice robot that the newbies will be creating in order to practice their coding skillz. It is an imitation of our 2017 Rafael robot. Each newbie will be working on a separate subsystem and practicing their github skills in order to work together to complete a robot.

## Requirements For Subsystems

- Instance of subsystem class inside Robot.java
- Port numbers for the necessary variables must be included in RobotMap.java
- Variables are initialized in the class, but defined within the constructor.
- Add DefaultCommand when necessary

## Requirements For Commands

- requires(subsystem) statement in the constructor
- initialize() if the command runs once, and execute() if the command will run repeatedly.

## Drivetrain

This is the first subsystem. It was coded together. It includes the methods initDefaultCommand(), tankdrive(), and getSpeed(). It includes four WPI_TalonSRX motors, two SpeedController variables, and one DifferentialDrive variable. The commands are DrivetrainDriveCommand (mapped to the joysticks on the driverpad).
