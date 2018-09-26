
package fazerpedido;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FazerPedido{

    public static void main(String[] args) {
        ArrayList<CadastrarPessoa>listadePessoas=new ArrayList();
        CadastrarPessoa cp=new CadastrarPessoa();
        //Cadastrando uma ou mais Pessoas, e exibindo seus dados na tela
        cp.CadastrarPessoas();
        listadePessoas.add(cp);
        
        //CADASTRANDO UMA EMPRESA
        CadastrarEmpresa ce=new CadastrarEmpresa() {};
        ce.setNomeImpresa(JOptionPane.showInputDialog("Informe o nome da Empresa"));
        ce.setEndereco(JOptionPane.showInputDialog("Informe o endereço da Empresa"));
        ce.setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Informe o CNPJ da Empresa")));
        
        //CADASTRANDO OS PRODUTOS DA EMPRESA
        int qproduto=Integer.parseInt(JOptionPane.showInputDialog("Quantos Produtos serão Cadastrados ?  "));
        CadastrarProtutoEmpresa cpe=new CadastrarProtutoEmpresa();
        ArrayList<CadastrarProtutoEmpresa>listadeProtudos=new ArrayList<>();
        for(int cc=1;cc<=qproduto;cc++){
            cpe.setNomeProduto(JOptionPane.showInputDialog("Informe o nome do "+cc+"° Produto "));
            cpe.setPrecoProduto(Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do "+cc+"° Produto")));
        listadeProtudos.add(cpe);
        }
        int escolha=0;
        while(escolha!= 5){
            escolha=Integer.parseInt(JOptionPane.showInputDialog("      MENU\n\n1- Visualizar dados cadastrais\n2- Visualizar dados da empresa\n3- Visualizar dados dos podutos cadastrados\n4- Realizar uma encomenda\n5- Sair"));
        switch(escolha){
            case 1:
                for(int n=0;n<listadePessoas.size();n++){//PERCORRENDO A OARRAYLIST E CONSULTANDO OS DADOS CADASTRADOS
                JOptionPane.showMessageDialog(null, "NOME: "+listadePessoas.get(n).getNome() +
                    "\nCPF: "+listadePessoas.get(n).getCpf()+ 
                    "\nIDADE: "+ listadePessoas.get(n).getIdade() + 
                    "\nENDEREÇO: "+listadePessoas.get(n).getEndereco() +
                    "\nSALDO BANCARIO: "+listadePessoas.get(n).getContaBancaria());
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"NOME EMPRESA: "+ ce.getNomeImpresa()+"\nENDEREÇO: "+ce.getEndereco()+"\n"+"CNPJ: "+ce.getCnpj());
                break;
            case 3:
                for(int q=0;q<listadeProtudos.size();q++){
                    JOptionPane.showMessageDialog(null, "Nome do Produto: "+listadeProtudos.get(q).getNomeProduto()+
                            "\nPreço do Produto: "+listadeProtudos.get(q).getPrecoProduto());
                }
            case 4:
                Encomenda en=new Encomenda();
                for(int q=0;q<listadeProtudos.size();q++){
                    int v=(Integer.parseInt(JOptionPane.showInputDialog("Informe numero correspondente ao item que  deseja encomendar")));
                    en.realizarEncomenda(listadeProtudos.get(v).getPrecoProduto());
                    JOptionPane.showMessageDialog(null,"Encomenda realizada com Sucesso!!");
                 }
                break;
                
                
        }
            
        }
        
        
       
    
    }
}
