
public class Main {

	public static void main(String[] args) {
		
		Administratör admin = new Administratör();
		
		Kurs kurs1 = new Kurs(1, 1, "Utveckling av databasapplikation", "DV046B", "2016-08-15", "2017-01-23");
		Kurs kurs2 = new Kurs(2, 2, "Kvalitetsstyrning", "KS710A", "2016-08-04", "2017-01-20");
		Kurs kurs3 = new Kurs(3, 3, "Introduktion till datakommunikation", "DVG323", "2016-08-08", "2017-01-28");
		Kurs kurs4 = new Kurs(4, 4, "Algoritmer och datastrukturer I", "DVG312", "2016-08-10", "2017-01-22");
		Kurs kurs5 = new Kurs(5, 5, "Envariabelanalys", "MA034A", "2016-08-02", "2017-01-07");
		
		Student student1 = new Student(1, 920206, "Mia Halvarsson");
		Student student2 = new Student(2, 940101, "Gustav Stensson");
		Student student3 = new Student(3, 891201, "Pernilla Lindström");
		Student student4 = new Student(4, 900210, "Andreas Adolfsson");
		Student student5 = new Student(5, 930308, "Anton Bengtsson");
		
		Examinator examinator1 = new Examinator(1, 781019, "Sofie Andersson");
		Examinator examinator2 = new Examinator(2, 771209, "Egon Olofsson");
		Examinator examinator3 = new Examinator(3, 690201, "Pär Bergström");
		Examinator examinator4 = new Examinator(4, 720929, "Oskar Klasson");
		Examinator examinator5 = new Examinator(5, 750620, "Malin Sjö");
		
		Lärare lärare1 = new Lärare(1, 821106, "Hugo Hermansson");
		Lärare lärare2 = new Lärare(2, 800801, "Hans Karlsson");
		Lärare lärare3 = new Lärare(3, 791220, "Martina Josefsson");
		Lärare lärare4 = new Lärare(4, 870528, "Stina Sundström");
		Lärare lärare5 = new Lärare(5, 830101, "Alice Berg");
		
		admin.sättInKursIAllaKurser(kurs1); //KURS SKAPAD
		admin.sättInKursIAllaKurser(kurs2);
		admin.sättInKursIAllaKurser(kurs3);
		admin.sättInKursIAllaKurser(kurs4);
		admin.sättInKursIAllaKurser(kurs5);
		
		admin.sättInStudentIAllaStudenter(student1);
		admin.sättInStudentIAllaStudenter(student2);
		admin.sättInStudentIAllaStudenter(student3);
		admin.sättInStudentIAllaStudenter(student4);
		admin.sättInStudentIAllaStudenter(student5);
		
		admin.sättInLärareIAllaLärare(lärare1);
		admin.sättInLärareIAllaLärare(lärare2);
		admin.sättInLärareIAllaLärare(lärare3);
		admin.sättInLärareIAllaLärare(lärare4);
		admin.sättInLärareIAllaLärare(lärare5);
		
		admin.sättInExaminatorIAllaExaminatorer(examinator1);
		admin.sättInExaminatorIAllaExaminatorer(examinator2);
		admin.sättInExaminatorIAllaExaminatorer(examinator3);
		admin.sättInExaminatorIAllaExaminatorer(examinator4);
		admin.sättInExaminatorIAllaExaminatorer(examinator5);
		
		for(int i=0; i<admin.allaKurser.size(); i++){
			System.out.println("Kursnamn: " + admin.allaKurser.get(i).hämtaKursNamn() + 
					"\n" + "Kurskod: " + admin.allaKurser.get(i).hämtaKursKod() +
					"\n" + "Kursstart: " + admin.allaKurser.get(i).hämtaKursStart() +
					"\n" + "Kursslut: " + admin.allaKurser.get(i).hämtaKursSlut()
					);
			System.out.println("--------------------");
		}
			
		System.out.println();
			
		for(int i=0; i<admin.allaStudenter.size(); i++){
			System.out.println("Studentens namn: " + admin.allaStudenter.get(i).hämtaStudentNamn() + 
					"\n" + "Studentens personnummer: " + admin.allaStudenter.get(i).hämtaStudentPersonNr()
					);
			System.out.println("--------------------");
		}
			
		System.out.println();
			
		for(int i=0; i<admin.allaLärare.size(); i++){
			System.out.println("Lärarens namn: " + admin.allaLärare.get(i).hämtaLärareNamn() + 
					"\n" + "Lärarens personnummer: " + admin.allaLärare.get(i).hämtaLärarePersonNr()
					);
			System.out.println("--------------------");
		}
			
		System.out.println();
			
		for(int i=0; i<admin.allaExaminatorer.size(); i++){
			System.out.println("Examinatorns namn: " + admin.allaExaminatorer.get(i).hämtaExaminatorNamn() + 
					"\n" + "Examinatorns personnummer: " + admin.allaExaminatorer.get(i).hämtaExaminatorPersonNr()
					);
			System.out.println("--------------------");
		}
			
		System.out.println();
		
		// Här registrerar admin ett kurstillfälle
		admin.regKursTillKurstillfälle(kurs1); 
		admin.regKursTillKurstillfälle(kurs2); 
	
		//Här registrerar admin lärare,examinator och student till kurstillfälle
		admin.regPersonerTillKurstillfällen(kurs1, lärare1, examinator1, student1); 
		admin.regPersonerTillKurstillfällen(kurs2, lärare1, examinator2, student4);
	
		//Lärare1 kollar en kurs som är aktiv för han.
		System.out.println("Lärare: " + lärare1.hämtaLärareNamn() + "\n" +
					   "Kursnamn: " + lärare1.minaAktivaKurser.get(0).hämtaKursNamn() + "\n" + 
					   "Kurskod: " + lärare1.minaAktivaKurser.get(0).hämtaKursKod() + "\n" +
					   "Kursstart: " + lärare1.minaAktivaKurser.get(0).hämtaKursStart() + "\n" +
					   "Kursslut: " + lärare1.minaAktivaKurser.get(0).hämtaKursSlut()
		);
	
		System.out.println();
	
		//Examinator1 kollar en kurs som är aktiv för henne.
		System.out.println("Examinator: " + examinator1.hämtaExaminatorNamn() + "\n" +
			   		   "Kursnamn: " + examinator1.minaAktivaKurser.get(0).hämtaKursNamn() + "\n" + 
			   		   "Kurskod: " + examinator1.minaAktivaKurser.get(0).hämtaKursKod() + "\n" +
			   		   "Kursstart: " + examinator1.minaAktivaKurser.get(0).hämtaKursStart() + "\n" +
			   		   "Kursslut: " + examinator1.minaAktivaKurser.get(0).hämtaKursSlut()
		);
	
		System.out.println();
		
		//Student1 kollar en kurs som är aktiv för henne.
		System.out.println("Student: " + student1.hämtaStudentNamn() + "\n" +
			   		   "Kursnamn: " + student1.minaAktivaKurser.get(0).hämtaKursNamn() + "\n" + 
			   		   "Kurskod: " + student1.minaAktivaKurser.get(0).hämtaKursKod() + "\n" +
			   		   "Kursstart: " + student1.minaAktivaKurser.get(0).hämtaKursStart() + "\n" +
			   		   "Kursslut: " + student1.minaAktivaKurser.get(0).hämtaKursSlut()
		);		
	}
}
