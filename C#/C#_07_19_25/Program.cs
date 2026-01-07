

// 1# For

// int numero = 10;

// for (int contador = 0; contador <= 10; contador++)
// {
//     Console.WriteLine($"{numero} x {contador} = {numero * contador}");
// }

// 2# while

// int numero = 10;
// int contador = 1;

// while (contador <= 10)
// {
//     Console.WriteLine($"{contador}° Execução: {numero} x {contador} = {numero * contador}");
//     contador++;
// }

// 2.1# while + break

int numero = 10;
int contador = 1;

while (contador <= 10)
{
    Console.WriteLine($"{contador}° Execução: {numero} x {contador} = {numero * contador}");
    contador++;

    if (contador == 6)
    {
        break;
    }
}