public class Kolo extends Figura {
 
 private double promien;
 
 public Kolo(double promien, String kolor) {
 super(kolor); 
 this.promien = promien;
 }
 
 @Override
 public double obliczPole() {
 return Math.PI * promien * promien; // π * r²
 }
 
 @Override
 public double obliczObwod() {
 return 2 * Math.PI * promien; // 2 * π * r
 }
 
 public double getPromien() {
 return promien;
 }
 
 @Override
 public String toString() {
 return "Kolo [promien=" + promien + ", kolor=" + getKolor() + "]";
 }
}

