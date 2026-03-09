
package main;


public class Program {
    public static void main(String[] args) {
        
        Tunder t1 = new Tunder ("Ősz udvara", "Tűz mágia");
        Tunder t2 = new Tunder ("Tavasz udvara", "Alakváltás");
        Tunder t3 = new Tunder ("Hajnal udvara", "Gyógyítás mágia");
        Tunder t4 = new Tunder ("Éjszaka udvara", "Árny mágia");

        System.out.println("Első harc:"); 
        t1.haboru(t2);
        
        System.out.println("Harc utáni állapot: ");
        System.out.println(t1.allapot());
        System.out.println(t2.allapot());
        
        System.out.println("Második harc:");
        t3.haboru(t3);
        System.out.println("Harc utáni állapot: ");
        System.out.println(t3.allapot());

        System.out.println("Harmadik harc:");
        t4.haboru(t1);
        System.out.println("Harc utáni állapot: ");
        System.out.println(t4.allapot());
        System.out.println(t1.allapot());

        
    
    }
}