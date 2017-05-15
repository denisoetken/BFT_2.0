/**
 * Created by Denis on 14.05.2017.
 */
public class Klimmhangrechner {
    public static int rechnen(double zeit, int alter, boolean weiblich) {
        double punkte = 0;
        double altersFaktor = 1;
        double geschlechtsFaktor = 1;
        if (alter > 35) {
            altersFaktor += ((alter - 35) * 0.005);
        }
        if (weiblich) {
            geschlechtsFaktor += 0.4;
        }
        punkte = (75 + (5 * zeit)) * altersFaktor * geschlechtsFaktor;
        return (int) Math.round(punkte);
    }
}