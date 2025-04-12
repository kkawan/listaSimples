public interface IEstruturaSimples {

    void inserirElemento(Object elemento);
    void inserirElementoIndice(Object elemento, int indice);
    void inserirSequencia(Object[] elementos);
    boolean removerElemento(Object elemento);
    Object removerIndice(int indice);
    void removerSequencia(Object[] elementos);
    void removerTodasOcorrencias(Object elemento);
    boolean estaCheia();
    boolean estaVazia();
    boolean buscarElemento(Object elemento);
    Object buscarElementoIndice(int indice);
    void ordenarCrescente();
    void ordenarDecrescente();
    int quantidadeElementos();
    void dobrarCapacidade();
    void editarElemento(Object elementoAntigo, Object elementoNovo);
    void limpar();
    void exibir();
    Object obterPrimeiroElemento();
    Object obterUltimoElemento();
}
