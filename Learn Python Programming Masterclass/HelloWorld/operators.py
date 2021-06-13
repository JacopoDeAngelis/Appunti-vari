a = 12
b = 3

print(a + b)  # 15
print(a - b)  # 9
print(a * b)  # 36
print(a / b)  # 4.0
print(a // b)  # 4, divisione che restituisce un numero intero arrotondato per difetto
print(a % b)  # 0 modulo
print (a ** 3) # 1728

c = 4
c *= b
print(c)  # 12

print(a + b / 3 - 4 * 12)
print("""Ordine PEMDAS:
1. Parentheses
2. Exponents
3. Multiplication
3. Division
4. Addition
4. Subtraction""")

print("""I punti 3 e 4 non hanno precedenza tra di loro, vengono eseguiti in ordine da sinistra a destra""")
