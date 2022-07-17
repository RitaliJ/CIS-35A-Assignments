#State what the program does
print("This program uses the Newton's Method technique to approximate zeroes of functions.\n\n")

#Collect input
function = input("What is the function? Write in terms of x. Example function is y = 2*x**3 + x**2 - x + 1 : \n")
function = function.split("=")[1]
print("Function: ", function)
derivative = input("Input the derivative of that function. Write in terms of x. Example function is dy/dx = 6*x**2 + 2*x - 1 : \n")
derivative = derivative.split("=")[1]
print("Derivative : ", derivative)
desired_accuracy = float(input("What is the desired accuracy?\n"))
initial_guess = float(input("What is your initial guess for the function's zero?\n"))

#Create equations
def f(x):
  result = eval(function)
  return result
def df(x):
  result = eval(derivative)
  return result
def newton_formula(x):
  x_n_plus_1 = x - (f(x)/df(x))
  return x_n_plus_1

#Iterations
iterate = True #boolean to keep applying Newton's method
numIterations = 0
xn = initial_guess

while(iterate == True):
  numIterations += 1
  x_n_plus_1 = newton_formula(xn)
  if(abs(x_n_plus_1 - xn) < desired_accuracy):
    iterate = False
  xn = x_n_plus_1

print("\nThe zero of the given function is: ", xn)
print("Note: Took ", numIterations, " iterations")

