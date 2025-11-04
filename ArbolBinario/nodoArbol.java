 public class nodoArbol {
    //1 . visitar raiz
    //2 . recorrer subarbol izquierdo
    //3 . recorrer subarbol derecho
    private nodoArbol hijo_izquierdo;
    private nodoArbol hijo_derecho;
    private int valor;

    public nodoArbol(int valor) {
        this.valor = valor;
        this.hijo_izquierdo = null;
        this.hijo_derecho = null;
    
    }
    //getters

    public int getValor() {
        return valor;
    }
    public nodoArbol getHijoIzquierdo() {
        return hijo_izquierdo;
    }
    public nodoArbol getHijoDerecho() {
        return hijo_derecho;
    }

    //setters
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void setHijoIzquierdo(nodoArbol hijo_izquierdo) {//asigna un nodo al hijo izquierdo
        this.hijo_izquierdo = hijo_izquierdo;
    }
    public void setHijoDerecho(nodoArbol hijo_derecho) {//asigna un nodo al hijo derecho
        this.hijo_derecho = hijo_derecho;
    }

}

 class ArbolBinario {
    private nodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public nodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(nodoArbol raiz) {
        this.raiz = raiz;
    }

   
    
    public void recorridoPreorden () {
        System.out.println("Recorrido en Preorden: ");
        recorrido(raiz);// llama al metodo recursivo recorrido pasandole la raiz como punto de inicio
    }
     private void recorrido(nodoArbol nodo) {
        if (nodo == null) {
            return; 
        }
        System.out.println(nodo.getValor());// visita el nodo actual
        recorrido(nodo.getHijoIzquierdo());// recorre el subarbol izquierdo
        recorrido(nodo.getHijoDerecho());// recorre el subarbol derecho
        //se detiene cuando encuentra un nodo nulo
    }
    
    public void insertar(int valor) {// recibe el nuevo valor y llama al  metodo recursivo insertarValor
        raiz = insertarValor(raiz, valor);// raiz es el punto de partida
    }
    public nodoArbol insertarValor(nodoArbol nodo, int valor) {
        if (nodo == null) {// cuando encuetra un espacio vacio crea un nuevo nodo y lo enlaza al padre
            return new nodoArbol(valor);
        }
    //decide si insertar a la izquierda o derecha
        if (valor < nodo.getValor()) {
            nodo.setHijoIzquierdo(insertarValor(nodo.getHijoIzquierdo(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setHijoDerecho(insertarValor(nodo.getHijoDerecho(), valor));
        }
        return nodo;
    }
 
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(9);
        arbol.insertar(42);
        arbol.insertar(10);
        arbol.insertar(18);
        arbol.insertar(34);
        arbol.insertar(49);
        arbol.insertar(33);
        arbol.insertar(21);

      arbol.recorridoPreorden();
    }
}