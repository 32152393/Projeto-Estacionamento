
package Models;


public class Veiculo {

    private String placa;
    private String descricao;
    private int id;
    private ETipoVeiculo tipoVeiculo;

    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

 
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

    
    public ETipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(ETipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    
    public void Registrar(){
        
    }
    
    public void Bloquear(){
            
    }
    
    public void Desbloquear(){
        
    }
    
}
