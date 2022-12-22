import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Menu {

    private final String url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "root";
    private final String password = "PinoDaniele03";


    public void createTableMenu() throws SQLException {

        Connection con = DriverManager.getConnection(url, user, password);
        Statement statement = con.createStatement();

        String menu = ""
                + "CREATE TABLE `menu` ( "
                + "  `menu_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `tipo` varchar(30) DEFAULT NULL, "
                + "  PRIMARY KEY (`menu_id`) "
                + ")";

        statement.executeUpdate(menu);

        System.out.println("Tabella menu creata correttamente");
    }

}
