// Esta classe modela o caixa do "emporium". Ela deve receber o nome do
// cliente e a lista de produtos (conte�do do "carrinho").

public class Caixa
{
    // atributos: vari�veis que armazenam os dados de um objeto, ap�s este
    // ser instanciado.
    private Cliente cliente;
    private Carrinho carrinho;
    
    // m�todo construtor: usado para inicializar os atributos,
    // quando um objeto cliente � criado (instanciado). Notar que o construtor
    // faz chamada interna de dois m�todos modificadores.
    public Caixa(Cliente cliente, Carrinho novoCarrinho) {
        this.cliente = cliente;
        carrinho = novoCarrinho;
    }
   // outros m�todos
    
    /*
     * O m�todo abaixo imprime os dados do cliente e a lista de 
     * compras (conte�do do "carrinho"). O nome do cliente (retornado pelo
     * m�todo getNome() ) e a lista de produtos comprados pelo cliente 
     * (retornados pelo m�todo listaDeProdutos() ) s�o concatenados em uma 
     * String. Em seguida, o conte�do da String � impresso.
     */
    
    public String imprimirCompra()
    {
        String saida = "";
        saida += "Cliente: " + cliente.getDados() + "\n\n" + 
                "********    Lista de compras ******** \n" +
                carrinho.listaDeProdutos();
        
        return saida;
    }
}