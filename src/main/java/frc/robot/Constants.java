// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final Mode currentMode = Mode.REAL;

  public static int FrontLeftDriveMotorId = 47;
  public static int FrontLeftSteerId = 48;
  public static int FrontRightDriveMotorId = 56;
  public static int FrontRightSteerId = 57;
  public static int BackLeftDriveMotorId = 50;
  public static int BackLeftSteerId = 51;
  public static int BackRightDriveMotorId = 53;
  public static int BackRightSteerId = 54;

  public static int CANCoderFrontLeftId = 10;
  public static int CANCoderFrontRightId = 11;
  public static int CANCoderBackLeftId = 12;
  public static int CANCoderBackRightId = 13;
  public static int PigeonId = 61;

  // public static double FrontLeftEncoderOffset = 0.3;
  // public static double FrontRightEncoderOffset = 0.5;
  public static double FrontLeftEncoderOffset = 0.061;
  public static double FrontRightEncoderOffset = -0.248;

  public static double BackLeftEncoderOffset = 0.061;
  public static double BackRightEncoderOffset = 0.08;



  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }
}
