using ExemploFundamentos;
/* APRENDIDO HOJE
Array, foreach, Array.Resize

*/
int[] arrayInteiros = new int[4];

arrayInteiros[0] = 1;
arrayInteiros[1] = 12;
arrayInteiros[2] = 123;
arrayInteiros[3] = 1234;

// Faz uma copia do array quando aumenta o tamanho
Array.Resize(ref arrayInteiros, arrayInteiros.Length * 2);

Console.WriteLine("Percorrendo o Array com o FOR");
// Percorrendo o Array com o FOR
for (int contador = 0; contador < arrayInteiros.Length; contador++)
{
    Console.WriteLine($"Contador = {contador} - {arrayInteiros[contador]}");
}


















// Console.WriteLine("Percorrendo o Array com o FOREACH");
// // Percorrendo o Array com o FOREACH
// int contadorForeach = 0;
// // Foreach é útil com listas/arrays
// foreach (int valor in arrayInteiros)
// {
//     Console.WriteLine($"Posição N°{contadorForeach} de valor {valor}");
//     contadorForeach++;
// }