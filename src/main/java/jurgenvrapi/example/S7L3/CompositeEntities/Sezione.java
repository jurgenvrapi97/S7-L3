package jurgenvrapi.example.S7L3.CompositeEntities;

import java.util.ArrayList;
import java.util.List;

class Sezione extends ElementoLibro {
    private List<ElementoLibro> elementi = new ArrayList<>();

    void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    @Override
    int getNumeroPagine() {
        int totale = 0;
        for (ElementoLibro elemento : elementi) {
            totale += elemento.getNumeroPagine();
        }
        return totale;
    }

    @Override
    void stampa() {
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }
}
