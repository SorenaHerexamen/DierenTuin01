public class Activiteit {
    String betraptNaam;         // Naam van de activiteit, bv. "De Pinguingrot"
    String betraptCategorie;    // Categorie van de activiteit, bv. "dierenveld", "aquarium"
    String betraptOmschrijving; // Beschrijving van de activiteit

    // Constructor: maakt een nieuwe activiteit aan
    public Activiteit(String naam, String categorie, String omschrijving) {
        this.betraptNaam = naam;
        this.betraptCategorie = categorie;
        this.betraptOmschrijving = omschrijving;
    }

    // Info printen over de activiteit
    public void printInfo() {
        System.out.println("Activiteit: " + betraptNaam);
        System.out.println("Categorie: " + betraptCategorie);
        System.out.println("Omschrijving: " + betraptOmschrijving);
    }
}
