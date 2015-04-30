package caixa.eletronico;
    import java.util.ArrayList;
    import java.util.List;
public class ExemploListaBanco {

    public static void main(String[] args) {
        List<Banco> lista = new ArrayList<Banco>();
        
        Banco b = new Banco();        
        b.setNome("Banco do Brasil");
        b.setNumero("001");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Banco do Estado do Sergipe");
        b.setNumero("047");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Banco do Estado do Pará");
        b.setNumero("037");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Banco do Estado do RIO GRANDE DO SUL ");
        b.setNumero("041");
        
        lista.add(b);
        
        b = new Banco();
        b.setNome("Banco do NORDESTE DO BRASIL");
        b.setNumero("004");
        
        lista.add(b);
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println (lista.get(i).getNome());
            System.out.println (lista.get(i).getNumero());
        }
    }
    
}
