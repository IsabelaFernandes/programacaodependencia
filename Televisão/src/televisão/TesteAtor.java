package televisão;
    import javax.swing.JOptionPane;
public class TesteAtor {

    public static void main(String[] args) {
    String nomeator, datanasc, email = "", nomeart, cidade, end, bairro, estado, status, salario = "", cache, ganhomensal, quantnov, numeventos;
    
    Ator a = new Ator ();
    
    JOptionPane.showMessageDialog(null,"Informações do Ator");
    
    nomeator = JOptionPane.showInputDialog("Nome: ");
    a.setNomeator(nomeator);
    
    datanasc = JOptionPane.showInputDialog("Data de Nascimento: ");
    a.setDatanasc(datanasc);
    
    nomeart = JOptionPane.showInputDialog("Email: ");
    a.setEmail(email);
    
    cidade = JOptionPane.showInputDialog("Cidade: ");
    a.setCidade(cidade);
    
    end = JOptionPane.showInputDialog("Endereço: ");
    a.setEnd(end);
    
    bairro = JOptionPane.showInputDialog("Bairro: ");
    a.setBairro(bairro);
    
    estado = JOptionPane.showInputDialog("Estado: ");
    a.setEstado(estado);
    
    salario = JOptionPane.showInputDialog("Salario: ");
    a.setSalario(Double.parseDouble(salario));
    
    cache = JOptionPane.showInputDialog("Cache: ");
    a.setCache(Double.parseDouble(cache));
    
    quantnov = JOptionPane.showInputDialog("Quantidade de Novelas: ");  
    a.setQuantnov(Integer.parseInt(cache));
    
    numeventos = JOptionPane.showInputDialog("Número de Eventos: ");
    
    JOptionPane.showMessageDialog(null,"Informações do Ator");
    JOptionPane.showMessageDialog(null,"Nome: " + a.getNomeator() +
            "\nData de Nascimento: " + a.getDatanasc() +
            "\nEmail: " + a.getEmail() + 
            "\nCidade: " + a.getCidade() + 
            "\nEndereço: " + a.getEnd() + 
            "\nBairro: " + a.getBairro() + 
            "\nEstado " + a.getEstado() + 
            "\nSalario: " + a.getSalario() + 
            "\nCache: " + a.getCache() + 
            "\nQuantidade de Novelas: " + a.getQuantnov() + 
            "\nStatus: " + a.obterStatus() + 
            "\nGanhos Mensais: " + a.calcularGanhos(Integer.parseInt(numeventos)));
    }
    
}
