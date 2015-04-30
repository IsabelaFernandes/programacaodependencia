package caixa.eletronico;   
    import java.util.ArrayList;
    import java.util.List;
public class ExemploLista {

    public static void main(String[] args) {      
        List<String> jogadores = new ArrayList<String>();
        
        jogadores.add("Kaka");
        jogadores.add("Robinho");
        jogadores.add("Vampeta");
        jogadores.add("Caça Rato");
        jogadores.add("Perdigão");
        jogadores.add("Sotilli");
        jogadores.remove(2);
        
        /*for (int i = 0; i < jogadores.size(); i++) 
        {
            System.out.println (jogadores.get(i).toUpperCase());
        }*/
        
        for (String jog : jogadores) 
        {
            System.out.println(jog);
        }
    }
    
}
