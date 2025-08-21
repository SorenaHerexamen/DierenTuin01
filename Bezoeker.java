import java.util.ArrayList;

public class Bezoeker extends Persoon { // Bezoeker erft naam, adres, geboortedatum van Persoon
    String betraptLeeftijdCategorie;       // Leeftijdscategorie: bv. "-12", "volwassene", "65+"
    ArrayList<Tour> betraptTours;          // Lijst van tours waar de bezoeker aan deelneemt

    // Constructor: maakt een nieuwe bezoeker aan
    public Bezoeker(String naam, String adres, String geboortedatum, String leeftijdCategorie) {
        super(naam, adres, geboortedatum); // roept constructor van Persoon aan
        this.betraptLeeftijdCategorie = leeftijdCategorie;
        this.betraptTours = new ArrayList<>(); // start met lege lijst tours
    }

    // Bezoeker inschrijven voor een tour
    public void schrijfInVoorTour(Tour t) {
        betraptTours.add(t);          // voeg tour toe aan deze bezoeker
        t.schrijfIn(this);            // voeg bezoeker toe aan tour
    }

    // Info printen over de bezoeker
    @Override
    public void printInfo() {
        super.printInfo(); // print naam, adres, geboortedatum
        System.out.println("Leeftijdscategorie: " + betraptLeeftijdCategorie);
        System.out.println("Aantal tours ingeschreven: " + betraptTours.size());
    }
}
