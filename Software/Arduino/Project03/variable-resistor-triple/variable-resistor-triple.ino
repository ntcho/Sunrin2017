int pot1 = 0;
int pot2 = 1;
int pot3 = 2;

int r = 3;
int g = 4;
int b = 5;

int val1;
int val2;
int val3;

void setup() {
  pinMode(r,OUTPUT);
  pinMode(g,OUTPUT);
  pinMode(b,OUTPUT);
}
 
void loop() {
  // put your main code here, to run repeatedly:
  val1 = analogRead(pot1);
  val2 = analogRead(pot2);
  val3 = analogRead(pot3);
  analogWrite(r,val1);
  analogWrite(g,val2);
  analogWrite(b,val3);
}
