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
            servo.setPower(0.5);

//            double time_curr = System.currentTimeMillis();
//            double time_new = 0;
//            while(time_curr < )

            servo.setDirection(DcMotorSimple.Direction.FORWARD);

//            servo.setPower(-1);
        }
    }

    public void pause (double milliseconds) {
        start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < milliseconds && opModeIsActive()) {
            servo.update();
        }
    }

    public void update() {
        START_LOOP();
        Globals.gotBloodyAnnihilated = System.currentTimeMillis() - Globals.autoStartTime > 29500 && Globals.autoStartTime != -1 && deposit.slides.length > 1;
        updateSubsystems();
        updateTelemetry();
    }

    //testing everytioasdfkhasdf
    //testing push
    //testing push clone
}