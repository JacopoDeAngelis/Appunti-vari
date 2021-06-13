# Age è dinamicamente tipizzato ma, nonostante ciò, è effettivamente tipizzato
age = 42
print(type(age))
age = "Quarantadue"
print(type(age))

print(type("string") is str)
print(type(type("string") is str))
