public class Main {
 public static void main(String[] args) {

 Figura kolo = new Kolo(5.0, "czerwony");
 Figura prostokat = new Prostokat(4.0, 6.0, "niebieski");

 System.out.println("=== Klasa abstrakcyjna — przykład ===");
 System.out.println();
 wyswietlInfo(kolo);
 System.out.println();
 wyswietlInfo(prostokat);
 }

 public static void wyswietlInfo(Figura f) {
 System.out.println(f);
 System.out.printf(" Pole: %.2f%n", f.obliczPole());
 System.out.printf(" Obwód: %.2f%n", f.obliczObwod());
 System.out.println(" Kolor: " + f.getKolor());
 }
}
