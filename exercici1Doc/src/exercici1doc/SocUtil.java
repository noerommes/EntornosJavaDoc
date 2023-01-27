/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici1doc;

/**
 *
 * @author noerommes
 * @version 1.0, 27-01-2023
 */
public class SocUtil {

    
    /**
     * Comprueba si el numero es capicua.
     * <p>Compueba si el numero es capicua.</p>
     * @param numero
     * @return <code>true</code> si numero es capicua.<br>  
     *         <code>false</code> si el numero no es capicua. 
     * @throws EsNegatiuEX en caso que numero sea menor que 0.
     * @see EsNegatiuEX
     */
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int còpia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return còpia == numAlReves;
    }

    /**
     * Comprueba si el numero es capicua.
     * <p>Compueba si el numero es capicua.</p>
     * @param numero
     * @return <code>true</code> si numero es capicua.<br>  
     *         <code>false</code> si el numero no es capicua. 
     * @throws EsNegatiuEX en caso que numero sea menor que 0.
     * @see EsNegatiuEX
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }
    
    /**
     * Comprueba si el numero es capicua.
     * <p>Compueba si el numero es capicua.</p>
     * @param numero
     * @return <code>true</code> si numero es capicua.<br>  
     *         <code>false</code> si el numero no es capicua. 
     * @throws EsNegatiuEX en caso que numero sea menor que 0.
     * @see EsNegatiuEX
     */
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }
    /**
     * Comprueba si el numero es capicua.
     * <p>Compueba si el numero es capicua.</p>
     * @param numero
     * @return <code>true</code> si numero es capicua.<br>  
     *         <code>false</code> si el numero no es capicua. 
     * @throws EsNegatiuEX en caso que numero sea menor que 0.
     * @see EsNegatiuEX
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un número negatiu");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero--;
        }
        return fact;
    }

}
