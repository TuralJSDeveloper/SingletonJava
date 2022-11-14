package sngln;

/**
 *
 * @author Tural
 */
public class Sngln {

    private static Sngln sgnl = null;

    private Sngln() {

    }

    public static Sngln getInstance() {
        if (sgnl == null) {
            sgnl = new Sngln();
        }
        return sgnl;
    }

}
