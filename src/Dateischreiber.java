import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * Created by Denis on 09.06.2017.
 */
public class Dateischreiber {
    Logger log = Logger.getLogger("Urkundendruck");

    public Dateischreiber(TreeMap<String, String> ergebnis) {

        StringBuilder style = new StringBuilder();
        style.append("<style>\n");
        style.append("table {\n");
        style.append("border: solid black 1px;\n");
        style.append("width: 300px");
        style.append("}\n");
        style.append("td {\n");
        style.append("width: auto;");
        style.append("}\n");
        style.append("th {\n");
        style.append("text-align: left;");
        style.append("width: auto;");
        style.append("}\n");
        style.append("</style>\n");

        String dateiname = ergebnis.get("Nachname") + ".html";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dateiname))) {
            StringBuilder ausgabe = new StringBuilder();
            ausgabe.append("<!DOCTYPE html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Urkunde</title>\n");
            ausgabe.append(style.toString());
            ausgabe.append("</head>\n");
            ausgabe.append(String.format("<body>\n<h1>Urkunde für %s %s</h1>", ergebnis.get("Dienstgrad"), ergebnis.get("Nachname")));
            ausgabe.append(String.format("<h2>BFT vom %s</h2>", ergebnis.get("Datum")));
            ausgabe.append(String.format("<h3>%s %s hat den Basis Fitness Test mit folgenden Ergebnissen absolviert:</h3>", ergebnis.get("Dienstgrad"), ergebnis.get("Nachname")));
            ausgabe.append("<table>\n<tr>\n<th>Disziplin</th>\n<th>Punkte</th>\n<th>Note</th>\n</tr>\n");
            ausgabe.append(String.format("<tr>\n<td>Klimmhang</td>\n<td>%s</td>\n<td>%s</td>\n</tr>\n", ergebnis.get("Klimmhangpunkte"), ergebnis.get("Klimmhangnote")));
            ausgabe.append(String.format("<tr>\n<td>Pendellauf</td>\n<td>%s</td>\n<td>%s</td>\n</tr>\n", ergebnis.get("Pendellaufpunkte"), ergebnis.get("Pendellaufnote")));
            ausgabe.append(String.format("<tr>\n<td>1000m-Lauf</td>\n<td>%s</td>\n<td>%s</td>\n</tr>\n", ergebnis.get("Laufpunkte"), ergebnis.get("Laufnote")));
            ausgabe.append(String.format("<tr>\n<td><h4>Gesamt</h4></td>\n<td>%s</td>\n<td>%s</td>\n</tr>\n", ergebnis.get("Gesamtpunkte"), ergebnis.get("Gesamtnote")));
            ausgabe.append("\n</table>\n");
            ausgabe.append("<br>");
            ausgabe.append("</body>\n</html>\n");

            bw.write(ausgabe.toString());
            bw.flush();
        } catch (IOException e) {
            log.warning("Datei konnte nicht geschrieben werden!");

        }
    }
}


