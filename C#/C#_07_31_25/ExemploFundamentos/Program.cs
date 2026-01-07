using ExemploFundamentos.Common.Models;

Pessoa pessoa1 = new Pessoa();
pessoa1.Nome = "Mirko";
pessoa1.Idade = 20
pessoa1.Apresentar();















































// string opcao;
// bool exibirMenu = true;

// while (exibirMenu)
// {
//     Console.Clear();
//     Console.WriteLine("Digite a sua opção:");
//     Console.WriteLine("1 - Cadastrar cliente");
//     Console.WriteLine("2 - Buscar cliente");
//     Console.WriteLine("3 - Apagar cliente");
//     Console.WriteLine("4 - Encerra");

//     opcao = Console.ReadLine();

//     switch (opcao)
//     {
//         case "1":
//             Console.WriteLine("Cadastro de cliente");
//             break;

//         case "2":
//             Console.WriteLine("Busca de ciente");
//             break;

//         case "3":
//             Console.WriteLine("Apagar cliente");
//             break;

//         case "4":
//             Console.WriteLine("Encerrar");
//             exibirMenu = false;
//             //Environment.Exit(0);  Isso faz o codigo se encerrar totalmente, sem pode continuar caso tenha codigo embaixo
//             break;

//         default:
//             Console.WriteLine("Opção inválida");
//             break;
//     }
// }

// Console.WriteLine("O programa se encerrou");

// #1 Do while

// int soma = 0, numero = 0;

// do
// {
//     Console.WriteLine("Digite um número (0 para parar)");
//     //o "ReadLine" recebe String, o "Convert" é pra transformar em int
//     numero = Convert.ToInt32(Console.ReadLine());

//     soma += numero;

// } while (numero != 0);

// // o "$" é para fazer as variaveis "{soma}" no texto ser identificado como uma variavel
// Console.WriteLine($"Total da soma dos números digitados é: {soma}");
