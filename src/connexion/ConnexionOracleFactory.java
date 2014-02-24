/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;
/**
* Factory. Classe qui sert à contenir
une méthode statique qui crée
* une connexion à Oracle à partir d'un fi
chier de paramètres de configuration
*/
public class ConnexionOracleFactory {
    
    private ConnexionOracleFactory(){
    
    }
    /**
* Factory method. Cette fonction
crée l'objet de connexion à Oracle.
*/
public static Connection creerConnexion(){
try {
Properties props = new Properties();
FileInputStream fichier = new FileInputStream("connexion.properties");
props.load(fichier);
OracleDataSource ods = new OracleDataSource();
ods.setDriverType(props.getProperty("pilote"));
ods.setPortNumber(new Integer(props
.getProperty("port")).intValue());
ods.setServiceName(props.getProperty("service"));
ods.setUser(props.getProperty("user"));
ods.setPassword(props.getProperty("pwd"));
ods.setServerName(props.getProperty("serveur"));
return(ods.getConnection());
}
catch (Exception e) {
System.err.println("Erreur lors de la lecture du fichier de configuration pour la connexion");
return null;
} } } // Fin Classe ConnexionOracleFactory
