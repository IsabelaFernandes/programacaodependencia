package televisão;

public class Novela {
    private String titulo, datapcap, dataucap, horaexib, autor, emissora;
    private boolean violencia, sexo, drogas;
    private Integer ibope;
Novela (){
    titulo = null;
     datapcap= null;
     dataucap=null;
     horaexib= null;
     autor=null;
     emissora= null;
     violencia = false;
     sexo=false;
     drogas= false;
     ibope= 0;
   
}
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatapcap() {
        return datapcap;
    }

    public void setDatapcap(String datapcap) {
        this.datapcap = datapcap;
    }

    public String getDataucap() {
        return dataucap;
    }

    public void setDataucap(String dataucap) {
        this.dataucap = dataucap;
    }

    public String getHoraexib() {
        return horaexib;
    }

    public void setHoraexib(String horaexib) {
        this.horaexib = horaexib;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Integer getIbop() {
        return ibope;
    }

    public void setIbop(Integer ibop) {
        this.ibope = ibop;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean violencia) {
        this.violencia = violencia;
    }

    public String isSexo() {
        String vsexo;
        if(sexo == true){
           vsexo= "sim";
        }
        else vsexo = "não";
        
        return vsexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }
    
    public Integer obterClassificacao ()
    {
        Integer classificacao;
        if (violencia == false && sexo == false && drogas == false)
        {
            classificacao = 0;
        }
        else if (violencia == true && sexo == false && drogas == false)
        {
            classificacao = 14;
        }
        else if (violencia == true && sexo == false || sexo == true && drogas == true)
        {
            classificacao = 16;
        }
        else
        {
            classificacao = 18;
        }
        return classificacao;
    }
    
    public Integer obterTelespectadores ()
    {
        return (ibope * 10000);
    }
    
}
