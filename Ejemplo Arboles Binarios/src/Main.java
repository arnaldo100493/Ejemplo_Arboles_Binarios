/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("ARBOLES BINARIOS");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario ab = new ArbolBinario();

        NodoArbolBinario n1 = new NodoArbolBinario(1);
        NodoArbolBinario n2 = new NodoArbolBinario(2);
        NodoArbolBinario n3 = new NodoArbolBinario(3);
        NodoArbolBinario n4 = new NodoArbolBinario(4);
        NodoArbolBinario n5 = new NodoArbolBinario(5);
        NodoArbolBinario n6 = new NodoArbolBinario(6);
        NodoArbolBinario n7 = new NodoArbolBinario(7);

        n5.setHijoIzquierdo(n6);
        n5.setHijoDerecho(n7);
        n2.setHijoIzquierdo(n4);
        n2.setHijoDerecho(n5);
        n1.setHijoIzquierdo(n2);
        n1.setHijoDerecho(n3);
        ab.setRaiz(n1);

        c.println(ab.preorden());
        c.println(ab.postorden());
        c.println(ab.inorden());
        c.println(ab.contar());
        c.println(ab.sumar());
        c.println(ab.calcularAltura());
        c.println(ab.buscarMayor());

    }
}
