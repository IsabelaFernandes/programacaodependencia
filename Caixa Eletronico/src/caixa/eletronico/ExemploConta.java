package caixa.eletronico;
    import java.util.ArrayList;
    import java.util.List;
public class ExemploConta {

    public static void main(String[] args) {
        List <Conta> Contas = new ArrayList<Conta>();
        
        //Criar uma conta       
        Conta c = new Conta();
        c.Abrir("ISABELA","001","123");
        
        //Adiciona na lista
        Contas.add(c);
        
        c = new Conta();
        c.Abrir("ISABELA","123","001");
        Contas.add(c);
        
        for (Conta conta : Contas) 
        {
            System.out.println(conta.getNomecorrentista());
        }
    }
    
}
