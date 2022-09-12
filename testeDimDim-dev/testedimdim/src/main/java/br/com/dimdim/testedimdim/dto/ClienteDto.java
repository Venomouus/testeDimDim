package br.com.dimdim.testedimdim.dto;

public record ClienteDto (

    Long id,
    String nome,
    int idade,
    String endereco

) {

     public ClienteDto(String nome, int idade, String endereco){
          this(0l, nome, idade, endereco);
     }

}
