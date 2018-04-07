//package com.ew.e_comerce.visao;
//
//import com.ew.e_comerce.modelo.Produto;
//import java.util.ArrayList;
//import java.util.List;
//import com.ew.e_comerce.controle.ProdutoDao;
//import java.time.LocalDate;
//import java.util.Scanner;
//
///**
// * Essa classe contém métodos para o menu de texto, juntamente com os serviços oferecidos no menu;
// * @author Eríclys e Wanileton
// * @version 1.0
// */
//
//public class ProjetoEcommerceTeste {
//
//    static ProdutoDao prod = new ProdutoDao();
//    static Scanner input = new Scanner(System.in);
//    
//    /**
//     * menu de texto
//     * @param args 
//     */
//    
//    public static void main(String[] args) {
//        int opcao = -1;
//        
//        while (opcao != 0) {
//            System.out.println("______________OPÇÔES________________\n");   
//            System.out.println("Digite a opção desejada: ");
//            System.out.println("1(Cadastrar um Produto)  2(Alterar um produto)  3(Excluir um produto) 4(Imprimir todos os produtos) 0(Sair)");
//            
//            try {
//             String entrada = input.next();
//             opcao = Integer.parseInt(entrada);
//             
//            }catch(Exception e){
//                opcao=-1;
//                System.out.println("Entrada invalida digite novamente\n");
//            }
//
//            switch (opcao) {
//                case 1:
//                    cadastraProduto();
//                    System.out.println("----------------\n\n");
//                    break;
//                case 2:
//                    alteraProduto();
//                    System.out.println("-----------------\n\n");
//                    break;
//                case 3:
//                    removerProduto();
//                    System.out.println("------------------\n\n");
//                    break;
//                case 4:
//                    listarProdutos();
//                    System.out.println("-------------------\n\n");
//                    break;
//                case 0:
//                    System.out.println("Finalizado.\n\n");
//                    break;
//            }
//        }
//    }
//    
//     /**
//     * Método para salvar o produto
//     * @return 
//     */
//
//    private static Produto inserirProduto() {
//        Produto produto = new Produto();
//
//        System.out.println("Digite o id: ");
//        try{
//        produto.setId(Integer.parseInt(input.next()));
//        }catch(Exception e){
//            System.out.println("Entrada invalida tente novamente");
//            return null;
//        }
//        
//        input.nextLine();
//        System.out.println("Digite o nome: ");
//        produto.setNome(input.nextLine());
//
//        System.out.println("Digite o descrição: ");
//        produto.setDescricao(input.nextLine());
//        
//        System.out.println("Digite o slug: ");
//        produto.setSlug(input.nextLine());
//        
//        produto.setDtInclusao(LocalDate.now());
//      
//        produto.setDtUpdate(LocalDate.now());
//        
//        System.out.println("Digite a quatidade disponivel: ");
//        produto.setQuantEstoque(input.nextInt());
//        
//        System.out.println("Digite o preço da unidade: ");
//        produto.setPreco(input.nextFloat());
//        
//         System.out.println("Digite o codigo de barras do produto: ");
//        produto.setCodBarras(input.next());
//
//
//        return produto;
//    }
//    
//    /**
//     * Método para cadastrar o produto no sistema
//     */
//
//    private static void cadastraProduto() {
//        System.out.println("____________CADASTRAR PRODUTO_________");
//        Produto produto = inserirProduto();
//        if(produto!= null){
//        prod.salvarProduto(produto);
//    } else{
//            System.out.println("Falha no cadastro");
//        }
//    }
//    
//    /**
//     * Método para atualizar o produto
//     */
//    
//    private static void alteraProduto() {
//        System.out.println("____________ALTERA PRODUTO_________");
//        System.out.println("Adicione um produto com o mesmo id de um já existente para que o mesmo seja auterado: ");
//        
//        if(prod.alterarProduto(inserirProduto())==false){
//            System.out.println("Produto não encontrado");
//        }
//    }
//    
//    /**
//     * Método para deletar produto da lista
//     */
//
//    private static void removerProduto() {
//        System.out.println("____________REMOVER PRODUTO_________");
//        System.out.println("Digite o id do Produto a ser removido: ");
//        
//        try{
//        int a = Integer.parseInt(input.next());
//        prod.deletarProduto(a);
//        } catch(NumberFormatException e){
//            System.out.println("entrava invaila tente novamente");
//        } catch ( Exception e){
//            System.out.println("produto removido com sucesso");
//        }
//    }
//    
//    /**
//     * Método para listar produtos para o usuario
//     */
//
//    public static void listarProdutos() {
//        List<Produto> lista = new ArrayList<>();
//        lista = prod.listarProduto();
//
//        if (lista.size() == 0) {
//            System.out.println("Nenhum produto cadastrado");
//        } else {
//            int a = 0;
//            for (Produto produto : lista) {
//                a++;
//                System.out.println("Produto " + a);
//                System.out.println(produto);
//            }
//        }
//    }
//
//}
