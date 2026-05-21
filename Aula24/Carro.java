package Aula24;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //ATRIBUINDO UM METODO VAZIO.
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    //ATRIBUINDO UM METODO COM RETORNO.
    double obterAutonomia() {
        System.out.println("Metodo Obter autonomia");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel( double km){
        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
