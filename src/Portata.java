/*Scrivere una classe Java: Portata, che rappresenta una portata ordinabile in un ristorante.
La portata è caratterizzata da una descrizione (stringa), dal prezzo (double)
e da un booleano che posto uguale a TRUE rappresenta il fatto che la portata
è una bevanda.
La classe ha un costruttore che prende in ingresso una stringa, un double e un boolean
li imposta come campi d'esemplare del nuovo oggetto, e in piu' fornisce i seguenti metodi:
isBevanda() che restituisce un boolean che rappresenta il fatto
che la portata su cui si invoca il metodo e' una bevanda
getPrezzo() che restituisce il prezzo della portata
setPrezzo(d) che preso in ingresso un double d lo imposta come nuovo prezzo della portata.
*/
public class Portata {
    private String descrizione;
    private double prezzo;
    private boolean bevanda;

    public Portata(String descrizione, double prezzo, boolean bevanda) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.bevanda = bevanda;
    }

    public boolean isBevanda() {
        return bevanda;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
