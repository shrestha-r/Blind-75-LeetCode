# Bottom Up - Tabulation

    
def f(n):
    if n==0:
        return 1
    return n*f(n-1);

def fact(n):
    if n == 0:
        return 1
        
    # dp = [0]*(n+1)
    # dp[0] = 1
    
    curr = 1
    
    for i in range(1,n+1):
        dp = i* curr;
        curr = dp
    
    return curr
    
# print(fact(1000))
print(f(500))



# fi(2) = fib(1) * fib(0) = n*fib(n-1) = 2 * fib()