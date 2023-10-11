package exemplo;

import java.util.ArrayList;
import java.util.List;
public class ProdutoService {
 private static List<Produto> produtos = new ArrayList<>();
 // Método para adicionar um produto
 public Produto adicionarProduto(Produto produto) {
 produto.setId(produtos.size() + 1);
 produtos.add(produto);
 System.out.println("Produto adicionado: " + produto);
 return produto;
 }
// Método para recuperar todos os produtos
 public List<Produto> getProdutos() {
 return produtos;
 }
 // Método para atualizar um produto
 public Produto atualizarProduto(Produto produto) {
 int index = produtos.indexOf(produto);
 if (index != -1) {
 produtos.set(index, produto);
 System.out.println("Produto atualizado: " + 
produto);
 return produto;
 }

 System.out.println("Produto não encontrado.");
 return null;
 }
 // Método para excluir um produto
 public void excluirProduto(int id) {
 produtos.removeIf(p -> p.getId() == id);
 System.out.println("Produto excluído com ID: " + id);
 }
}
