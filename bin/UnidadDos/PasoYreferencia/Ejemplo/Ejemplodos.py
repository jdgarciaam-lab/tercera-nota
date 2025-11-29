def cambiar_lista(mi_lista):
    mi_lista.append(4)  # Modifica el objeto original

lista = [1, 2, 3]
cambiar_lista(lista)
print(lista)  # Imprime [1, 2, 3, 4]