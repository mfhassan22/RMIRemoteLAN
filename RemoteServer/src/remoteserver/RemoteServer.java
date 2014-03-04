package remoteserver;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiclass.Driver;
public class RemoteServer {
   public static void main(String[] args){
    try{
        Registry reg=LocateRegistry.createRegistry(1099);
        Driver robot=new Driver();
        reg.rebind("remotePc", robot);
        System.out.println("Server is Runing .....");
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
    }
}
