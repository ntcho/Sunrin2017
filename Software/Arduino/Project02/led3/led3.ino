int r = 8;
int y = 9;
int g = 10;

int rin = 5;
int yin = 6;
int gin = 7;

int rv;
int yv;
int gv;

void setup() {
  // put your setup code here, to run once:
  pinMode(r, OUTPUT);
  pinMode(y, OUTPUT);
  pinMode(g, OUTPUT);
  pinMode(rin, INPUT);
  pinMode(yin, INPUT);
  pinMode(gin, INPUT);
}

void turnOn(int led, bool isOn) {
  if (isOn) {
    digitalWrite(led, HIGH);
  } else {
    digitalWrite(led, LOW);
  }
}

void loop() {
  // put your main code here, to run repeatedly:
  gv = digitalRead(gin);
  turnOn(g, gv);
  yv = digitalRead(yin);
  turnOn(y, yv);
  rv = digitalRead(rin);
  turnOn(r, rv);
  //if (gv == LOW)
  //  digitalWrite(ledpin, LOW);
  // else
  //  digitalWrite(ledpin, HIGH);
}

