/*
Scrivere una classe Java: Ordinazione.
Un'ordinazione è caratterizzata da una stringa rappresentante
il nome del cliente che ha effettuato l'ordinazione
e da un array (inizialmente vuoto) di portate ordinate,
ognuna delle quali ha associata la quantità ordinata.

La classe ha un costruttore che prende in ingresso il nome del cliente
e inizializza la nuova ordinazione,
e inoltre fornisce i seguenti metodi:

aggiungiPortata(p,q) che prende in ingresso una portata 'p' e un intero 'q', aggiunge la portata 'p'
all'array delle portate ordinate, con quantità corrispondente 'q'
conto() che restituisce il conto totale dell'ordinazione
contoBevande() che restituisce il costo totale delle bevande contenute nell'ordinazione
numeroTotalePortate() che restituisce la somma delle quantità ordinate di tutte le portate
portateOrdinate() che restituisce il numero delle diverse portate ordinate
*/
import java.util.ArrayList;
import java.util.HashSet; // Ho usato HashSet grazie all'aiuto di ChatGPT

public class Ordinazione {
    private String cliente;
    private ArrayList<Portata> portate = new ArrayList<Portata>();
    private ArrayList<Integer> quantita = new ArrayList<Integer>();

    public Ordinazione(String cliente) {
        this.cliente = cliente;
    }

    public void aggiungiPortata(Portata p, int q) {
        portate.add(p);
        quantita.add(q);
    }

    public double conto() {
        double totale = 0;
        for (int i = 0; i < portate.size(); i++) {
            totale += portate.get(i).getPrezzo() * quantita.get(i);
        }
        return totale;
    }

    public double contoBevande() {
        double totale = 0;
        for (int i = 0; i < portate.size(); i++) {
            if (portate.get(i).isBevanda()) {
                totale += portate.get(i).getPrezzo() * quantita.get(i);
            }
        }
        return totale;
    }

    public int numeroTotalePortate() {
        int totale = 0;
        for (int i = 0; i < quantita.size(); i++) {
            totale += quantita.get(i);
        }
        return totale;
    }

    public int portateOrdinate() {
        HashSet<Portata> set = new HashSet<Portata>(portate);
        return set.size();
    }
}
