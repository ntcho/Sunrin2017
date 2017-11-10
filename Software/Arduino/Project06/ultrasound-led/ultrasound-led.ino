#define TRIG_PIN 2
#define ECHO_PIN 3
#define LED_PIN 4
#include <LiquidCrystal_I2C.h>
#include <Wire.h>

LiquidCrystal_I2C lcd(0x3F, 16, 2);

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);
  pinMode(LED_PIN, OUTPUT);
  
  lcd.init();
  lcd.backlight();
}

void loop() {
  // put your main code here, to run repeatedly:
  int distance = 0;

  digitalWrite(TRIG_PIN, HIGH);
  delay(10);
  digitalWrite(TRIG_PIN, LOW);
  distance = pulseIn(ECHO_PIN, HIGH) / 58;

  if (distance <= 10) {
    digitalWrite(LED_PIN, HIGH);
  } else {
    digitalWrite(LED_PIN, LOW);
  }
  
  if (dht11.read(pinDHT11, &temperature, &humidity, NULL)) {
    Serial.println("Read DHT11 failed");
    return;
  }

  lcd.setCursor(0, 0); lcd.print(distance);
  lcd.setCursor(0, 1); lcd.print("cm");

  delay(100);
}
