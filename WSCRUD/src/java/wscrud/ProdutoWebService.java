/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wscrud;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
@WebService(serviceName = "ProdutoWebService")
public class ProdutoWebService {
 private List<Produto> produtos = new ArrayList<>();
 @WebMethod(operationName = "adicionarProduto")
 public void adicionarProduto(@WebParam(name = "produto") Produto produto) {
 produtos.add(produto);
 }
 @WebMethod(operationName = "consultarProduto")
 public Produto consultarProduto(@WebParam(name = "id") int id) {
 for (Produto produto : produtos) {
 if (produto.getId() == id) {
 return produto;
 }
 }
 return null;
 }
 @WebMethod(operationName = "atualizarProduto")
 public void atualizarProduto(@WebParam(name = "produto") Produto produto) {
 for (int i = 0; i < produtos.size(); i++) {
 if (produtos.get(i).getId() == produto.getId()) {
 produtos.set(i, produto);
 break;
 }
 }
 }
 @WebMethod(operationName = "excluirProduto")
 public void excluirProduto(@WebParam(name = "id") int id) {
 produtos.removeIf(produto -> produto.getId() == id);
 }
}
