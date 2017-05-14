/**
 * Created by Denis on 14.05.2017.
 */
public class Klimmhangrechner {
    public static float rechnen(float zeit, int alter, boolean weiblich) {
        float punkte = 0;
        float altersFaktor = 1;
        float geschlechtsFaktor = 1;
        if (alter > 35) {
            altersFaktor += ((alter - 35) * 0.005);
        }
        if (weiblich) {
            geschlechtsFaktor += 0.4;
        }
        punkte = (75 + (5 * zeit)) * altersFaktor * geschlechtsFaktor;
        return punkte;
    }
}