public class Main {
    public static void main(String[] args) {

        EstruturaSimples petri = new EstruturaSimples(10);

//        petri.inserirElemento("MeuAmigãoVitão");
//        petri.inserirElemento("MeuAmigãoFelipão");
//        petri.inserirElemento("MeuAmigãoMatheuzão");
//        petri.inserirElementoIndice("MeuAmigãoLuizão", 6);
//        petri.quantidadeElementos();
//        petri.removerElemento("MeuAmigãoVitão");
//        petri.removerIndice(6);
//        petri.obterPrimeiroElemento();
//        petri.obterUltimoElemento();
//        petri.inserirSequencia(new Object[]{"MeuAmigaoEronzão", "MinhaAmigonaMarianazona"});
//        petri.buscarElemento("MinhaAmigonaMarianazona");
//        petri.buscarElementoIndice(9);
//        petri.removerSequencia(new Object[]{"MeuAmigaoEronzão", "MinhaAmigonaMarianazona"});
//        petri.limpar();
        petri.inserirElemento(2);
        petri.inserirElemento(1);
        petri.inserirElemento(5);
        petri.inserirElemento(4);
        petri.inserirElemento(3);
        petri.inserirElemento(6);
        petri.inserirElemento(9);
        petri.inserirElemento(8);
        petri.inserirElemento(7);
        petri.inserirElemento(10);

        petri.exibir();

        petri.ordenarCrescente();
        petri.exibir();
        petri.ordenarDecrescente();
        petri.exibir();

        petri.dobrarCapacidade();
        petri.inserirElemento(11);
        petri.inserirElemento(12);
        petri.inserirElemento(13);
        petri.inserirElemento(14);
        petri.inserirElemento(15);
        petri.inserirElemento(16);
        petri.inserirElemento(17);
        petri.ordenarCrescente();
        petri.exibir();
    }
}
