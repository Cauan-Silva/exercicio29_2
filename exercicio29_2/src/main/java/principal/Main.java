package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora, minuto e segundo:");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int segundo = sc.nextInt();

        Tempo tempo = new Tempo(hora, minuto, segundo);

        System.out.println("Tempo atual: " + tempo.formatarTempo());

        tempo.incrementarSegundo();
        System.out.println("Após incrementar segundo: " + tempo.formatarTempo());

        tempo.incrementarMinuto();
        System.out.println("Após incrementar minuto: " + tempo.formatarTempo());

        tempo.incrementarHora();
        System.out.println("Após incrementar hora: " + tempo.formatarTempo());

        // Testando os decrementos
        tempo.decrementarSegundo();
        System.out.println("Após decrementar segundo: " + tempo.formatarTempo());

        tempo.decrementarMinuto();
        System.out.println("Após decrementar minuto: " + tempo.formatarTempo());

        tempo.decrementarHora();
        System.out.println("Após decrementar hora: " + tempo.formatarTempo());

        System.out.println("Tempo total em segundos: " + tempo.tempoTotalEmSegundos());

        sc.close();
    }
}
