public class Persoon {
    String betraptNaam;         // Naam van de persoon
    String betraptAdres;        // Adres van de persoon
    String betraptGeboortedatum; // Geboortedatum van de persoon

    // Constructor: maakt een nieuw Persoon-object aan met naam, adres en geboortedatum
    public Persoon(String naam, String adres, String geboortedatum) {
        this.betraptNaam = naam;
        this.betraptAdres = adres;
        this.betraptGeboortedatum = geboortedatum;
    }

    // Methode om de info van de persoon te printen
    public void printInfo() {
        System.out.println("Naam: " + betraptNaam + ", Adres: " + betraptAdres + ", Geboortedatum: " + betraptGeboortedatum);
    }
}
