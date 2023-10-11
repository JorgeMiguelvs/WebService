import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class SimpleWebService {
    public static void main(String[] args) throws Exception {
        // Crie um servidor HTTP na porta 8080
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);

        // Crie um contexto para lidar com as solicitações no caminho /soma
        server.createContext("/soma", new SomaHandler());

        // Inicie o servidor
        server.start();
        System.out.println("Servidor em execução na porta 8080...");
    }

    static class SomaHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                // Obtenha os parâmetros da solicitação
                String query = exchange.getRequestURI().getQuery();
                String[] params = query.split("&");
                int num1 = 0;
                int num2 = 0;
for (String param : params) {
                    String[] keyValue = param.split("=");
                    if (keyValue.length == 2) {
                        if ("num1".equals(keyValue[0])) {
                            num1 = Integer.parseInt(keyValue[1]);
                        } else if ("num2".equals(keyValue[0])) {
                            num2 = Integer.parseInt(keyValue[1]);
                        }
                    }
                }

                // Calcule a soma
                int resultado = num1 + num2;

                // Escreva a resposta
                String response = "A soma de " + num1 + " e " + num2 + " é igual a " + resultado;
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                // Método HTTP não suportado
                exchange.sendResponseHeaders(405, 0);
                exchange.close();
            }
        }
    }
}