package caixa.eletronico;

public class Cliente { 
    private Integer cpf, datanasc;
    private String nome, endereco;
    private boolean spc, serasa;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Integer datanasc) {
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void atribuiSpc (boolean valor)
    {
        spc = valor;
    }
    
    public boolean retornaSpc ()
    {
        return spc;
    }
    
    public void atribuiSerasa (boolean valor)
    {
        serasa = valor;
    }
    
    public boolean retornaSerasa ()
    {
        return serasa;
    }
}
