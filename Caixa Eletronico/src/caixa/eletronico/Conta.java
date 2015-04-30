package caixa.eletronico;

public class Conta {
    private String agencia, numeroconta, nomecorrentista;
    private Boolean ativa; 
    private Double saldo;

    public Conta() // metodo construtor (executa quando "new Conta()"
    {
        saldo = 0.0;
        agencia = null;  // null, significa não atribuido 
        nomecorrentista = null;
        numeroconta = null;
        ativa = false;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getNomecorrentista() {
        return nomecorrentista;
    }

    public void setNomecorrentista(String nomecorrentista) {
        this.nomecorrentista = nomecorrentista;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    public void Abrir (String nome, String ag, String numero)
    {
        nomecorrentista = nome;
        agencia = ag;
        numeroconta = numero;  
        
        ativa = true;
        saldo = 0.0;
    }
    
    public Boolean Deposito (Double valor)
    {      
        if (ativa == true)
        {
            saldo = saldo + valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double retornaSaldo ()
    {
        return saldo;
    }
    
    public Boolean Sacar (double valor)
    {
        if (ativa == true)
        {
            if (valor > saldo)
                return false;
            else
            {
                saldo = saldo - valor;
                return true;
            }
        }
        else
        {
            return false;
        }
            
    }
    
    public void fecharConta ()
    {
        ativa = false;
    }
    
    
}
