using ExemploFundamentos;

int[] arrayInteiros = new int[4];

arrayInteiros[0] = 1;
arrayInteiros[1] = 12;
arrayInteiros[2] = 123;
arrayInteiros[3] = 1234;

for (int contador = 0; contador < arrayInteiros.Length; contador++)
{
    Console.WriteLine($"Contador = {contador} - {arrayInteiros[contador]}");
}