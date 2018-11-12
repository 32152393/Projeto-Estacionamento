package Models;

import java.util.Date;
import java.util.List;

public class Ticket {
    
    private Date dataEntrada;
    private int id;
    private Date dataSaida;
    private boolean pago;
    private Usuario usuario;
    private Vaga vaga;
    private Pagamento pagamento;
    private Veiculo veiculo;
    
    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

  

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Ticket GerarTicke() {

        return null;
    }

    public List<Ticket> BuscarTodos() {

        return null;
    }

    public List<Ticket> BuscarTodosPorVeiculo(ETipoVeiculo tipoVeiculo) {

        return null;
    }

}
