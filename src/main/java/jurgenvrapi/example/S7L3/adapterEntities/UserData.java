package jurgenvrapi.example.S7L3.adapterEntities;



public class UserData {
    public String nomeCompleto;
    public int età;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        età = ds.getEta();
    }
}
