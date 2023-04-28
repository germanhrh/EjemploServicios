package test.enums;

public enum RequestClienteUnico {

    REQUEST_CREAR_CLIENTE("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cli=\"http://mdwcorp.falabella.com/common/schema/clientserviceFIF\" xmlns:cli1=\"http://mdwcorp.falabella.com/common/schema/clientservice\" xmlns:req=\"http://mdwcorp.falabella.com/FIF/CORP/OSB/schema/Cliente/InformacionGeneral/Generar/Req-v2017.05\">\n" +
            "   <soapenv:Header>\n" +
            "      <cli1:ClientService>\n" +
            "         <cli1:country>CO</cli1:country>\n" +
            "         <cli1:commerce>Banco</cli1:commerce>\n" +
            "         <cli1:channel>Web</cli1:channel>\n" +
            "      </cli1:ClientService>\n" +
            "      <cli:ClientServiceFIF/>\n" +
            "   </soapenv:Header>\n" +
            "   <soapenv:Body>\n" +
            "      <req:clienteInformacionGeneralGenerarExpReq>\n" +
            "         <atributoFlexible>\n" +
            "            <nombreAtributo>IdAdmision</nombreAtributo>\n" +
            "            <valorAtributo>%s</valorAtributo>\n" +
            "         </atributoFlexible>\n" +
            "      </req:clienteInformacionGeneralGenerarExpReq>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>");


    private final String request;

    RequestClienteUnico(String request) {
        this.request = request;
    }
    public String getRequest() {
        return request;
    }
}
