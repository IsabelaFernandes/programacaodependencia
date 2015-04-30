package cassino;

import java.util.Objects;


public class Dados {
    private Conta conta = new Conta();
        private Integer dado1;
        private Integer dado2;    
        private Integer escolhauser;
        private Integer somadados=0;
        private Integer aposta=0;
        private Integer x=0;
        
    public Dados() 
    {
        dado1 = 1 + (int)(Math.random() * 6);
        dado2 = 1 + (int)(Math.random() * 6);
        somadados = dado1 + dado2;
    }
        
    public Integer getX() {
        return x;
    }

    public void setXiu(Integer x) {
        this.x = x;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public Integer getDado1() {
        return dado1;
    }

    public void setDado1(Integer dado1) {
        this.dado1 = dado1;
    }

    public Integer getDado2() {
        return dado2;
    }

    public void setDado2(Integer dado2) {
        this.dado2 = dado2;
    }

    public Integer getEscolhauser() {
        return escolhauser;
    }

    public void setEscolhauser(Integer escolhauser) {
        this.escolhauser = escolhauser;
    }
    
    public Integer getSomadados() {
        return somadados;
    }

    public Integer getAposta() {
        return aposta;
    }

    public void setAposta(Integer aposta) {
        this.aposta = aposta;
    }

    
    public void setSomadados(Integer somadados) {
        this.somadados = dado1 + dado2;
    }
    
     public Double ganhagold() {
        Double retornou = null;
         if(Objects.equals(somadados, escolhauser))   
            {
                
              retornou = conta.getGold() + (aposta * 12);
              conta.setGold(retornou);
            } 
         x = escolhauser;
         if (escolhauser == x - 1)
            {
                retornou = conta.getGold() + (aposta * 5);
                conta.setGold(retornou);
            }
         if (escolhauser == x + 1)
            {
                retornou = conta.getGold() + (aposta * 5);
                conta.setGold(retornou);
            }
         else
            {
               retornou = conta.getGold() - aposta;
               conta.setGold(retornou);
             }
            return retornou;      
     }       
}