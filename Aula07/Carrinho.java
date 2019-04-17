// Classe usada para modelar um carrinho de supermercado

import java.util.ArrayList; // importa a classe ArrayList

public class Carrinho
{
    // atributos: vari�veis que armazenam os dados de um objeto, ap�s este
    // ser instanciado.
    private ArrayList <Produto> produtosEscolhidos;

    // m�todos construtores: usado para inicializar os atributos,
    // quando um objeto cliente � criado (instanciado). Notar que o construtor
    // faz chamada interna de dois m�todos modificadores.
    public Carrinho()
    {
        produtosEscolhidos = new ArrayList<>(400);
    }

    // outros m�todos
    
    /*
     * Este m�todo deve ser executado uma vez para cada produto colocado 
     * no carrinho.
     * Para cada produto, escrever o nome (exemplo: "arroz"), o pre�o 
     * unit�rio por kg (em reais) e a quantidade de produto (em kg).
     */
    
    public void colocarProdutoNoCarrinho(String nomeProduto, double precoProduto, 
    double quantidadeProduto)
    {
        Produto novoProduto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
        produtosEscolhidos.add(novoProduto);
    }
    /*remover um produto de uma posi��o e devolver o produto*/
    public Produto removeProdutoDoCarrinho(int posicao){
         Produto p = produtosEscolhidos.remove(posicao);
         return p;
    }  
    /* 
    * Este m�todo percorre a Lista de Produtos, armazenada em um ArrayList. Colhe os valores dos atributos 
    * de cada objeto da lista e os concatena numa String (saida). Calcula 
    * tamb�m o total em reais gasto nas compras, concatenando-o na mesma 
    * String. Depois, retorna essa String.
    */
    
   
    public String listaDeProdutos()
    {
        String saida = "";
        double soma = 0.0;
                
        for( Produto produto: produtosEscolhidos )
        {
            saida += produto.gastoComProduto();
            soma += produto.getQuantidade() * produto.getPrecoUnitario();
        }
        saida += "\n\nTotal a Pagar: R$ " + soma;
        return saida;
      
    }
}