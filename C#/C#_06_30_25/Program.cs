// #3 TryParse - conversão segura

string a = "15-";
int b = Convert.ToInt32(a);

Console.WriteLine(b);
Quando dá erro, tudo abaixo do erro não é executado
Console.WriteLine("Conversão realizada com sucesso!");
// -------------------
string a = "15-";
int b = 0;

int.TryParse(a, out b);
Uma saída esperada caso o "a" dê erro

Console.WriteLine(b);
Console.WriteLine("Conversão realizada com sucesso!");
// -------------------
string a = "15-";

int.TryParse(a, out int b);
// Uma saída esperada caso o "a" dê erro

Console.WriteLine(b);
Console.WriteLine("Conversão realizada com sucesso!");



// #2 Cast implícita

----Int -> Double----
int a = 5;
double b = a;

Console.WriteLine(b);
----Long -> Int----
long a = long.MaxValue;
int b = a;

Console.WriteLine(d);
----Int -> Long----
int a = int.MaxValue;
long b = a;

Console.WriteLine(b);




// #1 ToString

int inteiro = 5;
string a = inteiro.ToString();

Console.WriteLine(a);

// Toda classe vai herdar da Object, e o ToString vem dela