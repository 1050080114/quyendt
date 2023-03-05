
package lab04;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Circle");
        System.out.print("Nhap radius:");
        Scanner scanner=new Scanner(System.in);
        circle.setradius(scanner.nextDouble());
        System.out.println("Gia tri area= "+circle.getArae());
        
        Cylinder cylinder=new Cylinder();
        System.out.println("Clynder");
        System.out.print("Nhap height:");
        cylinder.setheight(scanner.nextDouble());
        System.out.println("Gia tri volume= "+cylinder.getvolume());
    }
}
