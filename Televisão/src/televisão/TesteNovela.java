package televisão;

import javax.swing.JOptionPane;

public class TesteNovela {

    public static void main(String[] args) {
        
        String titulo, datapcap, dataucap, horaexib, autor, emissora, ibope;
        int sexo, violencia, drogas;
    
        Novela n = new Novela();
    
        JOptionPane.showMessageDialog(null,"Informações da Novela");
        
        titulo = JOptionPane.showInputDialog("Título: ");
        n.setTitulo(titulo);
        
        datapcap = JOptionPane.showInputDialog("Duração da Novela, \nPrimeiro Capítulo: ");
        n.setDatapcap(datapcap);
        
        dataucap = JOptionPane.showInputDialog("Duração da Novela, \nÚltimo Capítulo: ");
        n.setDataucap(dataucap);
        
        horaexib = JOptionPane.showInputDialog("Horário de Exibição: ");
        n.setHoraexib(horaexib);
        
        autor = JOptionPane.showInputDialog("Autor: ");
        n.setAutor(autor);
        
        emissora = JOptionPane.showInputDialog("Emissora que a transmite: ");
        n.setEmissora(emissora);
        
        violencia = Integer.parseInt(JOptionPane.showInputDialog("Possui cenas de violência? (1 para sim 2 para nao):"));
        if (violencia == 1){
            n.setViolencia(true);
        }
        else
            if (violencia == 2){
                n.setViolencia(false);
            }
            else JOptionPane.showMessageDialog(null,"opção inválida");
    
        sexo = Integer.parseInt(JOptionPane.showInputDialog("Possui cenas de sexo? (1 para sim e 2 para nao):"));
        if (sexo == 1){
            n.setSexo(true);
        }
        else
        if (sexo == 2 ){
            n.setSexo(false);
        }
        else JOptionPane.showMessageDialog(null," opção invalida");
            
            
        
    drogas = Integer.parseInt(JOptionPane.showInputDialog("Possui cenas de drogas? (1 para sim e 2 para nao):"));
        if (drogas == 1){
            n.setDrogas(true);
        }
        else
        if (drogas == 2 ){
            n.setDrogas(false);
        }
        else JOptionPane.showMessageDialog(null," opção invalida");
        
        ibope = JOptionPane.showInputDialog("Pontuação média do ibope: ");
        n.setIbop(Integer.parseInt(ibope));
        
        JOptionPane.showMessageDialog(null,"Informações da Novela:");
        JOptionPane.showMessageDialog(null,"Título: " + n.getTitulo() +
            "\nData do Primeiro Capítulo: " + n.getDatapcap() +
            "\nData do Último Capítulo: " + n.getDataucap() + 
            "\nHorário de Exibição: " + n.getHoraexib() + 
            "\nAutor: " + n.getAutor() + 
            "\nEmissora que a transmite: " + n.getEmissora() + 
            "\nCenas de violência: " + violencia + 
            "\nCenas de sexo: " + n.isSexo()  + 
            "\nCenas com drogas: " + drogas + 
            "\nPontuação do Ibope: " + n.getIbop() + 
            "\nClassificacao: " + n.obterClassificacao() +
            "\nTelespectadores: " + n.obterTelespectadores());
    }
    
}
