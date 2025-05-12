public class Listnac extends Strom {
    private String barva;
    public Listnac(String druhDreva, int rokZasazeni, String barva) {
        super(druhDreva, rokZasazeni);
        this.barva = "";
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Barva: "+barva);
    }
}
