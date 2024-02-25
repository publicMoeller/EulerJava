# [006 Sum Square Difference](https://projecteuler.net/problem=006)
> Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

- [Faulhabers formula](https://en.wikipedia.org/wiki/Faulhaber%27s_formula) gives us a explicit sum for the sum of squares:
  $$\sum_{k = 1}^n k^2 = \frac{n(n+1)(2n+1)}{6} = \frac{2n^3+3n^2+n}{6}$$
- The Gauss sum helps with the other sum
## Implementation
For getting used to using all the information I will make every meaningful step into a test:
- the smaller case we are given
- the example for both sums separately