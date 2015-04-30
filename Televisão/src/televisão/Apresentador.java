package televisão;

public class Apresentador {
    String nomeap, datanascap, emailap, nomeartap, cidadeap, endap, bairroap, estadoap;
    double salarioap, cacheap, merchandising, ganhomensal;

    Apresentador()
    {
        nomeap = null;
        datanascap = null;
        emailap = null;
        nomeartap = null;
        cidadeap = null;
        endap = null;
        bairroap = null;
        estadoap = null;
        salarioap = 0.0;
        cacheap = 0.0;
        merchandising = 0.0;
        ganhomensal = 0.0;
    }
    
    public String getNomeap() {
        return nomeap;
    }

    public void setNomeap(String nomeap) {
        this.nomeap = nomeap;
    }

    public String getDatanascap() {
        return datanascap;
    }

    public void setDatanascap(String datanascap) {
        this.datanascap = datanascap;
    }

    public String getEmailap() {
        return emailap;
    }

    public void setEmailap(String emailap) {
        this.emailap = emailap;
    }

    public String getNomeartap() {
        return nomeartap;
    }

    public void setNomeartap(String nomeartap) {
        this.nomeartap = nomeartap;
    }

    public String getCidadeap() {
        return cidadeap;
    }

    public void setCidadeap(String cidadeap) {
        this.cidadeap = cidadeap;
    }

    public String getEndap() {
        return endap;
    }

    public void setEndap(String endap) {
        this.endap = endap;
    }

    public String getBairroap() {
        return bairroap;
    }

    public void setBairroap(String bairroap) {
        this.bairroap = bairroap;
    }

    public String getEstadoap() {
        return estadoap;
    }

    public void setEstadoap(String estadoap) {
        this.estadoap = estadoap;
    }

    public double getSalarioap() {
        return salarioap;
    }

    public void setSalarioap(double salarioap) {
        this.salarioap = salarioap;
    }

    public double getCacheap() {
        return cacheap;
    }

    public void setCacheap(double cacheap) {
        this.cacheap = cacheap;
    }

    public double getMerchandising() {
        return merchandising;
    }

    public void setMerchandising(double merchandising) {
        this.merchandising = merchandising;
    }
    
    public double calcularGanhos (Integer numeventos)
    {
        ganhomensal = (cacheap * numeventos) + salarioap + merchandising;
        return ganhomensal;       
    }
}
