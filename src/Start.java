import java.sql.SQLException;

public class Start {

    public static void main(String[] args) throws SQLException {

        Menu menu = new Menu();
        Portata portata = new Portata();

        //menu.createTableMenu();
        //portata.createTablePortata();

        portata.alterTablePortata();

        //TODO creare costruttori, creare oggetti, creare metodo insert per inserire un menu
        //inserire una portata passando il menu, select di id da menu tramite nome, memoriziamo id in variabile temp per darla all'insert della portata
        //NB inserire unique sul nome del menu
    }
}
