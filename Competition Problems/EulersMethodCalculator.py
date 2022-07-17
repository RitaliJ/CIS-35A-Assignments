import sympy
from sympy import *

#State what the program does
print("This program uses the Euler's Method technique to approximate solutions to differential equations.\n\n")

#Collect input
diff_eqn = input("What is the differential equation? Write in terms of x and y. Example functions:\n dy/dx = x - x*y\n\n")
diff_eqn = diff_eqn.split("=")[1] #take the expression, ignore the "y = " portion
x = sympy.symbols("x") #define x for expression
y = sympy.symbols("y") #define x for expression
diff_eqn = sympy.parse_expr(diff_eqn) #convert into sympy expression
print("Differential Equation: ", diff_eqn)
initial_condition = input("What is the initial condition? Example: 0,0\n")
xn = float(initial_condition.split(",")[0])
yn = float(initial_condition.split(",")[1])
#Request step and number of iterations
step = float(input("Enter the step size.\n"))
given_num_iterations = int(input("Enter number of iterations.\n"))

#Create equations
def F(x_n, y_n):
  result = diff_eqn.subs([(x, x_n), (y, y_n)])
  return result

def euler_formula(x_n, y_n, h):
  y_n_plus_1 = y_n + h*F(x_n, y_n)
  return y_n_plus_1

#Iterations
numIterations = 0
while(numIterations < given_num_iterations):
  #Print table values
  print("\nX" + str(numIterations) + " = " + str(xn))
  print("Y" + str(numIterations) + " = " + str(yn))
  print("F(xn, yn) = ", F(xn, yn))
  print("hF(xn, yn) = ", (step*F(xn, yn)))
  y_n_plus_1 = euler_formula(xn, yn, step)
  numIterations += 1
  print("Y" + str(numIterations) + " = " + str(y_n_plus_1))
  #update xn & yn
  xn += step
  yn = y_n_plus_1

print("\nAt X" + str(numIterations) + " = " + str(xn) + ", y is approximately = " + str(yn))
print("Note: Took ", numIterations, " iterations with step size of ", step)
