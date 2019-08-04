#!/bin/python3

import math
import os
import random
import re
import sys


mytext = '@gmail.com'
res = []

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        data = list(map(str, input().split()))        
        firstName = data[0]
        email = data[1]
        if mytext in email:
            res.append(firstName)

    res.sort()
    for i in res:
        print(i)
    
        
