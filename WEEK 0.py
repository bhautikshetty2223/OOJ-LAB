
class Student:
    def __init__(self):
        self.name = input("Enter the name: ")
        self.rno = int(input("Enter the roll number: "))
        self.mark1 = float(input("Enter the marks of first subject: "))
        self.mark2 = float(input("Enter the marks of second subject: "))
        self.mark3 = float(input("Enter the marks of third subject: "))

    def total_marks(self):
        total_marks = self.mark1 + self.mark2 + self.mark3
        print("\nThe total marks are:", total_marks)

    def display(self):
        print("\nDetails:")
        print("Name: ", self.name)
        print("Roll number:", self.rno)
        print("Marks in first subject:", self.mark1)
        print("Marks in second subject:", self.mark2)
        print("Marks in third subject:", self.mark3)
        print("Total marks:", self.mark1 + self.mark2 + self.mark3)

std1 = Student()
std1.total_marks()
std1.display()


class BankAccount:
    def __init__(self):
        self.name = input("Enter the account holder's name:")
        self.balance = float(input("Enter the balance:"))

    def deposit(self):
        dep = float(input("Enter the amount to be deposited:"))
        self.balance += dep

    def withdraw(self):
        withd = float(input("Enter the amount to be withdrawn:"))
        self.balance += withd

    def checkbal(self):
        print("\nName:", self.name)
        print("Balance:", self.balance)

ba1 = BankAccount()
ba1.deposit()
ba1.withdraw()
ba1.checkbal()

class Car:
    def __init__(self):
        self.model = input("Enter the car model:")
        self.year = int(input("Enter the car year:"))
        self.price = float(input("Enter the car price:"))
        self.fueleff = float(input("Enter the fuel efficiency (miles per gallon or km per liter):"))

    def display(self):
        print("\nDetails:")
        print("Model:", self.model)
        print("Year:", self.year)
        print("Price:", self.price)
        print("Fuel Efficiency:", self.fueleff)

car1 = Car()
car1.display()
        
        
