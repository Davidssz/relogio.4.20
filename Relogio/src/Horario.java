public class Horario {
    public static void main(String[] args) {
        // Criar uma instância de Relogio usando o construtor padrão
        Relogio r1 = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("horario: " + r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
        System.out.println("\n\n");  // Adicionar espaçamento


        // Criar uma instância de Relogio usando um construtor que requer hora, minuto e segundo
        Relogio r2 = new Relogio(115, 70, 98);
        System.out.println("utilizando construtor que requer hora, minuto e segundo");
        System.out.println("horario: " + r2.getHora() + ":" + r2.getMinuto() + ":" + r2.getSegundo());
        System.out.println("\n\n");  // Adicionar espaçamento


        // Criar uma instância de Relogio usando um construtor que requer apenas a hora
        Relogio r3 = new Relogio(20);
        System.out.println("utilizando construtor que requer apenas a hora");
        System.out.println("horarios: " + r3.getHora() + ":" + r3.getMinuto() + ":" + r3.getSegundo());
        System.out.println("\n\n");  // Adicionar espaçamento


        // Criar uma instância de Relogio usando um construtor que requer hora e minuto
        Relogio r4 = new Relogio(10, 30);
        System.out.println("utilizando construtor que requer hora e minuto");
        System.out.println("horario: " + r4.getHora() + ":" + r4.getMinuto() + ":" + r4.getSegundo());
        System.out.println("\n\n");  // Adicionar espaçamento


        // Criar uma instância de Relogio usando o construtor padrão
        Relogio r5 = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("mas atribuindo valores atraves dos metodos de acesso");

        // Configurar valores de hora, minuto e segundo usando os métodos de acesso da instância r5
        r5.setHora(13);
        r5.setMinuto(40);
        r5.setSegundo(10);
        System.out.println("horario: " + r5.getHora() + ":" + r5.getMinuto() + ":" + r5.getSegundo());
        System.out.println("\n\n");  // Adicionar espaçamento
    }
}
