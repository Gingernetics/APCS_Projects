
_list = [[1,2,3], [4,5,6], [7,8,9]]


#Test Print
for x in _list:
    print x
    
length = len(_list)

x = 0
while x < length:
    y = x
    while y < length:
        temp = _list[x][y]
        _list[x][y] = _list[y][x]
        _list[y][x] = temp
        y += 1
    x += 1
    
for x in _list:
    print x


