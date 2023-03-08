    public class ProvaEserc1 {
        public static void main(String[] args) {
            Portata p1 = new Portata("antipasto",8.5,false);
            Portata p2 = new Portata("matriciana",12.5,false);
            Portata p3 = new Portata("bistecca",25,false);
            Portata p4 = new Portata("insalata",3,false);
            Portata p5 = new Portata("negramaro",15.5,true);
            Portata p6 = new Portata("acqua",2.5,true);
            Ordinazione o = new Ordinazione("luca");
            o.aggiungiPortata(p1, 3);
            o.aggiungiPortata(p2, 4);
            o.aggiungiPortata(p3, 3);
            o.aggiungiPortata(p4, 1);
            o.aggiungiPortata(p5, 3);
            o.aggiungiPortata(p6, 2);
            System.out.println("Conto: " + o.conto());
            System.out.println("Conto bevande: " + o.contoBevande());
            System.out.println("Portate: " + o.portateOrdinate());
            System.out.println("Totale portate: " + o.numeroTotalePortate());
            p1.setPrezzo(10);
            p2.setPrezzo(10);
            p3.setPrezzo(10);
            p4.setPrezzo(10);
            p5.setPrezzo(10);
            p6.setPrezzo(10);
            System.out.println("Conto: " + o.conto());
            System.out.println("Conto bevande: " + o.contoBevande());
            System.out.println("Portate: " + o.portateOrdinate());
            System.out.println("Totale portate: " + o.numeroTotalePortate());
        }
    }