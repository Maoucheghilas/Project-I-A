package SystemEX;

import java.util.Vector;

public class Run {

	public static void main(String[] args) {
		//quelques test 
		String p1="a de";
		//String p2="n'as pas de";
		String p3="est au";
		//Fait fait1=new Fait("sud", p2, "la pluie");
		Fait fait2= new Fait("nord", p1,"la pluie");
		Fait fait3=new Fait("paris",p3,"nord");
		Fait fait4=new Fait("paris",p1,"la pluie");
		Vector<Fait> condition=new Vector<Fait>();
		condition.add(fait2);
		condition.add(fait3);
		Regle R1=new Regle(condition,fait4);
		Vector<Fait> bdd=new Vector<Fait>();
		bdd.add(fait3);
		bdd.add(fait2);
		if (R1.verfierRegle(bdd))
			System.out.println("bravo la regle est verfier ");
		else
			System.out.println("la Regle n'est pas verfier");
		
		
		
	}

}
