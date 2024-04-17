package jurgenvrapi.example.S7L3.CompositeEntities;




public class CompositeMain {
    public static void main(String[] args) {

        Libro libro = new Libro();
        libro.aggiungiAutore("Autore 1");
        libro.setPrezzo(15.99);

        Sezione sezione1 = new Sezione();
        sezione1.aggiungiElemento(new Pagina(1));
        sezione1.aggiungiElemento(new Pagina(2));

        Sezione sezione2 = new Sezione();
        sezione2.aggiungiElemento(new Pagina(3));
        sezione2.aggiungiElemento(new Pagina(4));


        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);


        libro.stampa();


        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
    }
}
