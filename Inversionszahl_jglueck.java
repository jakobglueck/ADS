package adsaufgabe1;

public class Inversionszahl_jglueck implements IInversionszahl {

    public Inversionszahl_jglueck() {
    }

    public int berechne(String[] feld) {
        // es findet kein Austausch stat bei bei null, einem Element oder allen Elementen gleich
        if (feld == null || feld.length <= 1 || allElementsSame(feld)) {
            return 0;
        }

        int inversionZahl = 0;

        // Iteration des Array, beginnend beim zweiten Element
        for (int i = 1; i < feld.length; i++) {
            // temporäre Variable mit aktuellen Element
            String neuesFeld = feld[i];
            // gehe zum nächsten Element, wenn das aktuelle Element null ist
            if (neuesFeld == null) continue;
            // neuer Index, der auf das aktuelle Element zeigt
            int k = i;

            // Sortierung der Elemente, um das aktuelle Element an die richtige Position zu bringen
            while (k > 0 && (feld[k - 1] == null || compareStrings(feld[k - 1], neuesFeld) > 0)) {
                // Verschiebe Elemente nach rechts, um Platz für das aktuelle Element zu machen
                if (feld[k - 1] != null) {
                    feld[k] = feld[k - 1];
                }
                // spring zum vorherigen Element im Array
                k--;
            }
            // das aktuelle Element an der richtigen Position im sortierten Array setzen
            feld[k] = neuesFeld;
            //  Inversionszahl ändern, wenn das Element verschoben wurde
            if (k != i) {
                inversionZahl += i - k;
            }
        }
        // Rückgabe Inversionszahl
        return inversionZahl;
    }

    private int compareStrings(String s, String t) {
        // Überprüfe, ob beide Strings null sind
        if (s == null && t == null) {
            return 0; 
        }
        // Überprüfe, ob s null ist
        if (s == null) {
            return 1; 
        }
        // Überprüfe, ob t null ist
        if (t == null) {
            return 1;
        }
        //  Groß- und Kleinschreibung kann ignoriert werden dadurch 
        s = s.toLowerCase();
        t = t.toLowerCase();
    
        // Ermittle die Indizes von a in den Strings s und t
        int IndexAinS = s.indexOf('a');
        int IndexAinT = t.indexOf('a');
    
        // Ermittle die letzten Indizes von b in den Strings s und t 
        int IndexBinS = s.lastIndexOf('b');
        int IndexBinT = t.lastIndexOf('b');
    
        // Wenn s oder t kein a enthalten, wird der Index auf den größtmöglichen Wert gesetzt
        if (IndexAinS == -1) {
            IndexAinS = Integer.MAX_VALUE;
        }
        if (IndexAinT == -1) {
            IndexAinT = Integer.MAX_VALUE;
        }
    
        // Vergleich der Indizes von a in s und t
        if (IndexAinS < IndexAinT) {
            return -1; 
        } 
        else if (IndexAinS > IndexAinT) {
            return 1;
        } 
        else {
            // Wenn a in beiden Strings am gleichen Index vorkommt werden die Indizes von b verglichen 
            if (IndexBinS == -1) IndexBinS = -1; 
            if (IndexBinT == -1) IndexBinT = -1;
    
            // Vergleiche die Indizes von b in s und t
            if (IndexBinS == IndexBinT) {
                // Wenn die Indizes von b in s und t gleich sind, vergleiche die Längen der Strings
                return Integer.compare(s.length() - IndexBinS, t.length() - IndexBinT);
            } 
            else {
                return Integer.compare(s.length() - IndexBinS, t.length() - IndexBinT);
            }
        }
    }
    
    // Überprüfe, ob alle Elemente in einem Array gleich sind
    private boolean allElementsSame(String[] elements) {
        for (int i = 1; i < elements.length; i++) {
            // Wenn das aktuelle Element null ist oder nicht gleich dem ersten Element ist, ist das Array nicht gleich
            if (elements[i] == null || !elements[i].equals(elements[0])) {
                return false;
            }
        }
        return true;
    }
}