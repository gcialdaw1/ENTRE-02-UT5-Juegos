/**
 * Punto de entrada a la aplicación
 * 
 * @author - 
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)
    {
        if(args.length != 2) {
            System.out.println("Error en argumentos" + "\n" + "Sintaxis: java AppRevistaJuegosOnLine <nombre> <n>");
        }
        else {
            RevistaOnLineJuegos rev = new RevistaOnLineJuegos(args[0], Integer.parseInt(args[1]));
            System.out.println(rev.toString());
            
        }

    }
}
