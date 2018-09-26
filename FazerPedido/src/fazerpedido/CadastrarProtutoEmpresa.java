package fazerpedido;

import javax.swing.JOptionPane;

public class CadastrarProtutoEmpresa extends CadastrarEmpresa {//HERANÇA
    private String nomeProduto;
    private float precoProduto;
    @Override
    public void CadastrarProduto(){//SOBRESCREVENDO O MÉTODO DA CLASSE PAI
         this.setNomeProduto(JOptionPane.showInputDialog("Informe o nome"));
         this.setPrecoProduto(Integer.parseInt(JOptionPane.showInputDialog("Informe o Preço do Produto")));
         JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!!");
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    
}
