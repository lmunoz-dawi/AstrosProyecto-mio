import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList astros = new ArrayList();

        //Creamos objetos
        //Creamos satelites
        Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, "tierra");
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, "marte");
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, "marte");
        //Creamos los planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711);

        //Añadir satelites a los planetas
        tierra.AnyadirSatelite(luna);
        marte.AnyadirSatelite(fobos);
        marte.AnyadirSatelite(deimos);

        //Añadimos Planetas y Satelites
        astros.add(tierra);
        astros.add(venus);
        astros.add(marte);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);

        // Menu para enseñar astro, -1 para acabar
        do {
            //Mostrar la lista de astros
            mostrarAstros(astros);

            System.out.println("Que astro quieres ver");
            int n = sc.nextInt();

            if(n >= 0 && n < astros.size()){
                Astro l = (Astro) astros.get(n);
                l.muestra();
            } else if (n == -1) {
                return;
            } else {
                System.out.println("Opcion incorrecta");
            }
        } while (true);

    }

    public static void mostrarAstros(ArrayList astros){
        System.out.println("Lista de Astros: ");
        for(int i = 0; i < astros.size(); i++){
            Astro l = (Astro) astros.get(i);
            System.out.println("Astro " + i + ": " + l.getNombre());
        }
    }
}