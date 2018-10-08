
package dependencyinjection;

import database.Database;
import database.DatabaseController;

public class Client {
    private static final String DATA = "[Dados Exemplo]";
    public static void main( String args[] ){
        Database db = new Database();
        DatabaseController dbc = new DatabaseController(db);
        
        dbc.insertData(DATA);
        
        dbc.removeData(DATA);
    }
    
}
