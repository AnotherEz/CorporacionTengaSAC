package Conexion;

import Clases.Cliente;
import Clases.Empresa;
import static Clases.Usuario.NombresSeparados;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultasApiReniec {
    private static String TokenApi="c7a9d544149df08bbb59706f2057dd3b5efac6ffa7f58c6401e8e9a08b004b77";
    public static void consultarRUC(String ruc, Empresa empresa) throws IOException, InterruptedException {
        // Configurar los parámetros
        String jsonParams = String.format("{\"ruc\": \"%s\"}", ruc);

        // Crear el cliente HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Crear la solicitud HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://apiperu.dev/api/ruc"))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + TokenApi)
                .POST(HttpRequest.BodyPublishers.ofString(jsonParams))
                .build();

        // Enviar la solicitud y manejar la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Verificar el estado de la respuesta
        if (response.statusCode() != 200) {
            throw new IOException("Error en la solicitud: " + response.statusCode());
        }

        // Parsear la respuesta JSON
        ObjectMapper mapper = new ObjectMapper();
        JsonNode responseBody = mapper.readTree(response.body());

        if (responseBody.get("success").asBoolean()) {
            JsonNode data = responseBody.get("data");

            // Mapear los datos a la instancia de Empresa
            empresa.setRuc(data.get("ruc").asText());
            empresa.setNombre(data.get("nombre_o_razon_social").asText());
            empresa.setEstado(data.get("estado").asText());
            empresa.setCondicion(data.get("condicion").asText());
            empresa.setDireccion(data.get("direccion").asText());
            empresa.setDireccionCompleta(data.get("direccion_completa").asText());
            empresa.setDepartamento(data.get("departamento").asText());
            empresa.setProvincia(data.get("provincia").asText());
            empresa.setDistrito(data.get("distrito").asText());
            empresa.setUbigeoSunat(data.get("ubigeo_sunat").asText());
            empresa.setUbigeo(mapper.convertValue(data.get("ubigeo"), String[].class));
            empresa.setEsAgenteDeRetencion(data.has("es_agente_de_retencion") ? data.get("es_agente_de_retencion").asBoolean() : null);
            empresa.setEsBuenContribuyente(data.has("es_buen_contribuyente") ? data.get("es_buen_contribuyente").asBoolean() : null);
        } else {
            throw new IOException("La consulta del RUC no tuvo éxito");
        }
    }
     public static void consultarDni(String dni, Cliente cliente) throws IOException, InterruptedException {
         String VarTemp;
         String[] Nombre;
         cliente.setDNI(dni);
      
    // Configurar los parámetros
    String jsonParams = String.format("{\"dni\": \"%s\"}", dni);

    // Crear el cliente HttpClient
    HttpClient client = HttpClient.newHttpClient();

    // Crear la solicitud HttpRequest
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://apiperu.dev/api/dni"))
            .header("Accept", "application/json")
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + TokenApi)
            .POST(HttpRequest.BodyPublishers.ofString(jsonParams))
            .build();

    // Enviar la solicitud y manejar la respuesta
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // Verificar el estado de la respuesta
    if (response.statusCode() != 200) {
        throw new IOException("Error en la solicitud: " + response.statusCode());
    }

    // Parsear la respuesta JSON
    ObjectMapper mapper = new ObjectMapper();
    JsonNode responseBody = mapper.readTree(response.body());

    if (responseBody.get("success").asBoolean()) {
        JsonNode data = responseBody.get("data");
        VarTemp=data.get("nombres").asText();
        Nombre=NombresSeparados(VarTemp);
        cliente.setFirstName(Nombre[0]);
        cliente.setSecondName(Nombre[1]);
        cliente.setFirstLastName(data.get("apellido_paterno").asText());
        cliente.setSecondLastName(data.get("apellido_materno").asText());
        cliente.setCodigoVerificacion(data.get("codigo_verificacion").asInt());  
    } else {
        throw new IOException("La consulta del DNI no tuvo éxito");
    }
     }
    
}
