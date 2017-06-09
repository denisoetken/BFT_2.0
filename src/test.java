import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Denis on 09.06.2017.
 */
public class test {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Nachname", "Oetken");
        map.put("Dienstgrad", "OFR zS");
        map.put("Datum", "09.06.2017");
        map.put("Klimmhangpunkte", "300");
        map.put("Pendellaufpunkte", "310");
        map.put("Laufpunkte", "320");
        Integer gesamtpunkte = Integer.parseInt(map.get("Klimmhangpunkte")) + Integer.parseInt(map.get("Pendellaufpunkte")) + Integer.parseInt(map.get("Laufpunkte"));
        map.put("Gesamtpunkte", gesamtpunkte.toString());
        map.put("Klimmhangnote", "3");
        map.put("Pendellaufnote", "2");
        map.put("Laufnote", "1");
        Float gesamtnote = (Float.parseFloat(map.get("Klimmhangnote")) + Float.parseFloat(map.get("Pendellaufnote")) + Float.parseFloat(map.get("Laufnote"))) / 3;
        map.put("Gesamtnote", gesamtnote.toString());

        Dateischreiber ds = new Dateischreiber(map);
    }

}