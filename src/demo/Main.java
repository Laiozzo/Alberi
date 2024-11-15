
package demo;

import model.AlberoBinario;
import model.Nodo;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlberoBinario t = new AlberoBinario();

        t.inserisci(10);
        t.inserisci(20);
        t.inserisci(8);
        t.inserisci(12);
        t.inserisci(17);
        t.inserisci(25);
        t.inserisci(26);
        t.inserisci(27);

        System.out.println(t.contaNodi(t.getRadice()));

        System.out.println(t.findMax(t.getRadice()));

        System.out.println(t.getH(t.getRadice()));




    }
}
