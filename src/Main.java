//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Exercice 1
    Scanner scn = new Scanner(System.in);

    System.out.println("Entrez votre nom : ");
    String nom = scn.nextLine();
    System.out.println("Entrez votre prénom : ");
    String prenom = scn.nextLine();
    System.out.println("Entrez votre année de naissance : ");
    int anneeDeNaissance = scn.nextInt();
    int age = 2026 - anneeDeNaissance;

    System.out.println(prenom + " " + nom + " a " + age +" ans.");

    // Exercice 2
    ArrayList<Float> notes = new ArrayList<Float>();

    notes.add(12.5F);
    notes.add(13F);
    notes.add(15F);
    notes.add(12F);
    notes.add(15F);
    notes.add(16F);

    for (int i = 0; i < notes.size(); i++){
        System.out.println(notes.get(i));
    }
}
