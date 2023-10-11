package exemplo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProdutoResource produtoResource = new ProdutoResource();
        // Adicionar produto
        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");
        produtoResource.adicionarProduto(produto1);
        // Obter todos os produtos
        List<Produto> produtos = produtoResource.getProdutos();
        System.out.println("Produtos: " + produtos);
        // Atualizar produto
        produto1.setNome("Produto 1 Atualizado");
        produtoResource.atualizarProduto(produto1);

        // Obter todos os produtos após a atualização
        produtos = produtoResource.getProdutos();
        System.out.println("Produtos após atualização: " + produtos);
        // Excluir produto
        produtoResource.excluirProduto(produto1.getId());
        // Obter todos os produtos após a exclusão
        produtos = produtoResource.getProdutos();
        System.out.println("Produtos após exclusão: " + produtos);
    }

}
