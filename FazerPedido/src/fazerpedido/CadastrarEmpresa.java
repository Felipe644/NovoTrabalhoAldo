package fazerpedido;
public abstract class CadastrarEmpresa {
    protected String NomeImpresa;
    protected String endereco;
    protected int cnpj;
    
    protected void CadastrarProduto(){
        
    }

    public String getNomeImpresa() {
        return NomeImpresa;
    }

    public void setNomeImpresa(String NomeImpresa) {
        this.NomeImpresa = NomeImpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
    
}
