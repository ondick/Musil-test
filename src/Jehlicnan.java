public class Jehlicnan extends Strom {
    private int vyska;



    public Jehlicnan(String druhDreva, int rokZasazeni, int vyska) {
        super(druhDreva, rokZasazeni);
        this.vyska = 0;
    }
    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Vyska: " + vyska);
    }
}
