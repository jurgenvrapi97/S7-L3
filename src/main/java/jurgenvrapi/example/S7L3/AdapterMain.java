package jurgenvrapi.example.S7L3;


import jurgenvrapi.example.S7L3.adapterEntities.DataSource;
import jurgenvrapi.example.S7L3.adapterEntities.Info;
import jurgenvrapi.example.S7L3.adapterEntities.UserData;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AdapterMain {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.DataDiNascita(new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime());


        DataSource ds = new InfoAdapter(info);


        UserData userData = new UserData();
        userData.getData(ds);


        System.out.println("Nome completo: " + userData.nomeCompleto);
        System.out.println("Età: " + userData.età);
    }
}
