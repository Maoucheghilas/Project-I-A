package SystemEX;


public class Fait {
	// attributs 
	private String id1;
	private String predicat;
	private String id2;
	/*
	 * constructeur 
	 */
	public Fait(String i1, String p, String i2 ) {
		id1=i1;
		id2=i2;
		predicat=p;
	}
	
	/*
	 * methodes 
	 */
	
	public boolean egale(Fait f) {
		return id1==f.id1
			&& id2==f.id2
			&& predicat== f.getPredicat();
	}
	
	public String tostring() {
		return id1+" "+predicat+" "+id2;
	}
	
	
	/*
	 * Getter et les setter 
	 */
	public String getId1() {
		return id1;
	}
	public void setId1(String id1) {
		this.id1 = id1;
	}
	public String getPredicat() {
		return predicat;
	}
	public void setPredicat(String predicat) {
		this.predicat = predicat;
	}
	public String getId2() {
		return id2;
	}
	public void setId2(String id2) {
		this.id2 = id2;
	}
	
	
}
