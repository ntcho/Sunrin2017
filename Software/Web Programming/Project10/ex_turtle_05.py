import turtle

turtle.speed(50)
turtle.pensize(10)

color = ["black", "gray", "white", "gray"]

for i in range(120):
    for j in range(4):
        turtle.forward(100)
        turtle.left(360 / 4)
    turtle.left(6)
    turtle.color(color[i % len(color)])

turtle.end_fill()
