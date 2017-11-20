#include <Servo.h>

Servo servo;

int servopin = 9;
int poten = 0;
int angle;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  servo.attach(servopin);
}

void loop() {
  // put your main code here, to run repeatedly:
  angle = map(analogRead(poten), 0, 1023, 0, 179);
  Serial.println("angle : ");
  servo.write(angle);
  delay(100);
}
