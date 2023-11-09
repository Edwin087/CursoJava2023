
public class Variablers {

    public static void main(String[] args) {

        int miVaribleEntera = 10;
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
        System.out.println(usuario+ (i+j));// si le ponemos dentro de los parentesis le da prioridad y realiza la operacion

    }

}
