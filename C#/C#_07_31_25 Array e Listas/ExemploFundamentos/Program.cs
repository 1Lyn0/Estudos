using ExemploFundamentos;

int[] arrayInteiros = new int[4];

arrayInteiros[0] = 72;
arrayInteiros[1] = 69;
arrayInteiros[2] = 96;
// Ultrapassa o limite pré estabelecido do array
arrayInteiros[3] = 99;

for (int contador = 0; contador < arrayInteiros.Length; contador++)
{
    Console.WriteLine($"Posição N° {contador} - {arrayInteiros[contador]}");
}