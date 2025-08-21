import java.util.ArrayList;

public class Tour {
    String betraptNaam;                  // Naam van de tour, bv. "Kinderboerderijtour"
    int betraptMaxCapaciteit;            // Max aantal deelnemers
    ArrayList<String> betraptLeeftijden; // Leeftijden die mogen deelnemen, bv. "-12", "volwassen"
    ArrayList<Bezoeker> betraptDeelnemers; // Lijst van bezoekers die zich inschrijven
    ArrayList<Personeel> betraptPersoneel; // Lijst van personeel toegewezen aan deze tour

    // Constructor: maakt een nieuwe tour aan
    public Tour(String naam, int maxCapaciteit, ArrayList<String> leeftijden) {
        this.betraptNaam = naam;
        this.betraptMaxCapaciteit = maxCapaciteit;
        this.betraptLeeftijden = leeftijden;
        this.betraptDeelnemers = new ArrayList<>(); // start met lege deelnemerslijst
        this.betraptPersoneel = new ArrayList<>();  // start met leeg personeel
    }

    // Bezoeker inschrijven
    public void schrijfIn(Bezoeker b) {
        if (betraptDeelnemers.size() < betraptMaxCapaciteit) {
            betraptDeelnemers.add(b);
            System.out.println(b.betraptNaam + " is ingeschreven voor " + betraptNaam);
        } else {
            System.out.println("Sorry, tour is vol!");
        }
    }

    // Personeel toevoegen
    public void voegPersoneelToe(Personeel p) {
        betraptPersoneel.add(p);
        System.out.println(p.betraptNaam + " is toegevoegd aan " + betraptNaam);
    }

    // Info printen over tour
    public void printInfo() {
        System.out.println("Tour: " + betraptNaam + ", Max capaciteit: " + betraptMaxCapaciteit);
        System.out.println("Toegestane leeftijden: " + betraptLeeftijden);
        System.out.println("Aantal deelnemers: " + betraptDeelnemers.size());
        System.out.println("Aantal personeel: " + betraptPersoneel.size());
    }
}
