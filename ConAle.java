package Practicas;

import java.util.Random;
import java.util.Scanner;

public class ConAle {
    public static void main(String[] args){
        Random rand = new Random();
        StringBuilder contra = new StringBuilder();
        Scanner sca = new Scanner(System.in);
        String car = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        int lon;

        System.out.println("¿De cuantos digitos quiere su contraseña?");
        lon = sca.nextInt();

        for (int i=0; i<lon; i++){
            int w = rand.nextInt(car.length());
            char caral = car.charAt(w);
            contra.append(caral);
        }
        System.out.print("\n\u001B[1mLa contraseña generada es: \u001B[0m"+contra.toString());
    }
}
