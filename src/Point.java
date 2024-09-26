public class Point {
    private int abcisse;
    private int ordonnée;
    private String nom;

    public Point(int i, int j, String n) {
        this.abcisse = i;
        this.ordonnée = j;
        this.nom = n;
    }

    public Point(int i, int j) {
        this.abcisse = i;
        this.ordonnée = j;
    }

    public Point(String n) {
        this.nom = n;
    }

    public void Affiche() {
        System.out.println(this.nom + "(" + this.abcisse + ", " + this.ordonnée + ")");
    }

    public void Translation(int i, int j) {
        this.abcisse += i;
        this.ordonnée += j;
    }

    public void TranslHoriz(int i) {
        this.abcisse += i;
    }

    public void TranslVert(int j) {
        this.ordonnée += j;
    }

    public void setAbscisse(int i) {
        this.abcisse = i;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setOrdonnée(int j) {
        this.ordonnée = j;
    }

    public int getAbscisse() {
        return this.abcisse;
    }

    public String getNom() {
        return this.nom;
    }

    public int getOrdonnée() {
        return this.ordonnée;
    }
}
