
import java.util.LocalDate;

public class Repas{
	private int numero;
	private LocalDate date;

	public Repas(int numero, LocalDate date){
		this.numero = numero;
		this.date = date;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getNumero(){
		return numero;
	}
	
}
