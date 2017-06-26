class Employee(object):
    def __init__(self, first, last, pay):
        self.first = first
        self.last = last
        self.pay = pay
        self.email = first.lower() + '.' + last.lower() + '@sunrin.hs.kr'
        
    def full_name(self):  
        return '{} {}'.format(self.first, self.last)

emp_1 = Employee('kildong', 'hong', 50000)
emp_2 = Employee('kilsun', 'hong', 60000)

# emp_1의 풀네임 출력
print(emp_1.full_name())
