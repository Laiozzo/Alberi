package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AlberoBinario {
    Nodo radice;

    public AlberoBinario() {
        radice = null;
    }


    public void inserisci(int valore){
        radice = inserisciRicorsivo(radice, valore);
    }


    public Nodo inserisciRicorsivo(Nodo nodo, int valore){
        if(nodo == null) {
            return new Nodo(valore);
        }

        if(valore < nodo.valore) {
            nodo.sinistra = inserisciRicorsivo(nodo.sinistra, valore);
        } else if (valore > nodo.valore) {
            nodo.destra = inserisciRicorsivo(nodo.destra, valore);
        }
        return nodo;
    }

    public Nodo getRadice() {
        return radice;
    }

    //DFP algoritmo ricorsivo per la ricerca in profondita di un algoritmo

    public boolean trovaValoreDPF(Nodo radice , int valore){
        if(radice == null) {
            return false;
        }

        if(radice.valore == valore) {
            return true;
        }

        return trovaValoreDPF(radice.sinistra, valore) || trovaValoreDPF(radice.destra, valore);
    }

    //BFS - Breadth first Search
    public boolean trovaValoreBFS(Nodo radice , int valore){
        if(radice == null) {
            return false;
        }

        Queue<Nodo> coda = new LinkedList<>();
        coda.add(radice);

        while(!coda.isEmpty()){
            Nodo nodo = coda.poll();
            if(nodo.valore == valore) {
                return true;
            }
            if(nodo.sinistra != null){
                coda.add(nodo.destra);
            }
            if(nodo.destra != null){
                coda.add(nodo.sinistra);
            }
        }
        return false;
    }

    public int findMax(Nodo radice){

        while(radice.destra != null){
            radice=radice.destra;
        }
        return radice.valore;
    }

    public int findMin(Nodo radice){
        while(radice.sinistra != null){
            radice=radice.sinistra;
        }
        return radice.valore;

    }

    public int contaNodi(Nodo radice) {

        int cont = 0;

        Queue<Nodo> coda = new LinkedList<>();
        coda.add(radice);

        while (!coda.isEmpty()) {

            Nodo nodo = coda.poll();
            cont++;

            if(nodo.sinistra != null){
                coda.add(nodo.sinistra);
            }

            if (nodo.destra != null) {
                coda.add(nodo.destra);
            }

        }

        return cont;
    }



    public int getH(Nodo radice) {
        if(radice == null) {
            return -1;
        }

        int altezzaSinistra = getH(radice.sinistra);
        int altezzaDestra = getH(radice.destra);
        return Math.max(altezzaSinistra, altezzaDestra)+1;
    }
}
