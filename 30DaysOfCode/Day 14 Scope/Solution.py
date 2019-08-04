class Difference:
    def __init__(self, a):
        self.__elements = a
        
    def computeDifference(self):
        res = abs(min(a) - max(a))
        self.maximumDifference = res

# End of Difference class
_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
