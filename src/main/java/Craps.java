
import java.util.Scanner;

/*
 Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
 suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
 entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 pierde. Si sale otro número, tiene que seguir tirando.
 
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
