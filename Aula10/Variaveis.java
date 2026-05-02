package Aula10;

public class Variaveis {

    public static void main(String[] args) {

        //Convenção Java
        int idade = 20;
        String nome = "Gustavo";
        String nomeDoMeuCachorro = "Floquinho";
        String ano2026 = "2026";

        //Aceito, mas não utilizado
        int _idade = 25;
        int $idade = 25;

        //Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        //Má prátrica
        int a = 20;
        String b = "Gustavo";

        System.out.print("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
