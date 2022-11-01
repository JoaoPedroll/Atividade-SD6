import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public Servidor() {
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(8080);

            MetodosNumeros numero = new MetodosNumeros();

            Naming.rebind("//localhost:8080/Numero", numero);

            System.out.println("Servidor Ligado");

        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}