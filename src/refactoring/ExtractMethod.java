package refactoring;

import java.util.List;

class ItemPedido {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

class Pedido {
    private List<ItemPedido> itens;
    private double desconto;

    private double aplicarDesconto(double total) {
        return total -= total * desconto / 100;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return aplicarDesconto(total);
    }
}