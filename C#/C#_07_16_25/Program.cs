using System.Runtime.InteropServices.Marshalling;

// #5 Operador NOT (!)

bool choveu = true;
bool estaTarde = true;

if (!choveu && !estaTarde)
{
    Console.WriteLine("Vou pedalar");
}
else
{
    Console.WriteLine("Vou pedalar um outro dia");
}













// #4 Operador AND (&&)

// Essas variáveis definem se o "aluno" foi aprovado ou reprovado
// As duas devem ser verdadeiras

// bool possuiPresencaMinima = true;
// double media = 6.5;

// if (possuiPresencaMinima && media >= 7)
// {
//     Console.WriteLine("Aprovado!");
// }
// else
// {
//     Console.WriteLine("Reprovado!");
// }

// #3 Operador OR (Pipe ||)

// Alterar os valores dessas duas variáveis, define a mensagem exibida
// Uma das variáveis deve ser verdadeira para true

// bool ehMaiorDeIdade = false;
// bool possuiAutorizacaoDoResponsavel = false;

// if (ehMaiorDeIdade || possuiAutorizacaoDoResponsavel)
// {
//     Console.WriteLine("Entrada liberada!");
// }
// else
// {
//     Console.WriteLine("Entrada não liberada");
// }

// #2.2 Outra forma, utilizando o switch, substituindo um "else if" longo

// Console.WriteLine("Digite uma letra");
// string letra = Console.ReadLine();

// switch (letra)
// {
//     case "a":
//     case "e":
//     case "i":
//     case "o":
//     case "u":
//         Console.WriteLine("Vogal");
//         break;

//     default:
//         Console.WriteLine("Não é uma Vogal");
//         break;    
// }

// #2.1 Primeira forma de usar o if eficientemente
// if (letra == "a" ||
//     letra == "e" ||
//     letra == "i" ||
//     letra == "o" ||
//     letra == "u")
// {
//     Console.WriteLine("Vogal");
// }
// else
// {
//     Console.WriteLine("Não é uma Vogal");
// }

// #1 Operadores Condicionais

// int quantidadeEmEstoque = 12;
// int quantidadeCompra = 0;
// bool possivelVenda = quantidadeCompra > 0 && quantidadeEmEstoque >= quantidadeCompra;

// Console.WriteLine($"Quantidade em estoque: {quantidadeEmEstoque}");
// Console.WriteLine($"Quantidade compra: {quantidadeCompra}");
// Console.WriteLine($"É possível realizar a venda? {possivelVenda}");

// if (quantidadeCompra == 0)
// {
//     Console.WriteLine("Venda inválida");
// }

// else if (possivelVenda)
// {
//     Console.WriteLine("Venda realizada");
// }
// else
// {
//     Console.WriteLine("Desculpe, não temos a quantidade desejada em estoque.");
// }

