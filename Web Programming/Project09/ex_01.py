import math

def cal_circle(r):
    area = math.pi * r * r
    cir_cum = 2 * math.pi * r
    return (area, cir_cum)

radius = float(input("Enter the size of a circle: "))
(a, c) = cal_circle(radius)
print("Area of the circle is " + str(a) + " and the circumference is " + str(c))
