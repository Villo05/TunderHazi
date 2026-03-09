package main;

public class Tunder {

    private String udvar, ero;
    private int elet;

    public Tunder(String udvar, String ero) {
        this.udvar = udvar;
        this.ero = ero;
        this.elet = 50;
    }

    public String getUdvar() {
        return udvar;
    }

    public String getEro() {
        return ero;
    }
    
    public int getElet() {
        return elet;
    }
    
    public void setUdvar(String udvar) {
        this.udvar = udvar;
    }

    public void setEro(String ero) {
        this.ero = ero;
    }

    public void setElet(int elet) {
        this.elet = elet;
    }

    public String allapot() {
        return "Tunder{" + "udvar=" + udvar + ", ero=" + ero + ", elet=" + elet + '}';
    }

    public void haboru(Tunder masik) {
        if (!this.udvar.equals(masik.udvar)) {
            this.elet -= 10;
            masik.elet -= 10;
            System.out.println("HARC: " + this.udvar + " vagy " + masik.udvar);
        } else {
            System.out.println("NINCS HARC (azonos udvar): " + this.udvar);
        }
    }
}