package televisão;

import javax.swing.JOptionPane;

public class TesteEmissora {

    public static void main(String[] args) {
        Emissora e = new Emissora ();
        
        String nomemis, endemis;
        int tv;
        
        JOptionPane.showMessageDialog(null,"Informações da Emissora");
        
        nomemis = JOptionPane.showInputDialog("Nome: ");
        e.setNomemis(nomemis);
        
        endemis = JOptionPane.showInputDialog("Endereço: ");
        e.setEndemis(endemis);
        
        tv = Integer.parseInt(JOptionPane.showInputDialog("TV aberta ou fechada? (1 para SIM 2 para NÃO"));
        if (tv== 1)
        {
            e.setTv(true);
        }
        else
            if (tv ==2)
        {
            e.setTv(false);
        }else JOptionPane.showMessageDialog(null, "Opção invalida");
        
        JOptionPane.showMessageDialog(null,"Informações da Emissora");
        
        JOptionPane.showMessageDialog(null,"Nome: " + e.getNomemis() +
                "\nEndereço: " + e.getEndemis() + 
                "\nTV: " + e.isTv());

    }
    
}
