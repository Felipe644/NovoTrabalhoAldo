package fazerpedido;
import javax.swing.JOptionPane;

public class CadastrarPessoa extends Pessoa { //HERANÇA NESTA CLASSE VAMOS CADASTRAR AS PESSAOAS QUE IRÃO EFETUAR OS PEDIOS 
    protected float contaBancaria;//CRIANDO UM ATRIBITO CHAMADO DE CONTA QUE CONTERA UM VALOR PARA O USUÁRIO EFETUAR O PEDIDO
    
    public CadastrarPessoa(String nome, int idade, String cpf, String endereco) {//SOBRECARGA DE CONSTRUTOR CRIANDO UM CONSTRUTOR COM OS ATRIBUTOS DA CLASSE PAI
        super(nome, idade, cpf, endereco);
         
    }

    public CadastrarPessoa() {
        this.setContaBancaria(2000000);//DEFININDO O VALOR CONTIDO NA CONTA
        
    }
    
    
    
    public void CadastrarPessoas(){//CADASTRANDO UMA PESSOA
        this.setNome(JOptionPane.showInputDialog("Informe o nome"));
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade")));
        this.setCpf(JOptionPane.showInputDialog("Informe o Cpf"));
        this.setEndereco(JOptionPane.showInputDialog("Informe o Endereço"));
        JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!!");
       
    }
   
    

    public float getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(float contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return super.toString +
                "\nContaBancaria: " + contaBancaria ;
    }
    
    
    
    
    
}
