package televisão;
    import javax.swing.JOptionPane;
public class TesteApresentador {

    public static void main(String[] args) {
        Apresentador ap = new Apresentador ();
        
        String nomeap, datanascap, emailap, nomeartap, cidadeap, endap, bairroap, estadoap, salarioap, cacheap, merchandising, ganhomensal, numeventosap;
        
        JOptionPane.showMessageDialog(null,"Informações do Apresentador");
        
        nomeap = JOptionPane.showInputDialog("Nome: ");
        ap.setNomeap(nomeap);
        
        nomeartap = JOptionPane.showInputDialog("Nome Artístico: ");
        ap.setNomeartap(nomeartap);
    
        datanascap = JOptionPane.showInputDialog("Data de Nascimento: ");
        ap.setDatanascap(datanascap);
        
        emailap = JOptionPane.showInputDialog("Email: ");
        ap.setEmailap(emailap);
    
        cidadeap = JOptionPane.showInputDialog("Cidade: ");
        ap.setCidadeap(cidadeap);
    
        endap = JOptionPane.showInputDialog("Endereço: ");
        ap.setEndap(endap);
    
        bairroap = JOptionPane.showInputDialog("Bairro: ");
        ap.setBairroap(bairroap);
    
        estadoap = JOptionPane.showInputDialog("Estado: ");
        ap.setEstadoap(estadoap);
    
        salarioap = JOptionPane.showInputDialog("Salario: ");
        ap.setSalarioap(Double.parseDouble(salarioap));
    
        cacheap = JOptionPane.showInputDialog("Cache: ");
        ap.setCacheap(Double.parseDouble(cacheap));
        
        numeventosap = JOptionPane.showInputDialog("Número de Eventos: ");
        
        JOptionPane.showMessageDialog(null,"Informações do Apresentador");
        
        JOptionPane.showMessageDialog(null,"Nome: " + ap.getNomeap() +
                "\nNome Artístico: " + ap.getNomeartap() + 
                "\nData de Nascimento: " + ap.getDatanascap() + 
                "\nEmail: " + ap.getEmailap() + 
                "\nCidade: " + ap.getCidadeap() + 
                "\nEndereço: " + ap.getEndap() + 
                "\nBairro: " + ap.getBairroap() + 
                "\nEstado: " + ap.getEstadoap() + 
                "\nSalario: " + ap.getSalarioap() + 
                "\nCache: " + ap.getCacheap() + 
                "\nGanhos Mensais: " + ap.calcularGanhos(Integer.parseInt(numeventosap)));
    }
    
}
