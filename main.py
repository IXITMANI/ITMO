import re
from sys import stdin


def f(a):  # Функция котороя отрезает последний символ у строки
    return a[:-1]


isu = 467618
# Номер 1
print('Num1')
smile = "8-{\\"
r_smile = r'8-{\\'

t1 = 'oO4eQotYkU' + smile + 'vepbcce4qGMhf0E'
t2 = 'fII1u' + smile + 'vKtVVBRSPfO' + smile + 'jnLUBRYcj'
t3 = 'wvjFrVOqIdN' + smile + smile + 'vLVnVez3B8shZo'
t4 = smile + 'yqkC4oliOex1T01Xjl86nFZqO'
t5 = 'cKnnFd4fROigYRZVkzPJA33cU'

print('мой способ \tчерез регулярное выражение')
for i in range(1, 6):
    fl = eval('t' + str(i))
    print(fl.count(smile), end='\t\t\t')
    print(len(re.findall(r_smile, fl)))
    print('-------------')

# Номер 2
tmp = '''Петров П.П. P000
Анищенко А.А. P33113
Примеров Е.В. P000
Иванов И.И. P000'''
print('Num 2')
print(isu % 6)

a = list(map(f, stdin.readlines()))
gr = 'P000'
print(a)
pattern = re.compile(rf"^(\w+)\s(\w)\.\2\.\s{gr}$")
filtered_list = [student for student in a if not pattern.match(student)]
print(filtered_list)

# Номер 3
print(isu % 36)  # xml json sreda
fl = open("Расписание.xml", 'r', encoding='UTF-8')
fl = fl.readlines()[2:-1]
for i in range(len(fl)):
    if fl[i].count('<') == 2:
        if "</" in fl[i]:
            fl[i] = fl[i][: fl[i].index("</")] + '",' + fl[i][fl[i].rindex('>') + 1:]
        fl[i] = fl[i].replace('<', '"', 1)
        fl[i] = fl[i].replace('>', '": "', 1)
    else:
        if "</" in fl[i]:
            fl[i - 1] = fl[i - 1].replace(',', '')
            fl[i] = fl[i][: fl[i].index("</")] + " }, " + fl[i][fl[i].rindex('>') + 1:]
        fl[i] = fl[i].replace('<', '"', 1)
        fl[i] = fl[i].replace('>', '": {', 1)


print(fl)
fl[-1] = fl[-1].replace(',', '')
with open('new.json', 'w', encoding='UTF-8') as new_fl:
    new_fl.write('{\n')
    for line in fl:
        new_fl.write(line)
    new_fl.write('}')
