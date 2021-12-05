package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ense�anza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ense�anza;
		this.interpretacion = interpretacion;
	}

	public String getEnse�anza() {
		return ensenanza;
	}

	public void setEnse�anza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int numero) {
		return this.getPaginas()*(numero*1);
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		
		return this.getOrigen() + "\n" +
				   this.getTitulo() + "\n" +
				   this.getAutor() + "\n" +
				   this.getPaginas() + "\n" +
				   this.ensenanza +  "\n";
	}
}
