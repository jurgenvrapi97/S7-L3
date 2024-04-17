package jurgenvrapi.example.S7L3.ChainEntities;

abstract class Ufficiale {
    protected int stipendio;
    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void verificaStipendio(int stipendio) {
        if (this.stipendio <= stipendio) {
            System.out.println(getClass().getSimpleName() + " percepisce almeno " + stipendio);
        }
        if (superiore != null) {
            superiore.verificaStipendio(stipendio);
        }
    }
}
