
package fazerpedido;
public class Encomenda implements PedidoEncomenda {//IPLEMNENTANDO UMA INTERFACE
    private String nomeencomenda;
    private float precoencomenda;
    CadastrarPessoa p=new CadastrarPessoa();
    

    @Override//SOBESCREVENDO O METODO DA INTERFACE (IMPLEMENTANDO)
    public void realizarEncomenda(float precoencomenda) {//MÉTODO PARA DESCONTAR O VALOR DA ENCOMENDA DO SALDO DO USUÁRIO
        p.setContaBancaria(p.getContaBancaria()-precoencomenda);
        
    }


    public String getNomeencomenda() {
        return nomeencomenda;
    }

    public void setNomeencomenda(String nomeencomenda) {
        this.nomeencomenda = nomeencomenda;
    }

    public float getPrecoencomenda() {
        return precoencomenda;
    }

    public void setPrecoencomenda(float precoencomenda) {
        this.precoencomenda = precoencomenda;
    }
    
    
    
    
}
