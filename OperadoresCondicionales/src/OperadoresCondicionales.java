
public class OperadoresCondicionales {

    public static void main(String[] args) {

        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //operador and
        var resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado) {
            System.out.println("Dentro del rango");

        } else {
            System.out.println("Fuera del rango");
        }

        //operador or 
        var vacaciones = false;
        var diaDescanco = true;
        if (vacaciones || diaDescanco) {
            System.out.println(" padre puede hacistir al juego de su hijo ");
        } else {
            System.out.println("Padre esta ocupado");
        }

        //operador ternario 
        var resultadoo = (3 > 2) ? "Verdadero" : "falso";
        System.out.println("resultadoo = " + resultadoo);
        
        var numeroo = 8;
        resultadoo =(numeroo %2 ==0 ) ? "Es par" :"Es impar";
        System.out.println("resultadoo = " + resultadoo);
    }

}
