public class Strom {
    private String druhDreva;
    private int rokZasazeni;

    public Strom(String druhDreva, int rokZasazeni) {
        this.druhDreva = "";
        this.rokZasazeni=0;
    }
    public void vypisInfo() {
        System.out.println("Druh stromu je: "+druhDreva+", a rok zasazeni stromu je: "+rokZasazeni);
    }
}
