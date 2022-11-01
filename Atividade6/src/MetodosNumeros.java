import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MetodosNumeros extends UnicastRemoteObject implements InterfaceNumero {
    public MetodosNumeros() throws RemoteException {
    }

    @Override
    public boolean calculosNumeros(Numero var1) throws RemoteException {
        System.out.println("Valor Original: " + var1.valor);
        System.out.println("Valor vezes 2: "+multi2(var1.valor));
        System.out.println("Valor vezes 3: "+multi3(var1.valor));
        System.out.println("Valor vezes 4: "+multi4(var1.valor));
        return true;
    }

    @Override
    public int multi2(int var1) throws RemoteException {
        return var1*2;
    }

    @Override
    public int multi3(int var1) throws RemoteException {
        return var1*3;
    }

    @Override
    public int multi4(int var1) throws RemoteException {
        return var1*4;
    }
}