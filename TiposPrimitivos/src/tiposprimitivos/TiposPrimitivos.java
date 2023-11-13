
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        //tipos primitivos enteros: byte, short, int, long
        /*  byte numeroByte = 10;
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo: " + Short.MIN_VALUE);
        System.out.println("Valor maximo: " + Short.MAX_VALUE);

        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo: " + Long.MIN_VALUE);
        System.out.println("Valor maximo: " + Long.MAX_VALUE);

        //tipos primitivos de tipo flotante float, double 
        float numeroFloat = 10.1f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo: " + Float.MIN_VALUE);
        System.out.println("Valor maximo: " + Float.MAX_VALUE);

        double numerDouble = 10.23;
        System.out.println("numerDouble = " + numerDouble);
        System.out.println("Valor minimo: " + Double.MIN_VALUE);
        System.out.println("Valor maximo: " + Double.MAX_VALUE);

        //tipos com var
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        var numeroFlotantee = 10.5f;
        System.out.println("numeroFlotante = " + numeroFlotantee);
        var numeroDoblee = 41.5;
        System.out.println("numeroDoble = " + numeroDoblee);

        //tipo chart de un solo caracter 
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        var miCaracterSimbol = '#';
        System.out.println("miCaracterSimbol = " + miCaracterSimbol);
        int letra = '#';
        System.out.println("letra = " + letra);

        //tipo booleano true and false
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean) {
            System.out.println("es verdadero");
        } else {
            System.out.println("es falso");
        }

        var edad = 30;

        if (edad >= 18) {
            System.out.println("Eres mayor");

        } else {
            System.out.println("eres menor");
        }*/

        // converciones de tipo String a tipo int 
        /*var edadd = Integer.parseInt("20");
        System.out.println("edadd = " + (edadd + 1));
        var valorPi = Double.parseDouble("3.1415");
        System.out.println("valorPi = " + valorPi);*/

        //pedir valor 
        var consola = new Scanner(System.in);
        /*System.out.println("Ingresa tu edad: ");
        edadd = Integer.parseInt(consola.nextLine());
        System.out.println("Tu edad es: " + edadd);*/

// converciones de tipo int a tipo String 
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var caracter  = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        System.out.println("Proporciona un chart");
        caracter= consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    

    }
    
}
