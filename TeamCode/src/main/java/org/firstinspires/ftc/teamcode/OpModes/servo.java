package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class servo extends LinearOpMode {
    public CRServo servo;
    private long start;
    @Override
    public void runOpMode() throws InterruptedException {
        servo = hardwareMap.get(CRServo.class, "test");
        servo.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        if (isStopRequested()) return;
        while(opModeIsActive()){
            double i = System.currentTimeMillis();
            while (i < 1000 ) {
                servo.setPower(0.5);
            }
            pause(500);
            System.out.println(i);
            servo.setDirection(DcMotorSimple.Direction.FORWARD);
            while (System.currentTimeMillis() < 1000 ) {
                servo.setPower(0.5);
            }
        }
    }

    public void pause (double milliseconds) {
        start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < milliseconds && opModeIsActive()) {
            servo.setPower(0);
        }
    }

}