package SystemEX;

import java.util.Vector;

public class BaseDeConnaissance extends Vector<Fait> {
	private static final long serialVersionUID = 1L;
	
	public boolean verfierRegle(Regle regle) {
		// Pour chaque regle
		for(Fait condition:regle.getConditions()) {
			// La condition n'est pour le moment pas vérifiée
			boolean condition_verfier=false;
			// Pour chaque fait de la base de connaissances
			for(Fait fait: this) {
				
				// On vérifie qu'au moins un fait de la base de connaissances est égal à une condition
				if(condition.egale(fait)) {
					condition_verfier=true;
					// Si on a trouvé un fait alors on arrête la boucle pour passer à la condition suivante
					break;
				}
			}
			// Si une condition n'a pas été vérifiée alors la règle ne peut pas l'être
			if(!condition_verfier)
				return false;
		}
		
		// Toutes les premisses sont réspectées
		return true;
	}

}
