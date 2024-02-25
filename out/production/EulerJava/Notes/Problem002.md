# 002 Even Fibonacci Numbers
[002 Even Fibonacci Numbers](https://projecteuler.net/problem=002)

> Find sum of even fibonacci numbers not exceeding 4,000,000
## Brainstorming/Things to keep in mind
- This definition starts with 1,2 NOT 1,1.
-
- We can always use a simple loop. Fibonacci grows fast and we even know how large of an integer we have (Smaller than 8,000,000)
- The [closed form of Binet](https://en.wikipedia.org/wiki/Fibonacci_sequence#Closed-form_expression) looks good.
    - The naive first thought was, I might need to write a class, that supports carrying roots as in fractions as symbolic values. This seems unneccessary though.
## Binet's formula
with $\lfloor a \rceil$ being a rounded to the closest integer, binets formula can be approximated good enought to be used for quite small numbers (due to the rounding, we can do so, when the error is below 0.5).
The approximation is
$$F_n = \left\lfloor \frac{\varphi^n}{\sqrt{5}} \right\rceil.$$
The fact that the error becomes irrelevant sounds too good to be true, and it is. We will cause a new error with inexact representations of $\sqrt{5}$ and $\varphi$. If there is no nice formalism to carry irrationals as a function through the expression, we need to do a lot of work to **reliably** get true values.
1. Find out about convergence behavior of the product under increased precision decimals.
2. calculate again and again with increased precision until we can be sure (due to properties from step 1.) that we will not come closer to an other integer, than the current next.
3. Find a way to efficiently estimate and manage the needed precision upgrades.
## Back to the basics
- This closed form is very tempting, but we would have to do a lot of work to even know how well it scales with the necessary precision.
- No nice sum formula was to be found connecting
  Since we explicitly need two of every three numbers from the series, we can just as well go back to a simple loop.


## Add fast doubling
After falling into the binet rabbit hole, I found the previously overlooked fast doubling trick. It is equivalent to the core steps of the matrix method without calculating the unnecessary cells.
Given $F_n$ and $F_{n+1}$ we find that

$$F_{2n} =F_n (2F_{n+1}-F_n)$$
$$F_{2n+1} =(F_{n+1})^2+(F_n)^2$$

So we can double fast until we are in the right order of magnitude.