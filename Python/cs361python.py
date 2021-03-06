# -*- coding: utf-8 -*-
"""cs361python.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1ecUbbrhoPIIG1ICkH05upV6U6tHQvYMX

# Exercise 1
"""

5/3

5%3

5.0/3

5/3.0

5.2%3

"""# Exercise 2"""

2000.3**200

1.0+1.0-1.0

1.0+1.0e20-1.0e20

"""# Exercise 3"""

float(123)

float('123')

float('123.23')

int(123.23)

int('123.23')

int(float(123.23))

str(12)

str(12.2)

bool('a')

bool(0)

bool(0.1)

"""# Exercise 4"""

range(5)

type(range(5))

"""# Exercise 5"""

found = 0
x = 11
while found < 20:
  if x%5 == 0 and x%7 == 0 and x%11 == 0:
    print(x)
    found = found+1
  x = x+1

"""# Exercise 6"""

def is_Prime(num):
  if num > 1:

    for i in range(2,num):
      if (num % i) == 0:
        #print(num,"is not a prime number")
        #print(i,"times",num//i,"is",num)
        
        break
      else:
        print("True")
        return True
        break 
isPrime(17)

def is_Prime(num):
  if num == 2 or num == 3:
    print("Ture")
    return True
  else:
    if (num % 6 == 1) or (num % 6 == 5):
      print("True")
      return True
isPrime(17)

def allprimes(num):
    a = []
    for i in range(num):
        if(is_prime(i)):
          a.append(i)
    return a

def firstprimes(n):
    if n <= 0:
        return []
    elif n is 1:
        return [2]
    elif n is 2: 
        return [2, 3]
    else: 
        x = 2
        a = [2, 3]
        y = 5
        while x < n:
            if(is_prime(y)):
                a.append(y)
                x += 1
            y += 2
        return a

"""# Exercise 7"""

def my_list(a):
    str = ""
    for each in a:
        str = str + "%d" % each
    print(str)

    
my_list([1,2,3])

def reverse_list(a):
    str = ""
    for each in a[::-1]:
        str = str + "%d " % each
    print(str)

    
reverse_list([1,2,3])

list_length = [1,2,3]

print(len(list_length))

"""# Exercise 8"""

a = [1,2,3,4]
b = a
b[1] = 5
print(a[1])
c = a[:]
c[2] = 6
print(a)

def set_first_elem_to_zero(l):
    l[0] = 0
    return l
set_first_elem_to_zero(a)

print(a)

"""# Exercise 9"""

def concatenate(a):
    list = []
    for each in a:
        list += each
    return list
  
print(concatenate([[1, 2],[3, 4]]))

"""# Exercise 10"""

import matplotlib.pyplot as plt
import numpy as np

def f(x):
  return(np.sin(x-2)**2)*(np.e**(-x**2))

x = np.arange(0.0, 2.0, 0.01)
y = f(x)

plt.plot(x,y)
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.title("f(x)= sin^2(x-2) * e^-x^-2")
plt.grid(True)
plt.show()

"""# Exercise 11"""

def interation(a):
    b = 1
    for each in a:
        b *= each
    return b
  
print(interation([1,2,3]))

def recursion(a):
    if(len(a) == 1):
        return a[0]
    else:
        return a[0]*recursion(a[1:])
      
print(recursion([1,2,3]))

"""# Exercise 12"""

def fib(n):
    if(n == 0):
        return 0
    elif(n == 1):
        return 1
    else:
        return fib(n - 1) + fib(n - 2)
      
print(fib(5))

"""# Exercise 13"""

import re

file = open('emails.txt', 'r')
file = file.read()

email = re.findall(r'([^ ]+[@][^ ]+[.][a-z]+)', file)
print(emails)