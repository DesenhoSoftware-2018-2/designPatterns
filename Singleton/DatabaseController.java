
package Singleton;

public class DatabaseController {  
    
    public DatabaseController(){}
    
    public void insertData(String data){
        System.out.println("Inserindo dados no banco");
        Database db1 = Database.getInstance();
        db1.insert(data);
    }
    
    public void removeData(String data){
        System.out.println("Removendo dados do banco");
        Database db2 = Database.getInstance();
        db2.remove(data);
    }
}
