import turtle
import math

x1 = turtle.Turtle()
t1 = turtle.Turtle()
t2 = turtle.Turtle()

turtle.bgcolor("grey")
t1.speed(0)

x = 0

t1.penup()
t2.penup()
x1.penup()
t1.goto(-100, math.sin(0) * 50)
t2.goto(-100, math.cos(0) * 50)
x1.goto(-100, 0)
t1.color("red")
t2.color("blue")
x1.color("black")
t1.pendown()
t2.pendown()
x1.pendown()

while x < 10:
    x += 0.1
    t1.goto(x * 50 - 100, math.sin(x) * 50)
    t2.goto(x * 50 - 100, math.cos(x) * 50)
    x1.goto(x * 50 - 100, 0)

turtle.end_fill()
