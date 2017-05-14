import java.util.ArrayList;

/**
 * Created by Denis on 14.05.2017.
 */
public class Sportler {
    private int alter;
    private String nachName;
    private String vorName;
    private String dienstgrad;
    private Boolean weiblich;
    private java.util.List<Durchfuehrung> durchfuehrungen = new ArrayList();
    private Auswerter auswerter;

    public Sportler(int alter, String nachName, String vorName, String dienstgrad, Boolean weiblich) {
        this.alter = alter;
        this.nachName = nachName;
        this.vorName = vorName;
        this.dienstgrad = dienstgrad;
        this.weiblich = weiblich;
    }

    public void neuerTest(float klimmhang, float lauf, float sprint) {

    }

}
