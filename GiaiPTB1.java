package lab02;

import java.util.Scanner;

public class GiaiPTB1{
    
    public static void main (String[] args) {
       int a, b;
       float x;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap so a vao: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b vao: ");
        b = scanner.nextInt();
        if (a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem ");
            } else{
                System.out.println("Phuong trinh vo nghiem ");
            }
        } else{
            x = -(float)b/(float)a; 
            System.out.println("Phuong trinh co nghiem x la: " + x);
        }
    }
}

    


      
