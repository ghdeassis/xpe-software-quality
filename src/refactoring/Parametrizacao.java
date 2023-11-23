package refactoring;

class Calculadora {
    public Double calcularPreco(double valor, double taxaImpostos) {
        return valor + valor * taxaImpostos;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double valorSemImpostos = 100;
        double taxaImpostos = 0.1;
        double valorComImpostos = calc.calcularPreco(valorSemImpostos, taxaImpostos);
        System.out.println("Valor com impostos: " + valorComImpostos);
    }
}