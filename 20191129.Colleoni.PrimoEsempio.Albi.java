//  tested


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrimoEsempio {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//	caricare il driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//	creare una connessione
	  Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/albi-esempi1129", "root", "");
	//	Connection conn = DriverManager.getConnection("jdbc:mariadb://192.168.203.16:3306/esempi2911", "root", "");			      	//  Andrea
	//	Connection conn = DriverManager.getConnection("jdbc:mariadb://192.168.203.11:3306/esempi1129", "root", "password");		//	prof
		
		// inviare comandi i SQL
		Statement st = conn.createStatement();
		ResultSet dati = st.executeQuery("select * from tabella");
		
		//	leggere i risultati
		while (dati.next()) {
			System.out.println(dati.getString("campi1") + "   " + dati.getString("campo2"));
		}
		
		//	terminare la connessione
		conn.close();
		
	}

}
