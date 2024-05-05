package adsaufgabe1;

public class Testtreiber {
    public static void main(String[] args) {
        IInversionszahl invz = new Inversionszahl_jglueck();
        int inv;

        // Tesfall 1
        String[] feld1 = {"aaa", "bba", "aba", "aab"};
        int inv1 = 5;
        inv = invz.berechne(feld1);
        if (inv == inv1)
            System.out.println("Testfall 1 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 1 (" + inv + " statt " + inv1 + ")");

        // Testfall 2
        String[] feld2 = {"aba", "baaza", "cccba", "abab", "bab", "baaaa", "bazbab"};
        int inv2 = 9;
        inv = invz.berechne(feld2);
        if (inv == inv2)
            System.out.println("Testfall 2 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 2 (" + inv + " statt " + inv2 + ")");

        // Testfall 3
        String[] feld3 = {"aaa", "aaa", "aaa", "aaa"};
        int inv3 = 0;
        inv = invz.berechne(feld3);
        if (inv == inv3)
            System.out.println("Testfall 3 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 3 (" + inv + " statt " + inv3 + ")");

        // Testfall 4
        String[] feld4 = {};
        int inv4 = 0;
        inv = invz.berechne(feld4);
        if (inv == inv4)
            System.out.println("Testfall 4 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 4 (" + inv + " statt " + inv4 + ")");

        // Testfall 5: Array mit nur einem Element
        String[] feld5 = {"abc"};
        int inv5 = 0;
        inv = invz.berechne(feld5);
        if (inv == inv5)
            System.out.println("Testfall 5 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 5 (" + inv + " statt " + inv5 + ")");

        // Testfall 6: Array mit null-Elementen
        String[] feld6 = {null, null, null};
        int inv6 = 0;
        inv = invz.berechne(feld6);
        if (inv == inv6)
            System.out.println("Testfall 6 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 6 (" + inv + " statt " + inv6 + ")");

        // Testfall 7: Array mit absteigend sortierten Elementen
        String[] feld7 = {"xyz", "uvw", "lmn", "ghi"};
        int inv7 = 0;
        inv = invz.berechne(feld7);
        if (inv == inv7)
            System.out.println("Testfall 7 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 7 (" + inv + " statt " + inv7 + ")");

        // Testfall 8: Array mit aufeinanderfolgenden Duplikaten
        String[] feld8 = {"abc", "abc", "abc", "abc"};
        int inv8 = 0;
        inv = invz.berechne(feld8);
        if (inv == inv8)
            System.out.println("Testfall 8 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 8 (" + inv + " statt " + inv8 + ")");

        // Testfall 9: Array mit gemischten normalen Zeichenfolgen und null-Elementen
        String[] feld9 = {"aaa", null, "bba", null, "aba", "aab"};
        int inv9 = 5; // Erwartete Inversionszahl für die normalen Zeichenfolgen
        inv = invz.berechne(feld9);
        for(String e : feld9){
            System.out.println(e);
        }
        if (inv == inv9)
            System.out.println("Testfall 9 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 9 (" + inv + " statt " + inv9 + ")");
    }
}
