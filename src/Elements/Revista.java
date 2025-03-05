package Elements;

/**
 * @author Rafel Dalmau
 * @version 1.0 05/03/2025
 */
public class Revista extends Fitxa {
    private short any;
    private short nro;

    /**
     * Constructor de la classe Revista que inicialitza la referència, el títol, l'any i el número de la revista.
     *
     * @param Ref Referència de la revista.
     * @param Tit Títol de la revista.
     * @param Any Any de publicació de la revista.
     * @param Nro Número de la revista.
     */
    public Revista(String Ref, String Tit, int Any, int Nro) {
        super(Ref, Tit);
        nro = 0;
        if (Nro > 0) nro = (short) Nro;
        any = 0;
        if (Any > 0) any = (short) Any;
    }

    /**
     * Constructor de còpia per crear una nova revista a partir d'una altra.
     *
     * @param f Revista a copiar.
     */
    public Revista (Revista f) {
        this (f.referencia, f.titol, f.any, f.nro);
    }

    /**
     * Constructor per defecte, crea una nova instància de Revista sense inicialitzar els atributs.
     */
    public Revista () {
        
    }

    /**
     * @param nouAny El nou any de publicació de la revista.
     */
    public void setAny(int nouAny) {
        any = (short) nouAny;
    }

    /**
     * @param nouNro El nou número de la revista.
     */
    public void setNro(int nouNro) {
        nro = (short) nouNro;
    }

    /**
     * @return L'any de publicació de la revista.
     */
    public int getAny() {
        return any;
    }

    /**
     * @return El número de la revista.
     */
    public int getNro() {
        return nro;
    }

    /**
     * Mostra per consola la referència, el títol, l'any i el número de la revista.
     */
    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Any............:" + any);
        System.out.println("Número Revista.:" + nro);
    }
}
