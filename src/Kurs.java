
public class Kurs {
	private String kursNamn;
	private String kursKod;
	private String kursStart;
	private String kursSlut;
	private int lärarId;
	private int examinatorId;
	
	public Kurs(int lärarId, int examinatorId, String kursNamn, String kursKod, String kursStart, String kursSlut) {
		this.kursNamn = kursNamn;
		this.kursKod = kursKod;
		this.kursStart = kursStart;
		this.kursSlut = kursSlut;
		this.lärarId = lärarId;
		this.examinatorId = examinatorId;
	}
	
	public int hämtaLärarId(){
		return lärarId;	
	}
	
	public int hämtaExaminatorId(){
		return examinatorId;	
	}
	
	public String hämtaKursNamn(){
		return kursNamn;	
	}
	
	public String hämtaKursKod(){
		return kursKod;	
	}
	
	public String hämtaKursStart(){
		return kursStart;	
	};
	
	public String hämtaKursSlut(){
		return kursSlut;	
	};
}
