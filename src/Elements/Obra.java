package Elements;

/**
 * @author Rafel Dalmau
 * @version 1.0 05/03/2025
 */
public class Obra extends Fitxa {
    protected String autor;
    protected short nrePags;

    /**
     * Constructor de la classe Obra que inicialitza la referència, el títol, l'autor i el nombre de pàgines.
     *
     * @param Ref Referència de la fitxa.
     * @param Tit Títol de la fitxa.
     * @param Aut Autor de l'obra.
     * @param NrePags Nombre de pàgines de l'obra.
     */
    public Obra(String Ref, String Tit, String Aut, int NrePags) {
        super(Ref, Tit);
        autor = Aut;
        if (NrePags > 0 && NrePags <= Short.MAX_VALUE) nrePags = (short) NrePags;
        else nrePags = 0;
    }
   
    /**
     * @param f Obra a copiar.
     */
    public Obra (Obra f) {
        this (f.referencia, f.titol, f.autor, f.nrePags);
    }

    /**
     * Constructor per defecte, crea una nova instància d'Obra sense inicialitzar els atributs.
     */
    public Obra () {
        
    }

    /**
     * @param NouAutor El nou autor de l'obra.
     */
    public void setAutor(String NouAutor) {
        autor = NouAutor;
    }

    /**
     * @param NouNrePags El nou nombre de pàgines de l'obra.
     */
    public void setNumPags(int NouNrePags) {
        nrePags = (short) NouNrePags;
    }

    /**
     * @return L'autor de l'obra.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return El nombre de pàgines de l'obra.
     */
    public int getNrePags() {
        return nrePags;
    }

    /**
     * Mostra per consola la referència, el títol, l'autor i el nombre de pàgines de l'obra.
     */
    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Autor..........:" + autor);
        System.out.println("Nombre Pàgines.:" + nrePags);
    }
}
