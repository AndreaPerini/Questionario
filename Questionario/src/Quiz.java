import java.util.*;

public class Quiz {

	private List<Domanda> domande;

	public Quiz() {
		domande = new ArrayList<Domanda>();
	}

	public List<Domanda> getDomande() {
		return domande;
	}

	public void aggiungiDomanda(Domanda d) {
		domande.add(d);
	}

}
