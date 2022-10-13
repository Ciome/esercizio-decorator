
public class ProdottoConcreto implements Prodotto {
	
	private long prezzo;
	
	public ProdottoConcreto(long prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public long getPrezzo() {
		return this.prezzo;
	}

}
