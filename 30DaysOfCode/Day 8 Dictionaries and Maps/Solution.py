t = int(input())
phoneBook = {}
for i in range(t):
    name, phone = str(input()).split()
    phoneBook[name] = phone

for i in range(t):
    search = str(input())
    if search in phoneBook:
        print('{}={}'.format(search, phoneBook[search]))
    else:
        print('Not found')
