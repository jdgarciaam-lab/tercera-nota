let lista = [1, 2, 3];

function cambiarLista(miLista) {
    miLista.push(4);  // Modifica el objeto original
}

cambiarLista(lista);
console.log(lista);  // Imprime [1, 2, 3, 4]