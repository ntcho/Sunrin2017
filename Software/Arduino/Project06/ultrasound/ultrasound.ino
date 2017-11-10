#define TRIG_PIN 2
#define ECHO_PIN 3

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  float duration, distance;
  digitalWrite(TRIG_PIN, HIGH);
  delay(10);
  digitalWrite(TRIG_PIN, LOW);

  duration = pulseIn(ECHO_PIN, HIGH);
  distance = ((float)(34000 * duration) / 1000000) / 2;

  Serial.print("Delta time : ");
  Serial.print(duration);
  Serial.print("\nDistance   : ");
  Serial.print(distance);
  Serial.print("cm\n");

  delay(500);
}
