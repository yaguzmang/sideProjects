/**
 * This class generates prime numbers
 *
 * @author (Yhoan Alejandro Guzman Garcia)
 * @version (1.0)
 */
public class Primos {
     void primos(int num) {
        int[] primos = new int[num];
       // int[] diferencia = new int[num];
        int cont = 0;
        primos[0] = 2;
        int index = 1;
        for (int i = 3; i <= num; i += 2) {
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if ((i % j) == 0) {
                    cont++;
                    break;
                }
            }
            if (cont == 0) {
                primos[index] = i;
                index++;
            }
            cont = 0;
        }
        System.out.println("Done");
    }
     
     public void imprimirDif(int[] diferencia, int index) {
        for (int i = 0; i < index - 1; i++) {
            //System.out.print(primos[i]+" | ");
            if (diferencia[i] < 10) {
                System.out.print(diferencia[i] + "  | ");
            } else {
                System.out.print(diferencia[i] + " | ");
            }
            if ((i + 1) % 28 == 0) {
                System.out.println();
            }
        }
    }
     public void imprimirPrim(int[] primos, int index) {
        for (int i = 0; i < index; i++) {
            if (primos[i] < 10) {
                System.out.print(primos[i] + "  | ");
            } else {
                System.out.print(primos[i] + " | ");
            }
            if ((i + 1) % 28 == 0) {
                System.out.println();
            }
        }
    }
     public void imprimirCont(int[] contadores) {
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != 0) {
                System.out.println("i: " + i + " -> " + contadores[i]);
            }
        }
    }
     public static void main(String[] args) {
        Primos a = new Primos();
        a.primos(100000000);
    }
}
