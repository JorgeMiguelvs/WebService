package exemplo;

public class Produto {
private int id;
private String nome;
// Construtor vazio
public Produto() {
}
// Construtor com parâmetros
 public Produto(int id, String nome) {
 this.id = id;
 this.nome = nome;
 }
 // Método getter para o campo id
 public int getId() {
 return id;
 }
// Método setter para o campo id
 public void setId(int id) {
 this.id = id;
 }
 // Método getter para o campo nome
 public String getNome() {
 return nome;
 }
 // Método setter para o campo nome
 public void setNome(String nome) {
 this.nome = nome; }
 // Sobrescrevendo o método toString para facilitar a exibição
 @Override
 public String toString() {
 return "Produto{" +
 "id=" + id +
 ", nome='" + nome + '\'' +
 '}';
 }
}
