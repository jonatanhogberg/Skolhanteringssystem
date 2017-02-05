import java.util.ArrayList;
import java.util.List;

public class Examinator extends Person implements LärareExaminatorStudent{
	
	private String examinatorNamn;
	private int examinatorPersonNr;
	private int examinatorId;
	List<Kurs> minaAktivaKurser = new ArrayList<Kurs>();
	
	public Examinator(int id, int personNr, String namn) {
		super(id, personNr, namn);
		this.examinatorNamn = namn;
		this.examinatorPersonNr = personNr;
		this.examinatorId = id;
		// TODO Auto-generated constructor stub
	}
	
	public String hämtaExaminatorNamn(){
		return examinatorNamn;
	}
	
	public int hämtaExaminatorPersonNr(){
		return examinatorPersonNr;
	}
	
	public void läggTillAktivKurs(Kurs k) {
		  // om du inte har, lägg till iminaAktivaKurser
			minaAktivaKurser.add(k);
		}
	
	public int hämtaExaminatorId(){
		return examinatorId;
	}
	
	@Override
	public void seAllaKurser() {
    
	}
	
	@Override
	public List<Kurs> seAllaMinaKurser() {
		// TODO Auto-generated method stub	
		return null;
	}
	
	@Override
	public void seAllaKurstillfällen() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void seExaminatorerTillKurser() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void seLärareTillKurser() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void seStudenterTillKurstillfällen() {
		// TODO Auto-generated method stub	
	}
}
