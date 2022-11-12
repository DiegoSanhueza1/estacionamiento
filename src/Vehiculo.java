public class Vehiculo {
    private String patente;
    private String modelo;
    private String marca;
    private String nombre_Dueño;
    private String rut_dueño;

    public Vehiculo(String patente, String modelo, String marca, String nombre_Dueño, String rut_dueño) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.nombre_Dueño = nombre_Dueño;
        this.rut_dueño = rut_dueño;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre_Dueño='" + nombre_Dueño + '\'' +
                ", rut_dueño='" + rut_dueño + '\'' +
                '}';
    }
}
