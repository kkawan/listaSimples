import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista: ");
        int tamanho = scanner.nextInt();
        EstruturaSimples petri = new EstruturaSimples(tamanho);

        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Inserir elemento em índice");
            System.out.println("3. Inserir sequência de elementos");
            System.out.println("4. Remover elemento");
            System.out.println("5. Remover pelo índice");
            System.out.println("6. Remover sequência");
            System.out.println("7. Remover todas ocorrências");
            System.out.println("8. Buscar elemento");
            System.out.println("9. Buscar por índice");
            System.out.println("10. Ordenar crescente");
            System.out.println("11. Ordenar decrescente");
            System.out.println("12. Quantidade de elementos");
            System.out.println("13. Dobrar capacidade");
            System.out.println("14. Editar elemento");
            System.out.println("15. Limpar lista");
            System.out.println("16. Exibir lista");
            System.out.println("17. Obter primeiro elemento");
            System.out.println("18. Obter último elemento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("O que você deseja inserir?");
                    petri.inserirElemento(scanner.nextLine());
                    break; // check

                case 2:
                    System.out.print("Digite o elemento: ");
                    Object elemento = scanner.nextLine();
                    System.out.print("Digite o índice: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    petri.inserirElementoIndice(elemento, indice);
                    break; //check

                case 3:
                    System.out.print("Quantos elementos deseja inserir? ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    Object[] sequencia = new Object[qtd];
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        sequencia[i] = scanner.nextLine();
                    }
                    petri.inserirSequencia(sequencia);
                    break; // check

                case 4:
                    System.out.print("Digite o elemento para remover: ");
                    petri.removerElemento(scanner.nextLine());
                    break; // check (precisa utilizar .equals invés de ==, para comparar o contéudo e não a referência)

                case 5:
                    System.out.print("Digite o índice para remover: ");
                    petri.removerIndice(scanner.nextInt());
                    scanner.nextLine();
                    break; //check

                case 6:
                     System.out.print("Quantos elementos deseja remover? ");
                     int qtdRemover = scanner.nextInt();
                    scanner.nextLine();
                    Object[] seqRemover = new Object[qtdRemover];
                    for (int i = 0; i < qtdRemover; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        seqRemover[i] = scanner.nextLine();
                    }
                    petri.removerSequencia(seqRemover);
                    break; // check (foi necessario colocar uma proteção contra null no metodo removerElemento() )

                case 7:
                    System.out.print("Digite o elemento para remover todas as vezes que ele aparece: ");
                    petri.removerTodasOcorrencias(scanner.nextLine());
                    break; // check (precisava de um and != null para nao dar nullpointerexeption)
                case 8:
                    System.out.print("Digite o elemento para buscar: ");
                    petri.buscarElemento(scanner.nextLine());
                    break; // check
                case 9:
                    System.out.print("Digite o índice para buscar: ");
                    petri.buscarElementoIndice(scanner.nextInt());
                    scanner.nextLine();
                    break; //check
                case 10:
                    petri.ordenarCrescente();
                    System.out.println("Lista ordenada em ordem crescente.");
                    break; // bug
                case 11:
                    petri.ordenarDecrescente();
                    System.out.println("Lista ordenada em ordem decrescente.");
                    break; //bug
                case 12:
                    petri.quantidadeElementos();
                    break; // check
                case 13:
                    petri.dobrarCapacidade();
                    System.out.println("Capacidade da lista dobrada.");
                    break; // check
                case 14:
                    System.out.print("Digite o elemento antigo: ");
                    Object antigo = scanner.nextLine();
                    System.out.print("Digite o novo elemento: ");
                    Object novo = scanner.nextLine();
                    petri.editarElemento(antigo, novo);
                    break; // check
                case 15:
                    petri.limpar();
                    System.out.println("Lista limpa.");
                    break; // check
                case 16:
                    petri.exibir();
                    break; // check
                case 17:
                    petri.obterPrimeiroElemento();
                    break; //check
                case 18:
                    petri.obterUltimoElemento();
                    break; // check
                case 0:
                    System.out.println("Saindo...");
                    break; //check
                default:
                    System.out.println("Opção inválida!"); // check
            }
        } while (opcao != 0);

//        *Todos os metodos funcionando sem problemas, sem a implementação no menu*
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
//        petri.inserirElemento(2);
//        petri.inserirElemento(1);
//        petri.inserirElemento(5);
//        petri.inserirElemento(4);
//        petri.inserirElemento(3);
//        petri.inserirElemento(6);
//        petri.inserirElemento(9);
//        petri.inserirElemento(8);
//        petri.inserirElemento(7);
//        petri.inserirElemento(10);
//
//        petri.exibir();
//
//        petri.ordenarCrescente();
//        petri.exibir();
//        petri.ordenarDecrescente();
//        petri.exibir();
//
//        petri.dobrarCapacidade();
//        petri.inserirElemento(11);
//        petri.inserirElemento(12);
//        petri.inserirElemento(13);
//        petri.inserirElemento(14);
//        petri.inserirElemento(15);
//        petri.inserirElemento(16);
//        petri.inserirElemento(17);
//        petri.inserirElemento(18);
//        petri.ordenarCrescente();
//        petri.editarElemento(1, 18);
//        petri.removerTodasOcorrencias(18);
//        petri.exibir();
    }
}
