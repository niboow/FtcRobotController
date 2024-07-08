package org.firstinspires.ftc.teamcode.OpModes;

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
        servo.setDirection(DcMotorSimple.Direction.FORWARD);
        waitForStart();
        if (isStopRequested()) return;
        while(opModeIsActive()){
            servo.setPower(1);
        }
    }

    //testing everytioasdfkhasdf
    //testing push
    //testing push clone
}