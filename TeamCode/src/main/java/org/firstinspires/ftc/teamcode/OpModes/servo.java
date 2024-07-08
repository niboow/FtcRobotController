package org.firstinspires.ftc.teamcode.OpModes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class servo extends LinearOpMode {
    public CRServo servo;

    @Override
    public void runOpMode() throws InterruptedException {

        servo = hardwareMap.get(CRServo.class, "test");
        servo.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();

        if (isStopRequested()) return;

        while(opModeIsActive()){
            servo.setPower(1);
        }
    }

    //testing push
    //testing push clone
}