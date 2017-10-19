int potpin = 0;
int ledpin = 10;
int val;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledpin, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  val = analogRead(potpin);
  analogWrite(ledpin, val/4);
}

