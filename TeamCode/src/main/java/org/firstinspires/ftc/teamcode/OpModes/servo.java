package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;

public class servo extends OpMode{
    public CRServo servo;

    @Override
    public void init() {
        servo = hardwareMap.get(CRServo.class, "servo");

    }

    @Override
    public void loop() {
        if(gamepad1.a){
            servo.setPower(1);
        }
        if(gamepad1.b){
            servo.setPower(-1);
        }
        servo.setPower(0);

    }

    //testing push clone
}
