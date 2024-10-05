list = [ 1,2,3,4,100,6,700,-8]

min = list[0]
max = list[-1]

for i in list:
    if ( i < min):
        min = i
    elif ( i > max):
        max = i

print (f"max = {max}")
print (f"min = {min}")