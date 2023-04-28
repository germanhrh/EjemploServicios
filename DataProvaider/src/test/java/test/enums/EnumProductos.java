package test.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public enum EnumProductos {

    TC_CC_CA("TC-CC-CA", "1,2,3"),
    TC_CC_PAC("TC-CC-PAC", "1,2,7"),
    TC_PAC_CA("TC-PAC-CA", "1,2,7"),
    TC_CA("TC-CA", "1,2"),
    TC("TC", "1"),
    CA("CA", "2"),
    CUENTA_CORRIENTE("CUENTA_CORRIENTE", "4"),
    TC_CC("TC-Credito de consumo", "1,3");

    EnumProductos(String productos, String identificador) {
        this.productos = productos;
        this.identificador = identificador;
    }

    private final String productos;
    private final String identificador;
    private static final Map<String, String> mapIdentificador = Collections
            .unmodifiableMap(initializeMapping());

    public static String getIdentificador(String productos) {
        if (mapIdentificador.containsKey(productos)) {
            return mapIdentificador.get(productos);
        }
        return null;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mapIdentificador = new HashMap<>();
        for (EnumProductos productos : EnumProductos.values()) {
            mapIdentificador.put(productos.identificador, productos.productos);
        }
        return mapIdentificador;
    }
}
