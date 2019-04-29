
public class Risposta {

	private String risposta;
	private boolean corretta;

	public String getRisposta() {
		return risposta;
	}

	public boolean isCorretta() {
		return corretta;
	}

	public Risposta(String risposta, boolean corretta) {
		this.risposta = risposta;
		this.corretta = corretta;
	}

	@Override
	public String toString() {
		return risposta + "\n";
	}
}
