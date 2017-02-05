import java.util.ArrayList;
import java.util.List;

public class Lärare extends Person implements  LärareExaminatorStudent{

	private String lärareNamn;
	private int lärarePersonNr;
	private int lärareId;
	List<Kurs> minaAktivaKurser = new ArrayList<Kurs>();
	
	public Lärare(int id, int personNr, String namn) {
		super(id, personNr, namn);
		this.lärareNamn = namn;
		this.lärarePersonNr = personNr;
		this.lärareId = id;
	}
	
	public String hämtaLärareNamn(){
		return lärareNamn;
	}
	
	public int hämtaLärarePersonNr(){
		return lärarePersonNr;
	}
	
	public int hämtaLärareId(){
		return lärareId;
	}
	
	public void läggTillAktivKurs(Kurs k) {
		minaAktivaKurser.add(k);
	}
	
	
	@Override
	public void seAllaKurser() {

	}
	
	@Override
	public List<Kurs> seAllaMinaKurser() {
		return minaAktivaKurser;
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
