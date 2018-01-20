package couche.acces.donnees;

import java.util.ArrayList;
import java.util.List;

import couche.acces.donnees.modele.MembreAssociation;
import couche.acces.donnees.modele.MembreAssociationDTO;

/**
 * Dans cette classe, quelques méthodes statiques vont peremttre de tester l'utilisatsation d'un datasource dans la JSP d'accueil
 * @author ezy
 *
 */
public class GestionnaireBDD {
	
	/**
	 * Retourne une liste de MembreAssociation, en interrogeeant la base de données
	 * @return
	 */
	public List<MembreAssociationDTO> retournerMembresAssociation(){
		List<MembreAssociationDTO> retour;
		retour = new ArrayList<MembreAssociationDTO>();
		// TODO: aller chercher les Membres de l'association dans la BDD, puis les retourner
		return retour;
	}
}
