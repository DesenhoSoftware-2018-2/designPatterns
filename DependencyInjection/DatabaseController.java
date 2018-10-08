
package database;

public class DatabaseController {  
    Database db;
    
    public DatabaseController(Database db){
        this.db = db;
    }
    
    public void insertData(String data){
        System.out.println("Inserindo dados no banco");
        db.insert(data);
        System.out.println("Instancia: " + db);
    }
    
    public void removeData(String data){
        System.out.println("Removendo dados do banco");
        db.remove(data);
        System.out.println("Instancia: " + db);
    }
}