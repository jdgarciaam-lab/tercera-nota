let valor = 10;

function cambiarValor(valor) {
    valor = 20;  // No modifica el valor original
}

cambiarValor(valor);
console.log(valor);  // Imprime 10