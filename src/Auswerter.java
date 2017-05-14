import java.util.TreeMap;

/**
 * Created by Denis on 14.05.2017.
 */
public class Auswerter {
    private float klimmhang;
    private float lauf;
    private float sprint;

    public Auswerter(float klimmhang, float lauf, float sprint) {
        this.klimmhang = klimmhang;
        this.lauf = lauf;
        this.sprint = sprint;
    }

    public static TreeMap<String, Float> ergebnisRechnen() {
        TreeMap<String, Float> map = new TreeMap<>();

        // todo: Aufruf der Rechner mit jeder Methode und Auswertung Punkte -> Noten


        return map;
    }
}
