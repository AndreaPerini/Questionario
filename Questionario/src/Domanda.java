import java.util.*;

public class Domanda {

	private String domanda;
	private List<Risposta> risposte;

	public Domanda(String domanda) {
		this.domanda = domanda;
		risposte = new ArrayList<Risposta>();
	}

	public String getDomanda() {
		return domanda;
	}

	public List<Risposta> getRisposte() {
		return risposte;
	}

	@Override
	public String toString() {
		return domanda + "\n   " + risposte;
	}

}
