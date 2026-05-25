package Aula25;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
        System.out.println(van.marca + "\n" + van.modelo + "\n" + van.numPassageiros + "\n" + van.capCombustivel + "\n" + van.consumoCombustivel);
        Carro van2 = new Carro("Fiat", "Ducato");
        System.out.println(van2.marca + "\n" + van2.modelo);


    }
}
