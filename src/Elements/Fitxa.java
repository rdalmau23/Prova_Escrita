package Elements;

/**
 * @author Rafel Dalmau
 * @version 1.0 05/03/2025
 */
public abstract class Fitxa {
    protected String referencia;
    protected String titol;

    /**
     * Constructor de la classe Fitxa que inicialitza la referència i el títol.
     *
     * @param Ref Referència de la fitxa.
     * @param Tit Títol de la fitxa.
     */
    public Fitxa(String Ref, String Tit) {
        referencia = Ref;
        titol = Tit;
    }

    /**
     * Constructor de còpia per crear una nova fitxa a partir d'una altra.
     *
     * @param f Fitxa a copiar.
     */
    public Fitxa (Fitxa f) {
        this (f.referencia, f.titol);
    }

    /**
     * @param obj Objecte amb el qual es vol comparar aquesta fitxa.
     * @return Retorna true si les dues fitxes són iguals, sinó false.
     */
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Fitxa) return this.referencia.equals(((Fitxa) obj).referencia);
        return false;
    }

    /**
     * @param NovaRef La nova referència de la fitxa.
     */
    public void setReferencia(String NovaRef) {
        referencia = NovaRef;
    }

    /**
     * @param NouTit El nou títol de la fitxa.
     */
    public void setTitol(String NouTit) {
        titol = NouTit;
    }

    /**
     * @return La referència de la fitxa.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @return El títol de la fitxa.
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Mostra per consola la referència i el títol de la fitxa.
     */
    public void visualitzar() {
        System.out.println("Referència.....:" + referencia);
        System.out.println("Títol..........:" + titol);
    }

    /**
     * @return Una cadena que conté la referència i el títol de la fitxa.
     */
    public String toString() {
        return referencia + " - " + titol;
    }
}
