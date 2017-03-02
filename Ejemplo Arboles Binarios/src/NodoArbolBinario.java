/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class NodoArbolBinario {

    private int dato;
    private NodoArbolBinario hijoIzquierdo;
    private NodoArbolBinario hijoDerecho;

    public NodoArbolBinario() {
        this.dato = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(int dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(int dato, NodoArbolBinario hijoIzquierdo, NodoArbolBinario hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public NodoArbolBinario(NodoArbolBinario nodo) {
        this.dato = nodo.getDato();
        this.hijoIzquierdo = nodo.getHijoIzquierdo();
        this.hijoDerecho = nodo.getHijoDerecho();
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbolBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbolBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

}
