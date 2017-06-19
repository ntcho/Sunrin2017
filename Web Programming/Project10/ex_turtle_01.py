import turtle

turtle.speed(5)

for i in range(6):
    # hexagon draw
    turtle.forward(50)
    turtle.left(60)

turtle.penup()
turtle.setx(-100)
turtle.sety(0)
turtle.pendown()

for i in range(5):
    turtle.forward(50)
    turtle.left(108 + 36)

turtle.penup()
turtle.setx(100)
turtle.sety(0)
turtle.pendown()

for i in range(3):
    for j in range(4) :
        turtle.forward(50)
        turtle.left(90)
    turtle.right(30)

turtle.end_fill()
turtle.hideturtle()
