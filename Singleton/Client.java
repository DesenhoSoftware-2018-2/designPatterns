package Singleton;

public class Client {
    private static final String DATA = "[Dados Exemplo]";
    public static void main( String args[] ){
        DatabaseController dbc = new DatabaseController();
        
        dbc.insertData(DATA);
        
        dbc.removeData(DATA);
    }
    
}
