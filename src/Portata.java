import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Portata{

    private final String url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "root";
    private final String password = "PinoDaniele03";


    public void createTablePortata() throws SQLException{

            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();

        String portata = ""
                + "CREATE TABLE `portata` ( "
                + "  `portata_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `price` int  DEFAULT NULL, "
                + "  PRIMARY KEY (`portata_id`) "
                + ")";


        statement.executeUpdate(portata);

        System.out.println("Tabella portata creata correttamente");

    }

    public void alterTablePortata() throws SQLException{

        Connection con = DriverManager.getConnection(url, user, password);
        Statement statement = con.createStatement();

        String varname1 = ""
                + "ALTER TABLE newdb.portata ADD id_menu INT NOT NULL;";


        String varname11 = ""
                + "ALTER TABLE newdb.portata ADD CONSTRAINT portata_FK FOREIGN KEY (id_menu) REFERENCES newdb.menu(menu_id);";

        statement.executeUpdate(varname1);
        statement.executeUpdate(varname11);

        statement.close();

        System.out.println("Alter table eseguita");
    }

}