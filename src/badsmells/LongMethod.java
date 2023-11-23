package badsmells;

import java.util.List;

class PedidoService {
    public void processarPedido(Pedido pedido) {
        validarPedido(pedido);

        double valorTotal = calcularValorTotal(pedido);

        valorTotal = aplicarDescontos(pedido, valorTotal);

        gerarNumeroPedido(pedido);

        atualizarStatusPedido(pedido);

        registroPedido(pedido);

        enviarNotificacaoConfirmacao(pedido);

        // Outras operações relacionadas ao processamento do pedido...
        // ...
    }

    private void validarPedido(Pedido pedido) {
        // Validações do pedido...
        if (pedido.getItens().isEmpty()) {
            throw new RuntimeException("O pedido não contém itens.");
        }
    }

    private double calcularValorTotal(Pedido pedido) {
        // Cálculo do valor total do pedido...
        double valorTotal = 0;
        for (ItemPedido item : pedido.getItens()) {
            double valorItem = item.getQuantidade() * item.getPrecoUnitario();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    private double aplicarDescontos(Pedido pedido, double valorTotal) {
        // Aplicação de descontos...
        if (pedido.getValorDesconto() > 0) {
            valorTotal -= pedido.getValorDesconto();
        }
        return valorTotal;
    }

    private void gerarNumeroPedido(Pedido pedido) {
        // Lógica de geração do número do pedido...
    }

    private void atualizarStatusPedido(Pedido pedido) {
        // Atualização do status do pedido...
        pedido.setStatus(StatusPedido.APROVADO);
    }

    private void enviarNotificacaoConfirmacao(Pedido pedido) {
        // Lógica de envio de notificacao
    }

    private String gerarNumeroPedido() {
        // Lógica de geração do número do pedido...
        return "123456";
    }

    private void registroPedido(Pedido pedido) {
        // Lógica de registro do pedido no sistema...
    }

    private void enviarNotificacao(Cliente cliente, String mensagem) {
        // Lógica de envio de notificação para o cliente...
    }
}

class Pedido {
    private String numeroPedido;
    private List<ItemPedido> itens;
    private double valorDesconto;
    private StatusPedido status;
    private Cliente cliente;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // outros métodos relevantes
}

class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // outros métodos relevantes
}

enum StatusPedido {
    APROVADO,
    PENDENTE,
    CANCELADO,
    ENTREGUE
}

class Cliente {
    private String nome;
    private String email;
    // outros atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // outros métodos relevantes
}