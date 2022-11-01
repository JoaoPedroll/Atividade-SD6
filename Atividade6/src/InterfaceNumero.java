import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceNumero extends Remote {

    boolean calculosNumeros(Numero var1) throws RemoteException;
    int multi2(int var1) throws RemoteException;

    int multi3(int var1) throws RemoteException;

    int multi4(int var1) throws RemoteException;
}
