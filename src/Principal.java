import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vE= 0;
        System.out.println("cuantos estacionamiento tiene");
        int num_estacionamientos = teclado.nextInt();
        Vehiculo vehiculos[] = new Vehiculo[num_estacionamientos];
        menu(vehiculos,vE);
    }

    private static void menu(Vehiculo[] vehiculos, int vE) {
        System.out.println("Menu");
        System.out.println("(1)entrar");
        System.out.println("(2)salir del estacionamiento");
        System.out.println("(3)ver vehiculos del estacionamiento");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("indique el numero de estacionamiento que desea");
                int numDeseado = teclado.nextInt();
                agregarVehiculo(vehiculos,vE,numDeseado);
                break;
            case 2:quitarVehiculo(vehiculos,vE);
                break;
            case 3:verVehiculos(vehiculos,vE);
            break;
        }
    }

    private static void quitarVehiculo(Vehiculo[] vehiculos,int vE) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("indique su numero de estacionamiento");
        int numEstacionamiento = teclado.nextInt();
        vehiculos[numEstacionamiento] = null;
        menu(vehiculos,vE);
    }

    private static void agregarVehiculo(Vehiculo[] vehiculos,int vE,int numDeseado) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la patente");
        String patente = teclado.next();
        System.out.println("Ingrese la modelo");
        String modelo = teclado.next();
        System.out.println("Ingrese la marca");
        String marca = teclado.next();
        System.out.println("Ingrese el nombre del dueño");
        String nombre_dueño = teclado.next();
        System.out.println("Ingrese la rut");
        String rut = teclado.next();
        Vehiculo auto = new Vehiculo(patente,modelo,marca,nombre_dueño,rut);
        vehiculos[numDeseado] = auto;
        menu(vehiculos,vE);
    }

    private static void verVehiculos(Vehiculo[] vehiculos,int vE) {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
        menu(vehiculos,vE);
    }

}
