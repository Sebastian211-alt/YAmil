
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SebasTati
 */
public class Craps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seguir = 0;
        do {
            int dado1, dado2, suma, suma2, dinero, x = 0;
            try {
                System.out.print("Ingrese dinero apostar:");
                dinero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("No ingreso una opcion valida");
                System.exit(0);
            }
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            suma = dado1 + dado2;
            System.out.println(suma);
            switch (suma) {
                case 7:
                case 11:
                    System.out.println("Usted Ha ganado");
                    System.out.println("Seguir Jugando: si=1, no=otro digito");
                    seguir = sc.nextInt();
                    break;
                case 2:
                case 3:
                case 12:
                    System.out.println("Usted ha perdido:");
                    System.out.println("Seguir Jugando: si=1, no=otro digito");
                    seguir = sc.nextInt();
                    break;
                default:
                    do {
                        System.out.println("Vamos a jugar Otra vez ");
                        dado1 = (int) (Math.random() * 6) + 1;
                        dado2 = (int) (Math.random() * 6) + 1;
                        suma2 = dado1 + dado2;
                        System.out.println(suma2);
                        if (suma2 == suma) {
                            System.out.println("Usted ha ganado");
                            x = 0;
                        } else if (suma2 == 7) {
                            System.out.println("Usted ha perdido");
                            x = 0;
                        } else {
                            x++;
                        }
                    } while (x != 0);
                    break;
            }
            System.out.println("Seguir Jugando: si=1, no=otro digito");
            seguir = sc.nextInt();
        } while (seguir == 1);
    }
}
