
import java.util.Scanner;

public class Variablers {

    public static void main(String[] args) {

        /*int miVaribleEntera = 10;
        System.out.println(miVaribleEntera);
        //modificamos el valor de la variable
        miVaribleEntera = 5;
        System.out.println(miVaribleEntera);
        String miVariableCadena = "Edwin";
        System.out.println(miVariableCadena);
        miVariableCadena = "Geovanny";
        System.out.println(miVariableCadena);
        //utilización de var interferencia de tipos de java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariavleCadena2 = "calle";
        System.out.println("miVariavleCadena2 = " + miVariavleCadena2);

        //concatenación
        var usuario = "Edwin";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var i = 3;
        var j = 4;
        System.out.println(i + j);//suma de numeros
        System.out.println(i + j + usuario);// de esquierda a derecha primero toma la suma + concatenación
        System.out.println(usuario + (i + j));// si le ponemos dentro de los parentesis le da prioridad y realiza la operacion*/
//caracteres especiales 
        /*var nombre = "Karla";
        System.out.println("Nueca linea:\n" + nombre);
        System.out.println("Tabulador:\t \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple:\'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");*/
        
//Valor desde la consola con la clase Scaner
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        //.nextLine() para leer de la consola
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + usuario + " " + titulo);
        
    }

}
