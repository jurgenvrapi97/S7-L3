package jurgenvrapi.example.S7L3.CompositeEntities;

import java.util.ArrayList;
import java.util.List;

class Libro extends Sezione {
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    double getPrezzo() {
        return prezzo;
    }

    List<String> getAutori() {
        return autori;
    }
}
