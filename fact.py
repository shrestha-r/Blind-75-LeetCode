
def factorial(n):
    if n==0: return 1
    return n*factorial(n-1)


def fact(n):
    
    memo = {0:1}
    
    def f(x):
        if x in memo:
            return memo[x]
        else:
            memo[x] = x*f(x-1)
            return memo[x]
    return f(n)
 
# print(factorial(1000))
print(fact(998))