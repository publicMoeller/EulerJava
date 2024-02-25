# 001 Multiples of 2 and 5
[001 Multiples of 2 and 5](https://projecteuler.net/problem=001)
> Find sum of numbers divisible by 3 and 5 smaller than 1000.
### Naive $\mathcal{O(n)}$
Loop with three obvious checks and a aggregating sum variable.

## Later $\mathcal{O(1)}$
I was told that one can 'just' sum up the natural numbers dividable by $k$ with the Gauss sum. It seems to be easy, because nobody explains it. They always point to the 'normal' Gauss sum.

$$Gauss(n) =  \frac{n(n+1)}{2}$$

The rather simple trick (that took me too long to see) is to multiply the elements (or the whole sum) by $k$ and  divide the upper bound  by $k$ to not overshoot.
That means we can get the sum of the numbers up to $n$ divisible by $k$ as

$$modGauss(k,n) =  k \left( \frac{ \frac{n}{k}(\frac{n}{k}+1)}{2}\right)$$

then we can calculate in $\mathcal{O(1)}$ (assuming normal Integers):

$$result = modGauss(3,n) + modGauss(5,n) -modGauss(15,n)$$