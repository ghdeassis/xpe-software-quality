package badsmells;

class ContaCorrente {
    private static final Double SALDO_MINIMO = 10.0;
    private Double saldo;

    public void saque(Double valor) {
        if (isContaAbaixoMinimo()) {
            //erro
        }
        //logica do saque
    }

    public void transferencia(Double valor) {
        if (isContaAbaixoMinimo()) {
            //erro
        }
        //logica da transferencia
    }

    public void cobrancaTaxa(Double taxa) {
        if (isContaAbaixoMinimo()) {
            //erro
        }
        //logica da cobranca de taxa
    }

    public Boolean isContaAbaixoMinimo() {
        return saldo < SALDO_MINIMO;
    }
}
