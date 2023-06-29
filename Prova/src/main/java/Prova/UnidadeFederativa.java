package Prova;

public enum UnidadeFederativa {
    BAHIA("Bahia", 'B'),
    SAO_PAULO("São Paulo", 'S'),
    RIO_DE_JANEIRO("Rio de Janeiro", 'R');
    
    private String nome;
    private char sigla;

    private UnidadeFederativa(String nome, char sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public char getSigla() {
        return sigla;
    }
    

  
   
    
  
}