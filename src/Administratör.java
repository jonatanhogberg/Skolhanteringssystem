import java.util.ArrayList;
import java.util.List;

public class Administratör {

	List<Kurs> allaKurser = new ArrayList<Kurs>();
	List<Student> allaStudenter = new ArrayList<Student>();
	List<Lärare> allaLärare = new ArrayList<Lärare>();
	List<Examinator> allaExaminatorer = new ArrayList<Examinator>();
	List<Kurs> kurstillfälle = new ArrayList<Kurs>();
	
	public List<Kurs> sättInKursIAllaKurser (Kurs kurs){
		for (Kurs k : allaKurser) {
		   if(k.hämtaKursKod().equals(kurs.hämtaKursKod())){
			   System.out.println("Kursen finns redan i listan.");
			   return allaKurser;
		   }		 
		}
		allaKurser.add(kurs);
		return allaKurser;	
	}
	
	public List<Student> sättInStudentIAllaStudenter (Student student){
		for (Student s : allaStudenter) {
		   if(s.hämtaStudentId() == (student.hämtaStudentId())){
			   System.out.println("Studenten finns redan i listan.");
			   return allaStudenter;
		   }		 
		}
		allaStudenter.add(student);
		return allaStudenter;	
	}
	
	public List<Lärare> sättInLärareIAllaLärare (Lärare lärare){
		for (Lärare l : allaLärare) {
		   if(l.hämtaLärareId() == lärare.hämtaLärareId()){
			   System.out.println("Läraren finns redan i listan.");
			   return allaLärare;
		   }		 
		}
		allaLärare.add(lärare);
		return allaLärare;	
	}
	
	public List<Examinator> sättInExaminatorIAllaExaminatorer (Examinator examinator){
		for (Examinator e : allaExaminatorer) {
		   if(e.hämtaExaminatorId() == examinator.hämtaExaminatorId()){
			   System.out.println("Examinatorn finns redan i listan.");
			   return allaExaminatorer;
		   }		 
		}
		allaExaminatorer.add(examinator);
		return allaExaminatorer;	
	}
	
	public List<Kurs> regPersonerTillKurstillfällen (Kurs k, Lärare l, Examinator ex, Student s){
		for (Kurs ku : allaKurser) { 	//kolla att kurs finns
			if(ku.hämtaKursKod().equals(k.hämtaKursKod())) {		
				l.läggTillAktivKurs(k); // lärare
				ex.läggTillAktivKurs(k); // examinator
				s.läggTillAktivKurs(k);	//student 					
			}	
		}
		return kurstillfälle;
	}
	
	/*public List<Kurs> regExaminatorTillKurstillfälle (Examinator examinator){
		//kurstillfälle.add(examinator);
		return kurstillfälle;
	}
	
	public List<Kurs> regStudentTillKurstillfälle (Student student){
		//kurstillfälle.add(student);
		return kurstillfälle;
	}*/
	
	public List<Kurs> taBortLärareFrånKurstillfälle (Lärare lärare){
		kurstillfälle.remove(lärare);
		return kurstillfälle;
	}
	
	public List<Kurs> taBortExaminatorFrånKurstillfälle (Examinator examinator){
		kurstillfälle.remove(examinator);
		return kurstillfälle;
	}
	
	public List<Kurs> taBortStudentFrånKurstillfälle (Student student){
		kurstillfälle.remove(student);
		return kurstillfälle;
	}
	
	public void regKursTillKurstillfälle(Kurs k) {
	    kurstillfälle.add(k);		
	}
	
	public void ändraLärareTillKurstillfälle(){
		
	}
	
	public void ändraExaminatorTillKurstillfälle(){
		
	}
	
	public void ändraStudentTillKurstillfälle(){
		
	}

}
