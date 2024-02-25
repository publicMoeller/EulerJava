# [003 Largest Prime Factor](https://projecteuler.net/problem=003)
> What is the largest prime factor of the number 600851475143?

I will want to build a class of tools for primes at some point, due to the prime heaviness of Project Euler. But for this Problem there seems to be a far easier way (If you are not reusing primes computed before)
- Loop over natural numbers starting from 2.
    - check divisibility and divide the number to be tested when ever possible. (multiple times if possible)
    - return when the remainder is the same as the number to be tested.

- non primes will just not be dividers, since we divided by all their factors already. We do not invest into distinguishing them from primes though.
- When our remaining number and the number we want to divide by are the same, It must be the biggest prime, because wie have removed all smaller factors and dividing by is gives us 1.