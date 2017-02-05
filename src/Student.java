import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements LärareExaminatorStudent {

	private String studentNamn;
	private int studentPersonNr;
	private int studentId;
	List<Kurs> minaAktivaKurser = new ArrayList<Kurs>();
	
	public Student(int id, int personNr, String namn) {
		super(id, personNr, namn);
		this.studentNamn = namn;
		this.studentPersonNr = personNr;
		this.studentId = id;
		// TODO Auto-generated constructor stub
	}
    
	public String hämtaStudentNamn(){
		return studentNamn;
	}
	
	public int hämtaStudentPersonNr(){
		return studentPersonNr;
	}
	
	public int hämtaStudentId(){
		return studentId;
	}
	
	public void läggTillAktivKurs(Kurs k) {
		minaAktivaKurser.add(k);
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
