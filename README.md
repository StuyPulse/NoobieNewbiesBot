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

## Blender

This is a spinny boi. It consists of 2 motors. The methods are run(), which sets the motor speeds, runBackwards(), and stop(). The commands are Spin, Stop and SpinBackward

## Gear Pusher

This consists of one solenoid. It's methods are push(), retract() and toggle(). It also has a boolean that will return true when the pusher is pushed, and false when the pusher is stationary. You will need to go into the OI and map it to a button. Its commands are PushGear, RetractGear and Toggle.

## Gear Trap

This consists of one solenoid. Its methods are trap(), and release(), and it has a boolean to return which position it is in. Its commands are Trap, and Release.

## Winch

This consists of one motor. Its methods are StartWinchFast(), which sets the winch to a speed of 1.0, startWinchSlow(), which sets the winch to a speed of 0.3, and stopWinch() which sets the winch to a speed of 0.0. It has commands that do all of that too.
