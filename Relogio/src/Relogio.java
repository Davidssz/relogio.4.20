public class Relogio {

    // Atributos que representam a hora, minuto e segundo do relógio
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor padrão, inicializa o relógio com 00:00:00
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    // Construtor que permite configurar a hora, mantendo minutos e segundos como 0
    public Relogio(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            System.out.println("Valores da hora inválida retornando valores: 0:0:0. Deve estar no intervalo de 0 a 23.");
        }
        minuto = 0;
        segundo = 0;
    }

    // Construtor que permite configurar a hora e o minuto, mantendo segundos como 0
    public Relogio(int h, int m) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            hora = h;
            minuto = m;
        } else {
            System.out.println("Valores da hora ou minuto inválido retornando valores: 0:0:0. Hora deve estar no intervalo de 0 a 23, e minuto de 0 a 59.");
        }
        segundo = 0;
    }

    // Construtor que permite configurar a hora, o minuto e o segundo
    public Relogio(int h, int m, int s) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            hora = h;
            minuto = m;
            segundo = s;
        } else {
            System.out.println("Valor de Hora, minuto ou segundo inválido, retornando valor 0:0:0. Hora deve estar no intervalo de 0 a 23, minuto e segundo de 0 a 59.");
        }
    }

    // Método para configurar a hora, com verificação de validade de valores apropriados.
    public void setHora(int x) {
        if (x >= 0 && x <= 23) {
            hora = x;
        } else {
            System.out.println("Hora não atribuída pois o valor é inválido. Deve estar no intervalo de 0 a 23.");
        }
    }

    // Método para obter a hora
    public int getHora() {
        return hora;
    }

    // Método para configurar o minuto, com verificação de validade  de valores apropriados.
    public void setMinuto(int x) {
        if (x >= 0 && x <= 59) {
            minuto = x;
        } else {
            System.out.println("Minuto não atribuído pois o valor é inválido. Deve estar no intervalo de 0 a 59.");
        }
    }

    // Método para obter o minuto
    public int getMinuto() {
        return minuto;
    }

    // Método para configurar o segundo, com verificação de validade de valores apropriados. 
    public void setSegundo(int x) {
        if (x >= 0 && x <= 59) {
            segundo = x;
        } else {
            System.out.println("Segundo não atribuído pois o valor é inválido. Deve estar no intervalo de 0 a 59.");
        }
    }

    // Método para obter o segundo
    public int getSegundo() {
        return segundo;
    }
}
