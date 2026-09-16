import random
def funcionEjemplo():
    x = random.randrange(0,1)

    if x == 0:
        return False
    else:
        return True

if funcionEjemplo():
    print("SI!")
else:
    print("NO!")

x = 200
print(isinstance(x,int))