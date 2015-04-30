package cassino;

import javax.swing.JOptionPane;

public class Cassino {

    public static void main(String[] args) {
        
    Integer opcao = -1;
    
    Conta conta = new Conta();
    Dados dados = new Dados();
    
      while(opcao!=0){
          
      opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n 1 - Criar conta \n2 - Entrar na conta"
                                  + " \n3 - Adicionar cash na conta \n4 - Comprar roupa \n5 - Resumo \n6 - Dados \n0 - Sair"));
        if(opcao==1){
             Boolean deucerto=conta.realizarCadastro(JOptionPane.showInputDialog("Digite o seu nome: "), 
                                                     JOptionPane.showInputDialog("Digite o login que deseja usar: "),
                                                     JOptionPane.showInputDialog("Digite a senha: "),
                                                     JOptionPane.showInputDialog("Confirme a sua senha:"));
        
        if(deucerto==true)
        JOptionPane.showMessageDialog(null, "A sua conta foi criada com sucesso!");
        else
        JOptionPane.showMessageDialog(null, "A sua conta não pode ser criada!");}
        else
        if(opcao==2){
        Boolean senha;
        senha = conta.abrir(JOptionPane.showInputDialog("Digite o seu login:"), JOptionPane.showInputDialog("digite a sua senha:"));
        
        if(senha==true)
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
        else JOptionPane.showMessageDialog(null,"Não foi possível logar!");
        }else if(opcao==3){
            Boolean cash;
            Double valor;
            valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja gastar: "));
            cash=conta.inserirCash(JOptionPane.showInputDialog("Digite o número do cartao de credito"),valor);
        
            
            if(cash==true)
                JOptionPane.showMessageDialog(null, "O valor depositado com sucesso");
            else JOptionPane.showMessageDialog(null, "O valor não pode ser depositado");
        }
        if(opcao==4){
            Boolean item;
            
            item=conta.comprarRoupa(JOptionPane.showInputDialog("Roupa \n\n 1-terno 40"
                                                                + "\n 2-smoking 45"
                                                                + "\n 3-vestido rosa 35"
                                                                + "\n 4-tubinho dourado 55\n\n"
                                                                + "\n\n Acessorios   "
                                                                + "\n5- relogio dourado 50 "
                                                                + "\n 6-sem relogio 100"
                                                                + "\n 7- pulseira preta 30"
                                                                + "\n 8- pulseira rosa 60 "
                                                                + "\n\n Calcados\n\n"
                                                                + "\n 9- sem sapato 100"
                                                                + "\n 10-sapato de luxo preto 20"
                                                                + "\n 11- nike rasgado 80"
                                                                + "\n 12- sapato furado na ponta 150"
                                                                + "\n 13- sapato de salto alto 1000"));
            if(item==true)
                JOptionPane.showMessageDialog(null, "A compra foi feita com sucesso!!");
            else JOptionPane.showMessageDialog(null, "A compra não foi efeituada!!");
          }
        if(opcao==5){
            JOptionPane.showMessageDialog(null, 
                                            "\nNome: "+conta.getNome()
                                          +"\nLogin: "+conta.getLogin()
                                          +"\nGold da conta: "+conta.getGold()
                                          +"\nCash da Conta: "+conta.getCash()
                                          +"\nAcessórios do jogador: "+conta.getAcessorio()
                                          +"\nRoupas do jogador: "+conta.getRoupa()
                                          +"\nSapatos do jogador: "+conta.getSapato());
        }
        
        if(opcao == 6){
           dados.setAposta (Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto você quer apostar?")));
           dados.setEscolhauser (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual número você aposta? de 2 a 12")));
           JOptionPane.showMessageDialog(null,"Você apostou:\n"+dados.getAposta()
                                         +" Golds\n No número:\n"
                                        +dados.getEscolhauser());
           
           JOptionPane.showMessageDialog(null,"O dado 1 caiu no número "+dados.getDado1());
           JOptionPane.showMessageDialog(null,"O dado 2 caiu no número "+dados.getDado2());
           JOptionPane.showMessageDialog(null,"A Soma dos dados é: "+dados.getSomadados());
            JOptionPane.showMessageDialog(null,"Você ganhou:\n"+dados.ganhagold());
           
           
        }
      }
   }
}