package Elements;

/**
 * @author Rafel Dalmau
 * @version 1.0 05/03/2025
 */
public class Volum extends Obra {
    private short nro;

    /**
     * Constructor de la classe Volum que inicialitza la referència, el títol, l'autor, el nombre de pàgines i el número del volum.
     *
     * @param Ref Referència del volum.
     * @param Tit Títol del volum.
     * @param Aut Autor del volum.
     * @param NrePags Nombre de pàgines del volum.
     * @param Nro Número del volum.
     */
    public Volum(String Ref, String Tit, String Aut, int NrePags, int Nro) {
        super(Ref, Tit, Aut, NrePags);
        nro = (short) Nro;
    }

    /**
     * Constructor de còpia per crear un nou volum a partir d'un altre.
     *
     * @param f Volum a copiar.
     */
    public Volum (Volum f) {
        this (f.referencia, f.titol, f.autor, f.nrePags, f.nro);
    }

    /**
     * Constructor per defecte, crea una nova instància de Volum sense inicialitzar els atributs.
     */
    public Volum () {
        
    }

    /**
     * @param NouNro El nou número del volum.
     */
    public void setNro(int NouNro) {
        nro = (short) NouNro;
    }

    /**
     * @return El número del volum.
     */
    public int getNro() {
        return nro;
    }

    /**
     * Mostra per consola la referència, el títol, l'autor, el nombre de pàgines i el número del volum.
     */
    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Número Volum...:" + nro);
    }
}
