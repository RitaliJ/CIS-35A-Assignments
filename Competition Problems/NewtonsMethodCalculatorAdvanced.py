import sympy
from sympy import *

#State what the program does
print("This program uses the Newton's Method technique to approximate zeroes of functions.\n\n")

#Collect input
function = input("What is the function? Write in terms of x. Example functions:\n y = 2*x**3 + x**2 - x + 1\n y = exp(x) - 5*x\n\n")
function = function.split("=")[1] #take the expression, ignore the "y = " portion
x = sympy.symbols("x") #define x for expression
function = sympy.parse_expr(function) #convert into sympy expression so derivative can be taken automatically
print("Function: ", function)
derivative = sympy.diff(function)
print("Derivative : ", derivative)
initial_guess = float(input("What is your initial guess for the function's zero?\n"))
#provide option to use Newton's method for a desired accuracy or given number of iterations
option_for_iterations = input("Type 'Q' to provide a desired accuracy or 'N' to provide a set number of iterations.\n").upper()
if(option_for_iterations == "Q"):
  global desired_accuracy
  desired_accuracy = float(input("What is the desired accuracy?\n"))
elif(option_for_iterations == "N"):
  global given_num_iterations
  given_num_iterations = int(input("Enter number of iterations.\n"))
else:
  print("Invalid Input.")
  exit()

#Create equations
def f(x_n):
  result = function.subs(x, x_n)
  return result
def df(x_n):
  result = derivative.subs(x, x_n)
  return result
def newton_formula(x):
  x_n_plus_1 = x - (f(x)/df(x))
  return x_n_plus_1

#Iterations
iterate = True #boolean to keep applying Newton's method
numIterations = 0
xn = initial_guess

while(iterate == True):
  print("\nX" + str(numIterations) + " = " + str(xn))
  print("Yn = ", f(xn))
  print("Y'n = ", df(xn))
  print("Yn/Y'n = ", f(xn)/df(xn))
  x_n_plus_1 = newton_formula(xn)
  print("X" + str(numIterations+1) + " = " + str(x_n_plus_1))
  numIterations += 1
  #check condition to stop iterating based on the option the user chose (accuracy vs given iterations)
  if((option_for_iterations == "Q" and abs(x_n_plus_1 - xn) < desired_accuracy)) or(option_for_iterations == "N" and (numIterations >= given_num_iterations)):
    iterate = False
  xn = x_n_plus_1

print("\nThe zero of the given function is: ", xn)
print("Note: Took ", numIterations, " iterations")
