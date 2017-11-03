#include <LiquidCrystal_I2C.h>
#include <Wire.h>

LiquidCrystal_I2C lcd(0x3F, 16, 2);

void setup() {
  lcd.init();
  lcd.backlight();
}

void loop() {
  lcd.setCursor(0, 0);
  lcd.print("Studio");
  lcd.setCursor(7, 0);
  lcd.print("Berict");

  lcd.setCursor(0, 1);
  lcd.print("Quality");
  lcd.setCursor(8, 1);
  lcd.print("Software.");
}
