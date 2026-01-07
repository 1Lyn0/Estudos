// #1 Operadores Condicionais

int quantidadeEmEstoque = 12;
int quantidadeCompra = 11;
bool possivelVenda = quantidadeEmEstoque >= quantidadeCompra;

Console.WriteLine($"Quantidade em estoque: {quantidadeEmEstoque}");
Console.WriteLine($"Quantidade compra: {quantidadeCompra}");
Console.WriteLine($"É possível realizar a venda? {possivelVenda}");

if (possivelVenda)
{
    Console.WriteLine("Venda realizada");
}
else
{
    Console.WriteLine("Desculpe, não temos a quantidade desejada em estoque.");
}

