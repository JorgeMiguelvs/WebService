/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Define o nome do pacote ao qual esta classe pertence
package webserviceautenticacao;

// Importa as anotações necessárias para definir um Web Service
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

// Define que esta classe é um Web Service
@WebService
// Define que esta classe é um bean de sessão sem estado
@Stateless
// Especifica que apenas usuários com a função "user" têm permissão para acessar métodos nesta classe
@RolesAllowed("user")
public class WebServiceExample {
// Define que este método será exposto como uma operação do Web Service
    @WebMethod
    // Define a assinatura do método que será acessado remotamente
    public String autenticar(String usuario, String senha) {
// Lógica de autenticação
        // Verifica se as credenciais correspondem a um usuário válido
        if ("usuario".equals(usuario) && "senha123".equals(senha)) {
            // Se as credenciais são válidas, retorna "Acesso liberado"
            return "Acesso liberado";
        } else {
            // Se as credenciais não são válidas, retorna "Acesso negado"
            return "Acesso negado";
        }
    }
}

    
