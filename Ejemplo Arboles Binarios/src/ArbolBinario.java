/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class ArbolBinario<E> {

    private NodoArbolBinario<E> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArbolBinario(NodoArbolBinario<E> raiz) {
        this.raiz = raiz;
    }

    public NodoArbolBinario<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolBinario<E> raiz) {
        this.raiz = raiz;
    }

    // RECORRIDO PREORDEN DE UN ÁRBOL
    private String preorden(NodoArbolBinario<E> nodo, String s) {
        if (nodo != null) {
            s += " " + nodo.getElemento();
            s = this.preorden(nodo.getHijoIzquierdo(), s);
            s = this.preorden(nodo.getHijoDerecho(), s);
        }
        return s;

    }

    public String preorden() {
        return "RECORRIDO PREORDEN: " + this.preorden(this.raiz, "");
    }

    // RECORRIDO POSTORDEN DE UN ÁRBOL
    private String postorden(NodoArbolBinario<E> nodo, String s) {
        if (nodo != null) {
            s = this.postorden(nodo.getHijoIzquierdo(), s);
            s = this.postorden(nodo.getHijoDerecho(), s);
            s += " " + nodo.getElemento();
        }
        return s;

    }

    public String postorden() {
        return "RECORRIDO POSTORDEN: " + this.postorden(this.raiz, "");
    }

    // RECORRIDO INORDEN DE UN ÁRBOL
    private String inorden(NodoArbolBinario<E> nodo, String s) {
        if (nodo != null) {
            s = this.inorden(nodo.getHijoIzquierdo(), s);
            s += " " + nodo.getElemento();
            s = this.inorden(nodo.getHijoDerecho(), s);

        }
        return s;

    }

    public String inorden() {
        return "RECORRIDO INORDEN: " + this.inorden(this.raiz, "");
    }

    // BUSCAR EL NODO DE UN ÁRBOL
    private Boolean buscar(NodoArbolBinario<E> nodo, E elemento) {
        if (nodo != null) {
            if (nodo.getElemento().equals(elemento)) {
                return true;
            }
            Boolean ok1 = this.buscar(nodo.getHijoIzquierdo(), elemento);
            Boolean ok2 = this.buscar(nodo.getHijoDerecho(), elemento);

            if (ok1 || ok2) {
                return true;
            }
        }

        return false;
    }

    public String buscar(E elemento) {
        if (this.buscar(this.raiz, elemento)) {
            return "Elemento " + elemento + " Encontrado.";
        }
        return "Elemento " + elemento + " No Encontrado.";
    }

    // CONTAR LOS NODOS DE UN ÁRBOL
    private Integer contar(NodoArbolBinario<E> nodo) {
        if (nodo == null) {
            return 0;
        }
        Integer c1 = this.contar(nodo.getHijoIzquierdo());
        Integer c2 = this.contar(nodo.getHijoDerecho());
        Integer c3 = c1 + c2 + 1;
        return c3;

    }

    public String contar() {
        Integer cantidad = this.contar(this.raiz);
        return "El árbol tiene " + cantidad + " nodos.";
    }

    // SUMAR LOS NODOS DE UN ÁRBOL
    private Integer sumar(NodoArbolBinario<E> nodo) {
        if (nodo == null) {
            return 0;
        }
        Integer c1 = this.sumar(nodo.getHijoIzquierdo());
        Integer c2 = this.sumar(nodo.getHijoDerecho());
        Integer e = (Integer) nodo.getElemento();
        Integer c3 = c1 + c2 + e;
        return c3;

    }

    public String sumar() {
        Integer cantidad = this.sumar(this.raiz);
        return "La suma de los nodos del árbol es: " + cantidad;
    }

    // CALCULAR LA ALTURA DE UN ÁRBOL
    private Integer calcularAltura(NodoArbolBinario<E> nodo) {
        if (nodo == null) {
            return 0;
        }
        Integer h1 = this.calcularAltura(nodo.getHijoIzquierdo());
        Integer h2 = this.calcularAltura(nodo.getHijoDerecho());
        if (h1 > h2) {
            return h1 + 1;
        }
        return h2 + 1;
    }

    public String calcularAltura() {
        Integer altura = this.calcularAltura(this.raiz);
        return "La altura del árbol es: " + altura;
    }

    // BUSCAR EL NODO DE MAYOR VALOR
    private Integer buscarMayor(NodoArbolBinario<E> nodo) {
        if (nodo == null) {
            return 0;
        }
        Integer m1 = this.buscarMayor(nodo.getHijoIzquierdo());
        Integer m2 = this.buscarMayor(nodo.getHijoDerecho());
        Integer e = (Integer) nodo.getElemento();
        Integer m3 = e;

        if (m1 >= m2 && m1 >= m3) {
            return m1;
        }
        if (m2 >= m1 && m2 >= m3) {
            return m2;
        }
        return m3;

    }

    public String buscarMayor() {
        Integer mayor = this.buscarMayor(this.raiz);
        return "El Elemento de mayor valor es: " + mayor;
    }
}
