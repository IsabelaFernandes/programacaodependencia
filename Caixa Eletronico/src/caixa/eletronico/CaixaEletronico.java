package caixa.eletronico;
    import javax.swing.JOptionPane;
public class CaixaEletronico {
    private static String nome;
    private static String numero;
    private static String agencia;

    public static void main(String[] args) {
         Integer opcao = -1;      
        Conta c = new Conta();
        Cliente cl = new Cliente();
        Banco b = new Banco ();
        
         String banco = null;
        
        while (opcao!=0)
        {
            opcao = Integer.parseInt( JOptionPane.showInputDialog("CAIXA ELETRONICO\n\n"+"1- Abrir\n"+"2- Depositar\n"+"3- Sacar\n"+"4- Saldo\n"
                                                                    +"5- Fechar\n"+"6- Resumo\n"+"7- Verificar Banco\n"+ "0- Sair"));
            
            
        
        switch(opcao){
            case 1 :
              
        JOptionPane.showMessageDialog(null,"ABERTURA DE CONTA");
        nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        banco = JOptionPane.showInputDialog("Informe o banco: ");
        numero = JOptionPane.showInputDialog("Informe o numero da conta: ");
        agencia = JOptionPane.showInputDialog("Informe a agencia: ");
        c.Abrir(nome, nome, numero);
       JOptionPane.showMessageDialog(null, "CONTA ABERTA COM SUCESSO");
                break;
               
        case 2:
            String deposito;
            JOptionPane.showMessageDialog(null,"DEPOSITO");
        deposito = JOptionPane.showInputDialog("Informe o valor do deposito: ");
        
        if (c.Deposito(Double.parseDouble(deposito)) == false)
        {
            JOptionPane.showMessageDialog(null,"Deposito não realizado, a conta ainda não esta aberta");
        }
        else{
            JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso");
            
        }
        break;
        case 3:
            String saque;
         saque = JOptionPane.showInputDialog("Informe o valor do saque: ");
        if (c.Sacar(Double.parseDouble(saque)) == false)
        {
            JOptionPane.showMessageDialog(null,"Saque não realizado! A conta não esta aberta ou não há saldo suficiente: ");
        }
        else{
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso");
        }break;
        case 4:
             
        JOptionPane.showMessageDialog(null,"Saldo restante: " + c.retornaSaldo()); 
        break;
        case 5:
            int f = JOptionPane.showConfirmDialog (null, "Deseja fechar conta?");
            System.out.println(f); 
           if (f ==0){
                c.fecharConta();
                JOptionPane.showMessageDialog(null, "CONTA FECHADA COM SUCESSO");
            }else{
            JOptionPane.showMessageDialog(null, "A CONTA CONTINUA ABERTA");
            }
            break;
        case 6:
            
        JOptionPane.showMessageDialog(null,"DADOS DO CLIENTE: \n"
                + "Nome do Cliente: " +nome  + "\nNumero: "+numero +"\nAgencia: "+agencia+"\nSaldo: "+ c.retornaSaldo()); 
            break;
        case 7:
            JOptionPane.showMessageDialog(null, "Banco da Conta: "+banco);
            break;
        default:
            opcao = 0;
            break;
                    }       
        }
        
       
        
}
    
}
