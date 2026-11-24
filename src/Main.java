import java.util.ArrayList;
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    ArrayList<Float> notesAlumnes = new ArrayList<>();
    int opcio = 0;

    while (opcio != 5) {
        System.out.println("1. Introduir nota");
        System.out.println("2. Consultar nota");
        System.out.println("3. Eliminar nota");
        System.out.println("4. Modificar nota");
        System.out.println("5. Sortir");
        System.out.print("Escull una opció: ");
        opcio = sc.nextInt();

        if (opcio == 1) {
            System.out.print("Escriu la nota: ");
            float nota = sc.nextFloat();
            notesAlumnes.add(nota);
        } else if (opcio == 2) {
            System.out.print("Escriu l'índex: ");
            int index = sc.nextInt();
            if (index >= 0 && index < notesAlumnes.size()) {
                System.out.println("Nota: " + notesAlumnes.get(index));
            } else {
                System.out.println("Aquest índex no existeix");
            }
        } else if (opcio == 3) {
            System.out.print("Escriu l'índex: ");
            int index = sc.nextInt();
            if (index >= 0 && index < notesAlumnes.size()) {
                notesAlumnes.remove(index);
                System.out.println("Nota eliminada");
            } else {
                System.out.println("Aquest índex no existeix");
            }
        } else if (opcio == 4) {
            System.out.print("Escriu l'índex: ");
            int index = sc.nextInt();
            if (index >= 0 && index < notesAlumnes.size()) {
                System.out.print("Escriu la nova nota: ");
                float nota = sc.nextFloat();
                notesAlumnes.set(index, nota);
                System.out.println("Nota modificada");
            } else {
                System.out.println("Aquest índex no existeix");
            }
        } else if (opcio == 5) {
            System.out.println("Adéu!");
        } else {
            System.out.println("Opció no vàlida");
        }

        System.out.println("Notes: " + notesAlumnes);
    }

}
