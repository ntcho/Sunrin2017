#include <Servo.h>

Servo servo;

int servopin = 9;

void setup() {
  // put your setup code here, to run once:
  servo.attach(servopin);
}

void loop() {
  servo.write(0);
  delay(500);
  servo.write(90);
  delay(500);
  servo.write(179);
  delay(500);
  servo.write(90);
  delay(500);
}
