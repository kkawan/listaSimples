public class EstruturaSimples implements IEstruturaSimples{

    private Object[] lista;
    private Integer tamanho;

    public EstruturaSimples(int tamanho) {
        this.lista = new Object[tamanho];
        this.tamanho = tamanho;
    }

    @Override
    public void inserirElemento(Object elemento) {
        if(estaCheia()){
            System.out.println("A lista está cheia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (lista[i] == null){
                    lista[i] = elemento;
                    break;
                }
            }
        }
    }

    @Override
    public void inserirElementoIndice(Object elemento, int indice) {
        if(estaCheia()){
            System.out.println("A lista está cheia");
        } else {
            if (lista[indice] == null){
                lista[indice] = elemento;
            }
            else {
                System.out.println("O indice já ocupado");
            }
        }
    }

    @Override
    public void inserirSequencia(Object[] elementos) {
        for(Object elemento : elementos){
            inserirElemento(elemento);
        }

//        for(int i = 0; i<elementos.length; i++){
//            inserirElemento(elementos[i]);
//        } // pedir explicação petri


    }

    // achei estranho não possuir parametros, pq sem paramentros ele so vai remover o primeiro que ele achar na inspeção da lista
    @Override
    public boolean removerElemento(Object elemento) {
        if (estaVazia()){
            System.out.println("A lista não possui elementos para serem removidos");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if(lista[i] == elemento){
                    lista[i] = null;
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public Object removerIndice(int indice) {
        if (estaVazia()){
            System.out.println("A lista não possui elementos para serem removidos");
        }
        else {
            if (lista[indice] != null){
                lista[indice] = null;
            } else {
                System.out.println("Este indice já está vazio");
            }
        }
        return null;
    }

    @Override
    public void removerSequencia(Object [] elementos) {
        for(Object elemento : elementos){
            removerElemento(elemento);
        }
    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
    for (int i = 0; i < tamanho; i++){
        if (lista[i] == elemento){
            lista[i] = null;
        }
    }
    }

    @Override
    public boolean estaCheia() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean estaVazia() {
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean buscarElemento(Object elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento){
                System.out.println("Elemento " + elemento + " encontrado na lista");
                return true;
            }
        }
        System.out.println("Elemento " + elemento + " não encontrado na lista");
        return false;
    }

    @Override
    public Object buscarElementoIndice(int indice) {
        if (lista[indice] == null){
            System.out.println("Esse indice está vazio");
        }
        else {
            System.out.println("Este indice contém " + lista[indice]);
        }
        return null;
    }

    @Override
    public void ordenarCrescente() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (lista[j] != null && lista[j + 1] != null) {
                    if ((Integer) lista[j] > (Integer) lista[j + 1]) {
                        Object aux = lista[j];
                        lista[j] = lista[j + 1];
                        lista[j + 1] = aux;
                    }
                }
            }
        }
    }

    @Override
    public void ordenarDecrescente() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (lista[j] != null && lista[j + 1] != null) {
                    if ((Integer) lista[j] < (Integer) lista[j + 1]) {
                        Object aux = lista[j];
                        lista[j] = lista[j + 1];
                        lista[j + 1] = aux;
                    }
                }
            }
        }
    }

    @Override
    public int quantidadeElementos() {
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] != null) {
                contador++;
            }
        }
        System.out.println("A lista possui " + contador + " elementos não nulos");
        return 0;

    }

    @Override
    public void dobrarCapacidade() {
        Object [] listaDobrada = new Object [lista.length * 2];

        for (int i = 0; i < lista.length; i++){
            listaDobrada[i] = lista[i];
        }

        lista = listaDobrada;

        tamanho = listaDobrada.length;
    }

    @Override
    public void editarElemento(Object elementoAntigo, Object elementoNovo) {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] != null) {
                if (lista[i] == elementoAntigo){
                    lista[i] = elementoNovo;
                }
            }
        }
    }

    @Override
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            lista[i] = null;
        }
    }

    @Override
    public void exibir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    @Override
    public Object obterPrimeiroElemento() {
        for (int i = 0; i < tamanho; i++) {
            if(lista[i] != null){
                System.out.println("O primeiro elemento não nulo da lista é " + lista[i]);
                break;
            }
        }
        return null;
    }
    // fazer um metodo obter primeiro nulo

    @Override
    public Object obterUltimoElemento() {
        for (int i = tamanho-1; i >=0; i--) {
            if(lista[i] != null){
                System.out.println("O último elemento não nulo da lista é " + lista[i]);
                break;
            }
        }
        return null;
    }
    //teste de mesa
}
