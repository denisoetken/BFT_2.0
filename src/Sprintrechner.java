/**
 * Created by Denis on 14.05.2017.
 */
public class Sprintrechner {
    public static float rechnen(float zeit, int alter, boolean weiblich) {
        float punkte = 0;
        float altersFaktor = 1;
        float geschlechtsFaktor = 1;
        if (alter > 35) {
            altersFaktor += ((alter - 35) * 0.005);
        }
        if (weiblich) {
            geschlechtsFaktor += 0.15;
        }
        punkte = (1100 - ((float) 16.667 * zeit)) * altersFaktor * geschlechtsFaktor;
        return punkte;
    }
}
