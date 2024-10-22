package relogio;

public class tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora % 24; 
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto % 60; 
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo % 60; 
    }

    public int tempoTotalEmSegundos() {
        return (hora * 3600) + (minuto * 60) + segundo;
    }

    public void incrementarSegundo() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            incrementarMinuto();
        }
    }

    public void incrementarMinuto() {
        minuto++;
        if (minuto >= 60) {
            minuto = 0;
            incrementarHora();
        }
    }

    public void incrementarHora() {
        hora++;
        if (hora >= 24) {
            hora = 0;
        }
    }

    public void decrementarSegundo() {
        segundo--;
        if (segundo < 0) {
            segundo = 59;
            decrementarMinuto();
        }
    }

    public void decrementarMinuto() {
        minuto--;
        if (minuto < 0) {
            minuto = 59;
            decrementarHora();
        }
    }

    public void decrementarHora() {
        hora--;
        if (hora < 0) {
            hora = 23;
        }
    }

    public String formatarTempo() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
