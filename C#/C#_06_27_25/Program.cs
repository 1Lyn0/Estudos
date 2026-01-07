// // 27/06/25 #4 Cast - Casting

// int a = Convert.ToInt32("5");
// int b = int.Parse("5c");
// // Converter uma variavel, no caso uma string em um inteiro de 32 bits
// // O Convert. converte mais tipos de variaveis para a desejada, o Convert torna valores null em 0
// // O Parse apenas converte texto para int, nesse caso, o parse por outro lado não converte o null
// Console.WriteLine(a);
// Console.WriteLine(b);



// // 27/06/25 3# Operador de atribuição

// int a = 10;
// int b = 20;
// // Operador de atribuição: "="
// int c = a + b;
// c = c + 5
// c += 5;
// // mesma coisa que c = c + 5
// // isso também vale para c *= 5, c -= 5,c /= 5, etc
// Console.WriteLine(c);



// 27/06/25 #2 DateTime

// DateTime dataAtual = DateTime.Today.AddMinutes(595959);
// // DateTime - usar Datas, DateTime.Now - Pegar a data de agora
// //DateTime.Now.add@@@(n) - adicionar tempo
// Console.WriteLine(dataAtual.ToString("dd/MM/yyyy HH:mm"));
// // ToString(@@@) - mudar o formato da data



// // 27/06/25 1# Tipos de varíavel

// string apresentacao = "Olá, seja bem vindo";
// int quantidade = 1;
// double altura = 1.80;
// decimal preco = 1.80M;
// bool condicao = true;

// Console.WriteLine(apresentacao);
// Console.WriteLine("Valor da variável quantidade: " + quantidade);
// Console.WriteLine("Valor da variável altura: " + altura.ToString("0.00"));
// // .ToString("0.00") - define que deve mostrar um numero inteiro e duas casas decimais do numero
// Console.WriteLine("Valor da variável preço: " + preco);
// Console.WriteLine("Valor da variável condicao: " + condicao);

// // Valores monetários sempre utilizar o decimal, pois o double nao usa o 0, o decimal sempre vai mostrar pelo menos duas casas decimais