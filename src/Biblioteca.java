import Elements.Fitxa;

/**
 * @author Rafel Dalmau
 * @version 1.0 05/03/2025
 */
public class Biblioteca {
    private Fitxa t[];
    private int q = 0;

    /**
     * Constructor que crea una biblioteca amb una capacitat determinada.
     *
     * @param dim Capacitat inicial de la biblioteca.
     */
    public Biblioteca(int dim) {
        if (dim < 0) dim = 100;
        t = new Fitxa[dim];
    }

    /**
     * @return La capacitat màxima de la biblioteca.
     */
    public int capacitat() {
        return t.length;
    }

    /**
     * @return El nombre d'elements actuals a la biblioteca.
     */
    public int nreElements() {
        return q;
    }

    /**
     * Afegeix una nova fitxa a la biblioteca si no està duplicada.
     *
     * @param obj Fitxa a afegir.
     * @return L'índex si ja existeix, -1 si s'ha afegit correctament, -2 si és null, -3 si no hi ha espai.
     */
    public int afegir(Fitxa obj) {
        if (obj == null) return -2;
        if (q >= t.length) return -3;
        for (int i = 0; i < q; i++) {
            if (t[i].getReferencia().equals(obj.getReferencia())) {
                return i; // Ja existeix
            }
        }
        t[q++] = obj;
        return -1; // Afegit amb èxit
    }

    /**
     * Busca una fitxa per la seva referència.
     *
     * @param ref Referència de la fitxa.
     * @return La posició de la fitxa o -1 si no es troba.
     */
    public int cercar(String ref) {
        for (int i = 0; i < q; i++) {
            if (t[i].getReferencia().equals(ref)) {
                return i;
            }
        }
        return -1; // No trobat
    }

    /**
     * Retorna la fitxa situada en una posició específica.
     *
     * @param i Índex de la fitxa.
     * @return La fitxa trobada o null si la posició és incorrecta.
     */
    public Fitxa exemplarAt(int i) {
        if (i >= 0 && i < q) {
            return t[i];
        }
        return null; // Posició incorrecta
    }

    /**
     * Cerca una Fitxa dins la biblioteca amb referència ref per tal de
     * extreure-la de la biblioteca retornant-la
     * Retorna null: Si no la troba
     * La Fitxa extreta en cas de trobar-la
     *
     * @param ref Referència de la fitxa.
     * @return La fitxa extreta o null si no es troba.
     */
    public Fitxa extreure(String ref) {
        int pos = cercar(ref);
        if (pos != -1) {
            Fitxa f = t[pos];
            for (int i = pos; i < q - 1; i++) {
                t[i] = t[i + 1];
            }
            t[--q] = null;
            return f;
        }
        return null; // No trobat
    }

    /**
     * Mostra per consola el contingut de la biblioteca.
     */
    public void visualitzar() {
        System.out.println("Contingut de la biblioteca");
        System.out.println("**************************");
        System.out.println("Capacitat.....: " + capacitat());
        System.out.println("Nre. Exemplars: " + nreElements());
        for (int i = 0; i < q; i++) {
            System.out.println("Exemplar " + (i + 1) + ": " + t[i]);
        }
    }

    /**
     * Compara si dues biblioteques són iguals.
     *
     * @param obj Objecte a comparar.
     * @return True si són iguals, false en cas contrari.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Biblioteca) {
            Biblioteca b = (Biblioteca) obj;
            if (this.nreElements() != b.nreElements()) return false;
            for (int i = 0; i < q; i++) {
                if (!this.t[i].equals(b.t[i])) return false;
            }
            return true;
        }
        return false;
    }
}
