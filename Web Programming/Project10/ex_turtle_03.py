import turtle

turtle.speed(100)

for shape in range(3, 10):
    turtle.color("black")

    for i in range(99):
        # triangle draw
        turtle.forward((i * i * i) / 1000)
        turtle.left(360 / shape)

    turtle.color("white")
    turtle.left(180 - (360 / shape))

    for j in range(99):
        # triangle erase
        k = 98 - j
        turtle.forward((k * k * k) / 1000)
        turtle.right(360 / shape)

    turtle.clear()
    turtle.left(360 / shape)

turtle.end_fill()
