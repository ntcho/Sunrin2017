#include <LiquidCrystal_I2C.h>
#include <Wire.h>
#include <SimpleDHT.h>

LiquidCrystal_I2C lcd(0x3F, 16, 2);

int pinDHT11 = 8;
SimpleDHT11 dht11;

void setup() {
  Serial.begin(9600);
  lcd.init();
  lcd.backlight();
}

void loop() {
  byte temperature = 0;
  byte humidity = 0;
  if (dht11.read(pinDHT11, &temperature, &humidity, NULL)) {
    Serial.println("Read DHT11 failed");
    return;
  }
  int t = (float) temperature;
  int h = (float) humidity;

  Serial.print(t); Serial.print(" C, ");
  Serial.print(h); Serial.println(" %");

  lcd.setCursor(0, 0); lcd.print(t);
  lcd.setCursor(2, 0); lcd.print(" C");
  
  lcd.setCursor(0, 1); lcd.print(h);
  lcd.setCursor(2, 1); lcd.print(" %");

  delay(100);
}
