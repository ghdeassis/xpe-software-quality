package designpatterns;

class Facade {
    private CarrinhoDeCompras carrinho;
    private ProcessadorDePagamento processador;
    private EnviadorDePedido enviador;
    private ServicoDeEmail email;

    public Facade() {
        this.carrinho = new CarrinhoDeCompras();
        this.processador = new ProcessadorDePagamento();
        this.enviador = new EnviadorDePedido();
        this.email = new ServicoDeEmail();
    }

    public void realizarCompra(String[] itens, String endereco, String cartaoCredito, String emailUsuario) {
        carrinho.adicionarItens(itens);
        double total = carrinho.calcularTotal();
        processador.processarPagamento(cartaoCredito, total);
        enviador.enviarPedido(endereco);
        email.enviarEmail(emailUsuario, "Compra realizada com sucesso!");
    }
}

class CarrinhoDeCompras {
    void adicionarItens(String[] itens) {}
    double calcularTotal() { return 0; }
}
class ProcessadorDePagamento {
    void processarPagamento(String cartaoCredito, Double total) {}
}
class EnviadorDePedido {
    void enviarPedido(String endereco) {}
}
class ServicoDeEmail {
    void enviarEmail(String email, String mensagem) {}
}