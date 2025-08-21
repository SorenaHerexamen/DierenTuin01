import java.util.ArrayList;

public class Personeel extends Persoon { // Personeel erft van Persoon, dus naam, adres, geboortedatum zijn al aanwezig
    String betraptFunctie;                  // Functie van het personeelslid, bv. gids, verzorger
    ArrayList<Tour> betraptTours;          // Lijst van tours waaraan dit personeelslid is toegewezen

    // Constructor: maakt een nieuw personeelslid aan
    public Personeel(String naam, String adres, String geboortedatum, String functie) {
        super(naam, adres, geboortedatum); // roept constructor van Persoon aan
        this.betraptFunctie = functie;
        this.betraptTours = new ArrayList<>(); // start met lege lijst tours
    }

    // Personeel aan een tour toevoegen
    public void voegTourToe(Tour t) {
        betraptTours.add(t);
        System.out.println(betraptNaam + " is toegewezen aan tour: " + t.betraptNaam);
    }

    // Info printen over het personeelslid
    @Override
    public void printInfo() {
        super.printInfo(); // print naam, adres, geboortedatum
        System.out.println("Functie: " + betraptFunctie);
        System.out.println("Aantal toegewezen tours: " + betraptTours.size());
    }
}
