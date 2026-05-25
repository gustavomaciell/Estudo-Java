package Aula26.Labs.Exercicio01;

public class Lampada {

    private boolean ligada;

    public Lampada() {
        this.ligada = true;
    }

    void estadoAtual() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    void ligarLampada() {
        if (ligada) {
            System.out.println("A lâmpada ja está ligada.");
        } else {
            ligada= false;
            System.out.println("Você ligou a lâmpada.");
        }
    }

    void desligarLampada() {
        if (!ligada) {
            System.out.println("A lâmpada ja está desligada.");
        } else {
            ligada = true;
            System.out.println("Você desligou a lâmpada.");
        }
    }
}
