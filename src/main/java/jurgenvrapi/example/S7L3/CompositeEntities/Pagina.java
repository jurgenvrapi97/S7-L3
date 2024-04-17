package jurgenvrapi.example.S7L3.CompositeEntities;

class Pagina extends ElementoLibro {
    private int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    int getNumeroPagine() {
        return 1;
    }

    @Override
    void stampa() {
        System.out.println("Stampa pagina " + numero);
    }
}
