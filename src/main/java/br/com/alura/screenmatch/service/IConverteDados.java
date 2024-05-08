package br.com.alura.screenmatch.service;

public interface IConverteDados {
    /*T em genercis é uma entidade genérica para
    quando não sabemos que entidade será devolvida

    O método "obterDados precisará  como argumento de um json
     e de uma classe de retornando algo, no caso como não
     se sabe ainda, o retorno tembém tem de ser "T".*/

    <T> T obterDados(String json, Class<T> classe);
}
