package refactoring;

public class InlineMethod {
    public double calcularValorTotal(double valorUnitario, int quantidade) {
        return valorUnitario * quantidade;
    }

    public static void main(String args[]) {
        InlineMethod exemplo = new InlineMethod();
        double valorTotal = exemplo.calcularValorTotal(10.0, 5);
        System.out.println("Valor Total: " + valorTotal);
    }
}
