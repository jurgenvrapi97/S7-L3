package jurgenvrapi.example.S7L3;

import jurgenvrapi.example.S7L3.adapterEntities.DataSource;
import jurgenvrapi.example.S7L3.adapterEntities.Info;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();

        birthDate.setTime(info.getDataDiNascita());
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)){
            age--;
        }

        return age;
    }
}
