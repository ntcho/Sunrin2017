int LED = 13;
void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {
  digitalWrite(LED, HIGH);
  delay(8);
  digitalWrite(LED, LOW);
  delay(8);
}
