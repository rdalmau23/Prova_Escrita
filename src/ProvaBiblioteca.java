import Elements.*;

public class ProvaBiblioteca {
    private static void missatgeAfegir(int error, Fitxa obj) {
        System.out.println("Afegir l'objecte " + obj);
        if (error == -1) {
            System.out.println(" Afegit.");
        } else if (error == -2) {
            System.out.println(" No afegit per ser null.");
        } else if (error == -3) {
            System.out.println(" No afegit per no tenir espai.");
        } else {
            System.out.println(" Referència " + obj.getReferencia() + " existent a la posició " + error);
        }
    }

    public static void main(String args[]) {
        Biblioteca b = new Biblioteca(50);
        Fitxa f;
        int pos;

        System.out.println("La biblioteca té una capacitat per a " + b.capacitat() + " exemplars.\n");
        System.out.println("La biblioteca té " + b.nreElements() + " exemplars.\n");

        Revista r = new Revista("MC001", "Mundo Científico", 2005, 1);
        missatgeAfegir(b.afegir(r), r);

        Obra o = new Obra("EQ001", "El Quixot", "Miguel de Cervantes", 1000);
        missatgeAfegir(b.afegir(o), o);

        Volum v1 = new Volum("EC001", "Enciclopèdia Catalana", "Varis", 573, 1);
        missatgeAfegir(b.afegir(v1), v1);

        Volum v2 = new Volum("EC002", "Enciclopèdia Catalana", "Varis", 602, 2);
        missatgeAfegir(b.afegir(v2), v2);

        System.out.println("\nLa biblioteca té " + b.nreElements() + " exemplars");
        System.out.println("\nAnem a extreure la fitxa de referència 'EC001'");
        f = b.extreure("EC001");

        if (f == null) {
            System.out.println("No s'ha trobat.");
        } else {
            System.out.println("S'ha trobat i s'ha extret. Vegem-lo:");
            f.visualitzar();
        }

        System.out.println("\nLa biblioteca té " + b.nreElements() + " exemplars.\n");

        f = new Volum("MC001", "El Quixot", "Miguel de Cervantes", 500, 1);
        missatgeAfegir(b.afegir(f), f);

        System.out.println();
        b.visualitzar();
    }
}
