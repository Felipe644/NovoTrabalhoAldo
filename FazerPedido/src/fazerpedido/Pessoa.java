package fazerpedido;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String endereco;
    String toString;

    public Pessoa() {
    }
    

    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + 
                "\nIdade: " + idade +
                "\nCpf: " + cpf +
                "\nEndereco: " + endereco;
    }
    
    
    
   
    
    
}
