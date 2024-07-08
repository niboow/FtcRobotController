package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Servo Test", group="Linear Opmode")
public class servo extends LinearOpMode {
    private CRServo servo;

    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize the servo
        servo = hardwareMap.get(CRServo.class, "test");
        servo.setDirection(DcMotorSimple.Direction.REVERSE);

        // Send telemetry message to signify robot waiting
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Set servo power
            servo.setPower(1);

            // Display the current servo power
            telemetry.addData("Servo Power", servo.getPower());
            telemetry.update();

            // Sleep for a short period to avoid running the loop too fast
            sleep(100);
        }

        // Stop the servo
        servo.setPower(0);
    }
}
