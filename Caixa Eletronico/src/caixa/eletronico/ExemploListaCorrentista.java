package caixa.eletronico;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaCorrentista {

    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<Cliente>();
        
        Cliente cli = new Cliente();
        
        cli.setNome("Fulano");
        cli.setCpf(1234);
        lista.add(cli);
        
        cli = new Cliente();
        
        cli.setNome("Beltrano");
        cli.setCpf(12345);
        lista.add(cli);
        
        cli = new Cliente();
        
        cli.setNome("Ciclano");
        cli.setCpf(123456);
        lista.add(cli);
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println (lista.get(i).getNome());
            System.out.println (lista.get(i).getCpf());
        }
        
    }
    
}
