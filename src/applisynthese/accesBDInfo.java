/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applisynthese;
import connexion.ConnexionOracleFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import métier.Employe;
/**
 *
 * @author p1210292
 */
public class accesBDInfo {
    private Connection connexionBD;
    // Constructeur privé pour le singleton.
    private accesBDInfo() {
    connexionBD = ConnexionOracleFactory.creerConnexion();
    // initialiser les PreparedStatement();
    }

// L'unique instance de la classe
private static accesBDInfo instance = null;
/**
* Cette fonction retourne l'unique instance de la classe
*/
public static accesBDInfo getInstance() {
if (instance == null)
instance = new accesBDInfo();
return instance;
}

}

