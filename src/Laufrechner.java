/**
 * Created by Denis on 14.05.2017.
 */
public class Laufrechner {
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
        punkte = (((390 - zeit) * (float)1.81818181) + 100) * altersFaktor * geschlechtsFaktor;
        return punkte;
    }
}
