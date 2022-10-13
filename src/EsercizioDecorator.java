/*
un ottimo esercizio per decorator secondo me e' "prodotto e sconti"
hai un interfaccia Prodotto che restituisce un prezzo, una classe concreta che implementa l'interfaccia,
una classe astratta AbstractProdottoScontato che verra' estesa da vari decoratori,
che "decoreranno" gli oggetti di tipo Prodotto, variandone il prezzo
hai tipo lo sconto a prezzo fisso -5 euro, oppure lo sconto studente che ti fa -n euro, lo sconto natalizzio che ti fa -n% ect

In pratica devi creare una matriosca di decoratori
 */
public class EsercizioDecorator {

	public static void main(String[] args) {
		Prodotto p = new ProdottoConcreto(50);
		System.out.println("prezzo intero: " + p.getPrezzo());
		
		ScontoNatalizio nat = new ScontoNatalizio(p);
		ScontoStudente stud = new ScontoStudente(nat);
		System.out.println("prezzo scontato: " + stud.getPrezzo());
	}

}
