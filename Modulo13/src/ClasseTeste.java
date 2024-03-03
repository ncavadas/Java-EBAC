import Interfaces.CanetaEsferografica;
import Interfaces.Giz;
import Interfaces.ICaneta;
import Interfaces.Lapis;

public class ClasseTeste {
    public static void main (String arg[]) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Nina");
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Nina");
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Nina");
        System.out.println(lapis.getCor());
    }
}
