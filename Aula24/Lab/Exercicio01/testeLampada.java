package Aula24.Lab.Exercicio01;

public class testeLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantia = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tensão: " + lampada.tensao);
        System.out.println("Garantia: " + lampada.garantia);
        System.out.println("Potência: " + lampada.potencia);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo de luz: " + lampada.tipoLuz);
        System.out.println("Tipo: " + lampada.tipos[0]);
    }
}
