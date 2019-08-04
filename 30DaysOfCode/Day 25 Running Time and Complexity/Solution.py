import math

def isPrime(n):
    for i in range(2, int(math.sqrt(n))+1 ):
        if n%i == 0:
            return False
    return True

t = int(input())
for _ in range(t):
    inp = int(input())
    if inp>=2 and (isPrime(inp)):
        print('Prime')
    else:
        print('Not prime')
