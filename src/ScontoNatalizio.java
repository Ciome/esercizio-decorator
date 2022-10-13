
public class ScontoNatalizio extends AbstractProdottoScontato {

	public ScontoNatalizio(Prodotto prodotto) {
		super(prodotto);
	}

	@Override
	public long applicaSconto(long prezzo) {
		return prezzo/2;
	}

}
