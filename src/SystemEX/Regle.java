package SystemEX;

import java.util.Vector;

public class Regle {
	//atributs 
	private Vector<Fait> conditions;
	private Fait resultat;
	private boolean activable;
	
	
	/*
	 *		 methodes 
	 */
	

	//verfier si les condition d'une regle appartienne à une base de connaisance
	public boolean verfierRegle(Vector<Fait> base_connissance ) {
		
		
		for(Fait condition : conditions) {
			boolean verf=false;
			for(Fait connaisance : base_connissance) {
				if(condition.egale(connaisance)) {
					verf=true;
					break;
				}
			}
			//si on trouve une condition qui n'appartienne pas à une base alors la regle n'est pas bonne 
			if(!verf)
				return false;
		}
		return true ;
	}
	
	/*
	 * constrecteur 
	 */
	
	public Regle(Vector<Fait> Conditions, Fait Resultat) {
		conditions=Conditions;
		resultat=Resultat;
		activable=true;
	}
	/*
	 * getter and setter 
	 */

	public Vector<Fait> getConditions() {
		return conditions;
	}

	public void setConditions(Vector<Fait> condition) {
		this.conditions = condition;
	}

	public Fait getResultat() {
		return resultat;
	}

	public void setResultat(Fait resultat) {
		this.resultat = resultat;
	}

	public boolean isActivable() {
		return activable;
	}

	public void setActivable(boolean activable) {
		this.activable = activable;
	}
	
}
