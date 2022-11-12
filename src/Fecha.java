import java.util.Calendar;

public class Fecha {

    private int anio;

    private int mes;

    private int dia;

    private String hora_Registro;

    Calendar calendario = Calendar.getInstance();

    public Fecha(int anio, int mes, int dia, String hora_Registro, Calendar calendario) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora_Registro = hora_Registro;
        this.calendario = calendario;
    }
}
