
package Conexion;

public class TokenManager {
    private Token head;
    private Token current;
    private int maxConsultas;
    private int contadorConsultas;

    public TokenManager(int maxConsultas) {
        this.maxConsultas = maxConsultas;
        this.contadorConsultas = 0;
        this.head = null;
        this.current = null;
    }

    // Método para agregar un token a la lista
    public void agregarToken(String tokenValue) {
        Token newToken = new Token(tokenValue);
        if (head == null) {
            head = newToken;
            head.next = head; // Circular
            current = head;
        } else {
            Token temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newToken;
            newToken.next = head;
        }
    }

    // Método para obtener el token actual
    public String getTokenActual() {
        return current.value;
    }

    // Método para incrementar el contador y cambiar el token si es necesario
    public void incrementarContador() {
        contadorConsultas++;
        if (contadorConsultas >= maxConsultas) {
            cambiarToken();
            contadorConsultas = 0;
        }
    }

    // Método para cambiar al siguiente token
    private void cambiarToken() {
        if (current != null) {
            current = current.next;
        }
    }

    // Clase interna para representar un nodo en la lista
    private static class Token {
        String value;
        Token next;

        public Token(String value) {
            this.value = value;
            this.next = null;
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        TokenManager tokenManager = new TokenManager(100); // Cambiar token cada 100 consultas
        tokenManager.agregarToken("token1");
        tokenManager.agregarToken("token2");
        tokenManager.agregarToken("token3");

        for (int i = 0; i < 570; i++) {
            System.out.println("Consulta " + (i + 1) + ": " + tokenManager.getTokenActual());
            tokenManager.incrementarContador();
        }
    }
}