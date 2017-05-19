String inputString = "";
boolean stringComplete = false;

void setup() {
  Serial.begin(9600);
  // assigns 200 bytes of memory to inputString variable
  inputString.reserve(200);
  Serial.write("Good afternoon~~");
}

void loop() {
  if (stringComplete) {
    Serial.print(inputString);
    inputString = "";
    stringComplete = false;
  }
}

void serialEvent() {
  while (Serial.available()) {
    char inChar = (char)Serial.read();
    inputString += inChar;
    if (inChar == '\n') {
      stringComplete = true;
    }
  }
}

