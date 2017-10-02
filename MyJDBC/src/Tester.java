import java.sql.*;

/**
 * Created by hackeru on 28/09/2017.
 */
public class Tester {

    public static void main(String[] args) {
        String dbName   = "test";
        String url      = "jdbc:mysql://127.0.0.1:3306/"+dbName;
        String user     = "root";
        String pass     = "";
        try {
            Connection db = DriverManager.getConnection(url,user,pass);
            /*
            PreparedStatement stmt;//SQL statement - prepared before execution
            stmt = db.prepareStatement("CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) NOT NULL, pass VARCHAR(100) NOT NULL)");
            stmt.execute();
            stmt = db.prepareStatement("INSERT INTO users (name, pass) VALUES ('Bubu', '123'), ('Groot', '333222111')");
            stmt.execute();

            stmt = db.prepareStatement("SELECT name, pass FROM users");
            ResultSet results = stmt.executeQuery();
            results.first();//initialize - start from first row
            while(!results.isAfterLast()){//as long as there are more results (not after last)
                System.out.println(results.getString("name"));//get String of column "name"
                System.out.println(results.getString("pass"));//get String of column "pass"
                results.next();//move to next row
            }
            /*
            String [] stmts = {
               "DELETE FROM users;",//
               "ALTER TABLE users MODIFY COLUMN name VARCHAR(20) UNIQUE NOT NULL;",//
               "ALTER TABLE users ADD COLUMN info VARCHAR(100);",//
               "CREATE TABLE cars (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), year INT(4) NOT NULL DEFAULT 2017, cc INT(5) NOT NULL, owner_id INT NOT NULL);",//
               "ALTER TABLE cars ADD INDEX (owner_id);",//
               "INSERT INTO users (name, pass, info) VALUES ('Nastya', 'Tie yazerati', 'Kotevet maer'), ('Avia', 'Stam123', 'Terra rist');",//
               "INSERT INTO cars (name, cc, owner_id) VALUES ('Koenigsegg Agera', 5000, 1), ('Lexus LFA', 4800, 2), ('Lamborghini Elemento', 5200, 2);",//
            };
            for(String stmt : stmts)db.prepareStatement(stmt).execute();//execute all the statements
            /*/
            String join = "SELECT u.name, c.name FROM users AS u JOIN cars AS c ON c.owner_id = u.id";
            ResultSet resultSet = db.prepareStatement(join).executeQuery();
            for(resultSet.first(); !resultSet.isAfterLast(); resultSet.next()){//start from first, until not ended, move next
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }
            //*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
