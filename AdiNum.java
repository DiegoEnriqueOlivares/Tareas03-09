package Practicas;

import java.util.Scanner;

public class AdiNum {
    public static void main(String[] args){
        int alea,num=0,con=0;
        Scanner sca = new Scanner(System.in);
        alea=(int)Math.floor(Math.random()*(100-1+1)+1);
        System.out.println("¡Este es un juego de adivinar un numero!");



        while(con<3){
            System.out.print("\nIngrese el numero #"+(con+1)+": ");
            num = sca.nextInt();
            if(con<2) {
                if(num<alea){
                    System.out.print("\nSu numero tiene que ser mayor");
                } else if(num>alea){
                    System.out.print("\nSu numero tiene que ser menor");
                } else {
                    System.out.print("\nGanaste adivinaste el numero");
                }
            }
            con++;
        }
        System.out.print("\nEl numero a adivinar era: "+alea+
                "\nSu ultimo numero ingresado fue: " + num);
    }
}
