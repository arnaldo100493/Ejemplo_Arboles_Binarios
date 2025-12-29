/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class NodoArbolBinario<E> {

    private NodoArbolBinario<E> hijoIzquierdo;
    private E elemento;
    private NodoArbolBinario<E> hijoDerecho;

    public NodoArbolBinario() {
        this.hijoIzquierdo = null;
        this.elemento = null;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(E elemento) {
        this.hijoIzquierdo = null;
        this.elemento = elemento;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(NodoArbolBinario<E> hijoIzquierdo, E elemento, NodoArbolBinario<E> hijoDerecho) {
        this.hijoIzquierdo = hijoIzquierdo;
        this.elemento = elemento;
        this.hijoDerecho = hijoDerecho;
    }

    public NodoArbolBinario<E> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolBinario<E> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public NodoArbolBinario<E> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolBinario<E> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
}
