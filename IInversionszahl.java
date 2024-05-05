package adsaufgabe1;

public interface IInversionszahl {

    /*
      Die Methode erhaelt ein Feld A[0..(n-1)] mit n Strings und
      ermittelt die Inversionszahl des Feldes gemaess des auf dem
      Aufgabenblatt spezifizierten Sortierkriteriums.
      Als Seiteneffekt sollte bei einer Implementation mit 
      Insertionsort das Feld sortiert werden.
     */
    public int berechne(String[] feld);

}
