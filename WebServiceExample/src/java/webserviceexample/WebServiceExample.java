/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceexample;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebServiceExample {

    @WebMethod
    public String autenticar(String usuario, String senha) {
        // Lógica de autenticação
        if ("usuario".equals(usuario) && "senha123".equals(senha)) {
            // Se as credenciais são válidas, exibe "Acesso liberado" no console
            System.out.println("Acesso liberado para o usuário: " + usuario);
            return "Acesso liberado";
} else {
            // Se as credenciais não são válidas, exibe "Acesso negado" no console
            System.out.println("Acesso negado para o usuário: " + usuario);
            return "Acesso negado";
        }
    }
}

