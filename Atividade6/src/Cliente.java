import java.rmi.Naming;

public class Cliente {
    public Cliente() {
    }

    public static void main(String[] args) {

        try {
            InterfaceNumero num = (InterfaceNumero) Naming.lookup("//localhost:8080/Numero");

            boolean teste = num.calculosNumeros(new Numero( 10));

            if (teste) {
                System.out.println("Valor enviado");
            } else {
                System.out.println("Erro");
            }

        } catch (Exception var5) {
            System.out.println("Cliente exception: " + var5.getMessage());
            var5.printStackTrace();
        }

    }
}
