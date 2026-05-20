package Aula24.Lab.Exercicios;

import java.util.Date;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
         livro.nome = "Entendendo Algoritmos";
         livro.autor = "Aditya Bhargava";
        livro.idioma = "Portugês";
        livro.publicacao = new Date();

        //Exercicio 3
        livro.emEstoque = 1;
        livro.preco = 67.90;

        //Exercicio 4
        livro.emprestado = false;
        livro.dataEmprestimo=null;
        livro.emprestadoA="";

        System.out.println(livro.publicacao);
    }
}
