
public class ScontoStudente extends AbstractProdottoScontato {

	public ScontoStudente(Prodotto prodotto) {
		super(prodotto);
	}

	@Override
	public long applicaSconto(long prezzo) {
		return Math.max(0, prezzo - 5);
	}
}
