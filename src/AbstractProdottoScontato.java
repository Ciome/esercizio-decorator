
public abstract class AbstractProdottoScontato implements Prodotto {
	
	Prodotto prodotto;
	
	public AbstractProdottoScontato(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	public long getPrezzo() {
		return applicaSconto(prodotto.getPrezzo());
	}
	
	public abstract long applicaSconto(long prezzo);

}
