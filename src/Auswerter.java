import java.util.TreeMap;

/**
 * Created by Denis on 14.05.2017.
 */
public class Auswerter {
    private float klimmhang;
    private float lauf;
    private float sprint;
    private int alter;
    private String datum;
    private String nachname;
    private String dienstgrad;
    private boolean weiblich;

    public Auswerter(float klimmhang, float lauf, float sprint, int alter, String datum, String nachname, String dienstgrad, boolean weiblich) {
        this.klimmhang = klimmhang;
        this.lauf = lauf;
        this.sprint = sprint;
        this.alter = alter;
        this.datum = datum;
        this.nachname = nachname;
        this.dienstgrad = dienstgrad;
        this.weiblich = weiblich;
    }

    public TreeMap<String, Float> ergebnisRechnen() {
        TreeMap<String, Float> map = new TreeMap<>();

        // todo: Auswertung Punkte -> Noten
        float klimmhangpunkte = Klimmhangrechner.rechnen(this.klimmhang, this.alter, this.weiblich);
        float laufpunkte = Laufrechner.rechnen(this.lauf, this.alter, this.weiblich);
        float sprintpunkte = Sprintrechner.rechnen(this.sprint, this.alter, this.weiblich);
        map.put("Klimmhangpunkte", klimmhangpunkte);
        map.put("Laufpunkte", laufpunkte);
        map.put("Pendellaufpunkte", sprintpunkte);

//        todo: Notenberechnung
//        todo: Gesamtberechnung

        return map;
    }
}


//todo: Frame bauen und Werte aus Textfeldern übergeben