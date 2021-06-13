string = "Questa è una stringa"
string_2 = 'Anche questa'
print(string, string_2)
print(string + string_2)

# Tra le parentesi c'è il prompt
# richiede l'input dell'utente e lo assegna a name.
name = input("Inserisci il tuo nome: ")

print(name)

print("""Se vogliamo avere vari caratteri che richiederebbero l'escape possiamo semplicemente mettere la 
stringa tra triple virgolette, in questo modo tutti i caratteri all'interno ' saranno ' usati. L'inconveniente è che
anche andare a capo viene rappresentato. Per risolvere questo problema basta \
mettere uno \\ a fine linea prima di andare a capo nell'IDE""")

print(r"Se vogliamo che una stringa venga mostrata esattamente come vogliamo possiamo mettere una r (raw) prima della "
      r"stringa. In questo modo possiamo stampare un percorso, ad esempio C:\Programmi")

print("Possiamo formattare {}, aggiungendo quanti {} vogliamo, ad esempio qua ne usiamo {}".format("le stringhe",
                                                                                                   "operatori", 3))

print("Jan: {2}, Feb: {0}, Mar: {2}, Apr: {1}, May: {2}, Jun: {1}, Jul: {2}, Sep: {1}, Oct: {2}, Nov: {1}, Dec: {2}"
      .format(28, 30, 31)) # Si può usare una serie di indici in modo da potere sostituire più volte
# con la stessa stringa

print("Le stringhe sono liste di caratteri, possiamo accedere a posizioni specifiche con le parentesi quadre"[1])
print("Per accedere dall'ultimo elemento possiamo usare indici negativi da -1 a -n"[-1])

# Slicing
print("Le sottostringhe sono accedute tramite la dicitura [n:m]"[4:8])
print("Se vogliamo avere un limite superiore o inferiore e non l'altro possiamo farlo"[:10])
print("Ovviamente funziona anche con indici negativi"[-4:-2])
print("O fare cose strane pensando sempre che l'indice a sinistra deve puntare al limite inferiore e "
      "l'altro a quello superiore"[2:-4])
print("O, pr,end,re ,sol,o e,lementi a step precisi usando il terzo elemento"[1:20:4])

number = "9,223;372:036 854,775;807"
seperators = number[1::4]
print(seperators)

# Join può prendere una funzione o unire più stirnghe in una tabella di iterable dove la prima stringa viene
# usata come punto di unione
values = "".join(char if char not in seperators else " " for char in number).split()
print([int(val) for val in values])
print()
print(" attaccato a ".join(["2", "3", "4"]))

print("split, separa gli, elementi su caratteri, selezionati".split(','))
print("Hello" * 5 + "stampa cinque volte Hello")

for i in range(1, 13):
    print("No. {0:2} squared is {1:3} and cubed is {2:4}".format(i, i ** 2, i ** 3))

print()

for i in range(1, 13):
    print("No. {0:2} squared is {1:<3} and cubed is {2:^4}".format(i, i ** 2, i ** 3))

print("""< indica lo spazio eventuale deve essere messo dopo come padding, ^ centra la stringa""")

print("Pi is approximately {0:12}".format(22 / 7))
print("Pi is approximately {0:12f}".format(22 / 7))
print("Pi is approximately {0:12.50f}".format(22 / 7))
print("Pi is approximately {0:52.50f}".format(22 / 7))
print("Pi is approximately {0:62.50f}".format(22 / 7))
print("Pi is approximately {0:<72.50f}".format(22 / 7))
print("Pi is approximately {0:<72.54f}".format(22 / 7))
print("f indica che vogliamo una precisione di 50 cifre, . indica che può essere ignorato"
      " lo spacing precedente in favore della precisione")

age = 28
print("Inserire f prima di un a variabile ci permette di concatenare una stringa con una variaible non "
      f"stringa, ad esempio {age}")