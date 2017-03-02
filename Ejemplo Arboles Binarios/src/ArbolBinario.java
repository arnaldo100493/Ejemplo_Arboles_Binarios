/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class ArbolBinario {

    private NodoArbolBinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArbolBinario(NodoArbolBinario raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario(ArbolBinario arbolBinario) {
        this.raiz = arbolBinario.getRaiz();
    }

    public NodoArbolBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolBinario raiz) {
        this.raiz = raiz;
    }

    // RECORRIDO PREORDEN DE UN ÁRBOL
    private String preorden(NodoArbolBinario nodo, String s) {
        if (nodo != null) {
            s += " " + nodo.getDato();
            s = this.preorden(nodo.getHijoIzquierdo(), s);
            s = this.preorden(nodo.getHijoDerecho(), s);
        }
        return s;

    }

    public String preorden() {
        return "RECORRIDO PREORDEN: " + this.preorden(this.raiz, "");
    }

    // RECORRIDO POSTORDEN DE UN ÁRBOL
    private String postorden(NodoArbolBinario nodo, String s) {
        if (nodo != null) {
            s = this.postorden(nodo.getHijoIzquierdo(), s);
            s = this.postorden(nodo.getHijoDerecho(), s);
            s += " " + nodo.getDato();
        }
        return s;

    }

    public String postorden() {
        return "RECORRIDO POSTORDEN: " + this.postorden(this.raiz, "");
    }

    // RECORRIDO INORDEN DE UN ÁRBOL
    private String inorden(NodoArbolBinario nodo, String s) {
        if (nodo != null) {
            s = this.inorden(nodo.getHijoIzquierdo(), s);
            s += " " + nodo.getDato();
            s = this.inorden(nodo.getHijoDerecho(), s);

        }
        return s;

    }

    public String inorden() {
        return "RECORRIDO INORDEN: " + this.inorden(this.raiz, "");
    }

    // BUSCAR EL NODO DE UN ÁRBOL
    private boolean buscar(NodoArbolBinario nodo, int numero) {
        if (nodo != null) {
            if (nodo.getDato() == numero) {
                return true;
            }
            boolean ok1 = this.buscar(nodo.getHijoIzquierdo(), numero);
            boolean ok2 = this.buscar(nodo.getHijoDerecho(), numero);

            if (ok1 || ok2) {
                return true;
            }
        }

        return false;
    }

    public String buscar(int numero) {
        if (this.buscar(this.raiz, numero)) {
            return "Número " + numero + " Encontrado.";
        }
        return "Número " + numero + " No Encontrado.";
    }

    // CONTAR LOS NODOS DE UN ÁRBOL
    private int contar(NodoArbolBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        int c1 = this.contar(nodo.getHijoIzquierdo());
        int c2 = this.contar(nodo.getHijoDerecho());
        int c3 = c1 + c2 + 1;
        return c3;

    }

    public String contar() {
        int cantidad = this.contar(this.raiz);
        return "El árbol tiene " + cantidad + " nodos.";
    }

    // SUMAR LOS NODOS DE UN ÁRBOL
    private int sumar(NodoArbolBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        int c1 = this.sumar(nodo.getHijoIzquierdo());
        int c2 = this.sumar(nodo.getHijoDerecho());
        int c3 = c1 + c2 + nodo.getDato();
        return c3;

    }

    public String sumar() {
        int cantidad = this.sumar(this.raiz);
        return "La suma de los nodos del árbol es: " + cantidad;
    }

    // CALCULAR LA ALTURA DE UN ÁRBOL
    private int calcularAltura(NodoArbolBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        int h1 = this.calcularAltura(nodo.getHijoIzquierdo());
        int h2 = this.calcularAltura(nodo.getHijoDerecho());
        if (h1 > h2) {
            return h1 + 1;
        }
        return h2 + 1;
    }

    public String calcularAltura() {
        int altura = this.calcularAltura(this.raiz);
        return "La altura del árbol es: " + altura;
    }

    // BUSCAR EL NODO DE MAYOR VALOR
    private int buscarMayor(NodoArbolBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        int m1 = this.buscarMayor(nodo.getHijoIzquierdo());
        int m2 = this.buscarMayor(nodo.getHijoDerecho());
        int m3 = nodo.getDato();

        if (m1 >= m2 && m1 >= m3) {
            return m1;
        }
        if (m2 >= m1 && m2 >= m3) {
            return m2;
        }
        return m3;

    }

    public String buscarMayor() {
        int mayor = this.buscarMayor(this.raiz);
        return "El dato de mayor valor es: " + mayor;
    }

}
