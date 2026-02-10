def fact(n):
    memo = {0:1}
    def f(x):
        if x in memo:
            return memo[x]
        else:
            memo[x] = x * f(x-1)
            return memo[x]

    return f(n)

print(fact(4))