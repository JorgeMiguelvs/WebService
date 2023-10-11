
package exemplo;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {
 private ProdutoService produtoService = new 
ProdutoService();
 
// Método para obter todos os produtos
 @GET
 public List<Produto> getProdutos() {
 return produtoService.getProdutos();
 }
 // Método para adicionar um produto
 @POST
 public Produto adicionarProduto(Produto produto) {
 return produtoService.adicionarProduto(produto);
 }
 
 // Método para atualizar um produto
 @PUT
 public Produto atualizarProduto(Produto produto) {
 return produtoService.atualizarProduto(produto);
 }
 // Método para excluir um produto com base no ID
 @DELETE
 @Path("/{produtoId}")
 public void excluirProduto(@PathParam("produtoId") int id) {
 produtoService.excluirProduto(id);
 }
}
