package database;

public class Database {
    
    private static Database sInstance;

    private Database() {}
 
    public static synchronized Database getInstance() {
        if (sInstance == null) {
            System.out.println("Criando uma nova instância de Database");
            sInstance = new Database();
        }else {
            System.out.println("Retornando uma instância já existente");
        }
        return sInstance;
    }
    
    public void insert(String data){
        System.out.println("Dados inseridos: " + data);
    }
    
    public void remove(String data){
        System.out.println("Dados removidos: " + data);
    }
}