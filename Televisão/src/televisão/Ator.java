package televisão;

public class Ator {
    private String nomeator, datanasc, email, nomeart, cidade, end, bairro, estado, status;
    private double salario, cache, ganhomensal;
    private Integer quantnov;
    Ator (){
   nomeator= null;
   datanasc=null;
   email=null;
   nomeart= null;
   cidade=null;
   end=null;
   bairro=null;
   estado=null;
   status= null;
   salario = 0.0;
   cache = 0.0;
   ganhomensal=0.0;
   quantnov=0;
    }
    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public Integer getQuantnov() {
        return quantnov;
    }

    public void setQuantnov(Integer quantnov) {
        this.quantnov = quantnov;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public String obterStatus ()
    {
        if (quantnov <= 3 && salario <= 5000)
        {
            status = "Calouro";
        }
        else if (quantnov <= 6)
        {
            status = "Revelacao";
        }
        else if (quantnov <= 6 && salario >= 30000)
        {
            status = "Joia";
        }
        else if (quantnov > 9 && salario <= 30000)
        {
            status = "Elenco de Apoio";
        }
        else if (salario >= 30000 && salario <= 100000)
        {
            status = "Elenco Principal";
        }
        else if (salario > 100000)
        {
            status = "Estrela";
        }
        else
        {
            status = "Elenco Regular";
        }
        return status;
     }
    
    public double calcularGanhos (Integer numeventos)
    {
        ganhomensal = (cache * numeventos) + salario;
        return ganhomensal;
    }
    }

