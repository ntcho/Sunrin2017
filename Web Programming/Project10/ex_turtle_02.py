import turtle

turtle.speed(100)
turtle.penup()
turtle.setx(-200)
turtle.sety(-150)
turtle.pendown()

for i in range(50):
    # triangle draw
    turtle.forward(500 - i * 10)
    turtle.left(360 / 3)

turtle.end_fill()
