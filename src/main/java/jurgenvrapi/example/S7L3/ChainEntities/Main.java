package jurgenvrapi.example.S7L3.ChainEntities;

public class Main {
    public static void main(String[] args) {
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        tenente.verificaStipendio(4000);
    }
}
