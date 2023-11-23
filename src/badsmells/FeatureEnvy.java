package badsmells;

class FeatureEnvy {
    private void processarProduto(Produto produto) {
        String descricao = produto.gerarDescricao();
        double total = produto.calcularTotal();
    }
}

class Produto {
    private String descricao;
    private int quantidade;
    private double preco;
    private double desconto;

    public String gerarDescricao() {
        return descricao.trim().toUpperCase();
    }

    public double calcularTotal() {
        double total = quantidade * preco;
        total = total - (total * desconto / 100);
        return total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}