#!/bin/python3
'''
import sys
res = []
n = int(input().strip())
numbers = str(bin(n)[2:]).split('0')
for i in numbers:
    res.append(len(i))
print(max(res))
'''
# OR

n = int(input().strip())
print(max(len(length) for length in bin(n)[2:].split('0')))

