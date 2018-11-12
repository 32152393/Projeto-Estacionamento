package Models;

public class Pagamento {
    
    private double valor;
    private int id;
    private ETipoPagamento tipoPagamento;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ETipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(ETipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    

    public void EfetuarPagamento() {

    }

    public double BuscarPagamentoEfetuadoDinheiro(ETipoPagamento tipoPagamento) {

        return 0;
    }

    public double BuscarPagamentoEfetuadoCredito(ETipoPagamento tipoPagamento) {

        return 0;
    }

    public double BuscarPagamentoEfetuadoDebito(ETipoPagamento tipoPagamento) {
        return 0;
    }

}
