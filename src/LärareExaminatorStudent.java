import java.util.List;

public interface LärareExaminatorStudent {

	public void seAllaKurser();
	
	public List<Kurs> seAllaMinaKurser();
	
	public void seAllaKurstillfällen();
	
	public void seExaminatorerTillKurser();
	
	public void seLärareTillKurser();
	
	public void seStudenterTillKurstillfällen();
}
