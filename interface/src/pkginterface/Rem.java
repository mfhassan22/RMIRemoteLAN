package pkginterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Rem extends Remote{
    public byte[] getDesktop() throws RemoteException;
    void delay(int ms)throws RemoteException;
    void keyPress(int keycode)throws RemoteException;
    void mouseMove(int x, int y)throws RemoteException;
    void mousePress(int buttons)throws RemoteException;
    void mouseRelease(int buttons)throws RemoteException;
    void mouseWheel(int wheelAmt)throws RemoteException;
}