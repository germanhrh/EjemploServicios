package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static io.restassured.RestAssured.given;
import static test.enums.RequestClienteUnico.REQUEST_CREAR_CLIENTE;
import static test.enums.RequestCrearProducto.REQUEST_CREAR_PRODUCTO;

class CrearUsuarioClienteUnicoTest {


    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "http://middlewareuat.falabella.cl/";
    }

    public static Object[][] datosCliente() {
        return new Object[][]{
                //{"1", "1023372001", "3205276354", 8000000, "1"},

                //{"1", "8504701", "3017463878", 7000000, "1"},
                //{"1", "51993251", "3017463878", 8000000, "3"},
                //{"1", "8504631", "3017463878", 2000000, "3"}
                {"1", "8504631", "3017463878", 1000000, "3"}

        };
    }

    @ParameterizedTest
    @MethodSource("datosCliente")
    void asignarProducto(String tipoDocumento, String numerodocumento, String numCel, int monto, String productos) {
        String id;
        Response responseCliente = given().accept(ContentType.XML)
                .header("Accept-Encoding", "gzip, deflate, br")
                .body(String.format(REQUEST_CREAR_PRODUCTO.getRequest(), tipoDocumento, numerodocumento, numCel, monto, productos))
                .log().all(true)
                .post("bco/co/12c/bus/Cliente/SolicitudAdmision/Generar/v1.0")
                .then().log().all(true)
                .extract().response();
        id = responseCliente.xmlPath()
                .getString("Envelope.Body.clienteSolicitudAdmisionGenerarExpResp.solicitud.numeroSolicitud");

        Assertions.assertEquals(200, responseCliente.statusCode());

        Response responseClienteUnico = given().accept(ContentType.XML)
                .header("Accept-Encoding", "gzip, deflate, br")
                .body(String.format(REQUEST_CREAR_CLIENTE.getRequest(), id)).log().all(true)
                .post("bco/co/12c/bus/Cliente/InformacionGeneral/Generar/v1.0")
                .then().log().all(true)
                .extract().response();

        Assertions.assertEquals(200, responseClienteUnico.statusCode());
    }
}
