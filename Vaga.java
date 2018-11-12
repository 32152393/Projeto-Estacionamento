package Models;

import java.util.List;

public class Vaga {

    private int id;
    private char setor;
    private int localidade;
    private boolean vagaEspecial;
    private boolean disponivel;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public int getLocalidade() {
        return localidade;
    }

    public void setLocalidade(int localidade) {
        this.localidade = localidade;
    }

    public boolean isVagaEspecial() {
        return vagaEspecial;
    }

    public void setVagaEspecial(boolean vagaEspecial) {
        this.vagaEspecial = vagaEspecial;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void Atualizar() {

    }

    public Vaga BuscarPorId(int id) {

        return null;
    }

    public List<Vaga> BuscarTodos() {

        return null;
    }

    public List<Vaga> TodasVagasEspeciais(boolean vagasEspeciais) {

        return null;
    }

    public List<Vaga> TodasVagasDisponiveis(boolean VagasDisponiveis) {

        return null;
    }

    public void Gravar() {

    }
}
