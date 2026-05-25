package Aula26;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro van = new Carro();
        van.setMarca(scan.nextLine());
        System.out.println(van.getMarca());

    }
}
