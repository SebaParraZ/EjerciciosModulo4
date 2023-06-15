package paquete;
import java.util.Scanner;
public class EjercicioGrupal10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dia, hora, lugar, duracion;
        int cantidadAsistentes;

        System.out.println("Ingrese el día (ejemplo: Lunes 28)");
        dia = leer.nextLine();
        leer = new Scanner(System.in);

        System.out.println("Ingrese la hora (ejemplo: 19:30)");
        hora = leer.nextLine();
        leer = new Scanner(System.in);

        System.out.println("Ingrese el lugar (ejemplo: Edificio Balmaceda)");
        lugar = leer.nextLine();
        leer = new Scanner(System.in);

        System.out.println("Ingrese la duración (ejemplo: 1 hora y media aproximadamente)");
        duracion = leer.nextLine();
        leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de asistentes (ejemplo: 4)");
        cantidadAsistentes = leer.nextInt();
        leer = new Scanner(System.in);

        String[] nombreAsistentes = new String[cantidadAsistentes];
        String[] notasAsintentes = new String[cantidadAsistentes];

        for(int i=0; i<cantidadAsistentes; i++){
            int numAsistente = i+1;
            System.out.println("Ingresa el nombre del asistente: "+numAsistente);
            nombreAsistentes[i] = leer.nextLine();
            leer = new Scanner(System.in);
            System.out.println("Ingresa la nota del asistente: "+numAsistente);
            notasAsintentes[i] = leer.nextLine();
            leer = new Scanner(System.in);
        }
        //System.out.println("Día: " + dia + ". Hora: " + hora + ". Lugar: " + lugar + ". Duración: " + duracion + ". Cant. Asistentes: " + cantidadAsistentes);
        System.out.println("Información de la Capacitación:");
        System.out.println("Día: "+ dia);
        System.out.println("Hora: "+ hora);
        System.out.println("Lugar: "+ lugar);
        System.out.println("Duración: "+ duracion);
        System.out.println("Cant. Asistentes: "+ cantidadAsistentes);
        System.out.println("*******************************");

        for(int i=0; i<cantidadAsistentes;i++){
            System.out.println(nombreAsistentes[i] + " " + notasAsintentes[i]);
        }
    }
}