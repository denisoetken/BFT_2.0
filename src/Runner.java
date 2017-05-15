/**
 * Created by doetken on 15.05.2017.
 */
public class Runner {
    public static void main(String[] args) {

        //        Test für Sprintrechner
        System.out.println("Sprinttest:");
//        sollte - 406 - ergeben
        System.out.println("406 - " + Sprintrechner.rechnen(45, 37, true));
//        sollte - 183 - ergeben
        System.out.println("183 - " + Sprintrechner.rechnen(55, 24, false));
//        sollte - 412 - ergeben
        System.out.println("412 - " + Sprintrechner.rechnen(42, 41, false));
//        sollte - 575 - ergeben
        System.out.println("575 - " + Sprintrechner.rechnen(36, 34, true));

//        Test für Klimmhangrechner
        System.out.println("Klimmhangtest:");
//        sollte - 407 - ergeben
        System.out.println("407 - " + Klimmhangrechner.rechnen(42.8, 37, true));
//        sollte - 225 - ergeben
        System.out.println("225 - " + Klimmhangrechner.rechnen(30, 24, false));
//        sollte - 465 - ergeben
        System.out.println("465 - " + Klimmhangrechner.rechnen(75.3, 41, false));
//        sollte - 405 - ergeben
        System.out.println("405 - " + Klimmhangrechner.rechnen(42.8, 34, true));

        //        Test für Laufrechner
        System.out.println("Lauftest:");
//        sollte - 177 - ergeben
        System.out.println("177 - " + Laufrechner.rechnen(361, 37, true));
//        sollte - 262 - ergeben
        System.out.println("262 - " + Laufrechner.rechnen(310, 24, false));
//        sollte - 43 - ergeben
        System.out.println("43 - " + Laufrechner.rechnen(422, 41, false));
//        sollte - 548 - ergeben
        System.out.println("548 - " + Laufrechner.rechnen(270, 34, true));
    }
}
