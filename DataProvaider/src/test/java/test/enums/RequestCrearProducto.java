package test.enums;

public enum RequestCrearProducto {

    REQUEST_CREAR_PRODUCTO("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "   <soap:Header>\n" +
            "      <ns1:ClientService xmlns:ns1=\"http://mdwcorp.falabella.com/common/schema/clientservice\">\n" +
            "         <ns1:country>CO</ns1:country>\n" +
            "         <ns1:commerce>Banco</ns1:commerce>\n" +
            "         <ns1:channel>Web</ns1:channel>\n" +
            "         <ns1:storeId>76</ns1:storeId>\n" +
            "      </ns1:ClientService>\n" +
            "      <ns1:ClientServiceFIF xmlns:ns1=\"http://mdwcorp.falabella.com/common/schema/clientserviceFIF\">\n" +
            "         <ns1:usuario>1</ns1:usuario>\n" +
            "         <ns1:sesion>fb5b2e48-6634-bdf4-880drreddd6b44DD4aab5-f44056</ns1:sesion>\n" +
            "      </ns1:ClientServiceFIF>\n" +
            "   </soap:Header>\n" +
            "   <soap:Body>\n" +
            "      <ns1:clienteSolicitudAdmisionGenerarExpReq xmlns:ns1=\"http://mdwcorp.falabella.com/FIF/CORP/OSB/schema/Cliente/SolicitudAdmision/Generar/Req-v2017.12\">\n" +
            "         <cliente>\n" +
            "            <apellidoMaterno>Carrillo</apellidoMaterno>\n" +
            "            <apellidoPaterno>Moreno</apellidoPaterno>\n" +
            "            <estado>6</estado>\n" +
            "            <fechaNacimiento>1980-09-08</fechaNacimiento>\n" +
            "            <genero>2</genero>\n" +
            "            <nacionalidad>2</nacionalidad>\n" +
            "            <nombres>Jesus</nombres>\n" +
            "            <tipoPersona>1</tipoPersona>\n" +
            "            <documentoIdentidad>\n" +
            "               <tipoDocumento>%s</tipoDocumento>\n" +
            "               <numeroDocumento>%s</numeroDocumento>\n" +
            "               <fechaExpedicion>1999-02-02</fechaExpedicion>\n" +
            "            </documentoIdentidad>\n" +
            "            <primerNombre>Jesus</primerNombre>\n" +
            "            <segundoNombre>Maria</segundoNombre>\n" +
            "            <estadoCivil>1</estadoCivil>\n" +
            "            <lugarNacimiento>50001</lugarNacimiento>\n" +
            "            <departamentoNacimiento>50000</departamentoNacimiento>\n" +
            "            <empleadoFalabella>0</empleadoFalabella>\n" +
            "            <informacionContacto>\n" +
            "               <telefono>\n" +
            "                  <codigoArea>3</codigoArea>\n" +
            "                  <numeroTelefono>%s</numeroTelefono>\n" +
            "                  <tipoTelefono>3</tipoTelefono>\n" +
            "               </telefono>\n" +
            "               <direccion>\n" +
            "                  <codigoCiudad>11001</codigoCiudad>\n" +
            "                  <codigoRegion>25000</codigoRegion>\n" +
            "                  <direccionCompleta>calle 15 numero 10-39, Bogotá, Cundinamarca, Colombia</direccionCompleta>\n" +
            "                  <estrato>0</estrato>\n" +
            "               </direccion>\n" +
            "               <correoElectronico>\n" +
            "                  <direccionCorreoElectronico>pruebagorest@gmail.com</direccionCorreoElectronico>\n" +
            "               </correoElectronico>\n" +
            "            </informacionContacto>\n" +
            "            <informacionPersonal>\n" +
            "               <numeroCargas>0</numeroCargas>\n" +
            "               <profesion>12</profesion>\n" +
            "               <referenciaCliente>\n" +
            "                  <apellidoPaterno>rodriguez</apellidoPaterno>\n" +
            "                  <nombres>luz marina</nombres>\n" +
            "                  <primerNombre>luz</primerNombre>\n" +
            "                  <segundoNombre>marina</segundoNombre>\n" +
            "                  <codigoTipoParentesco>4</codigoTipoParentesco>\n" +
            "                  <cliente>\n" +
            "                     <informacionContacto>\n" +
            "                        <telefono>\n" +
            "                           <codigoArea>3</codigoArea>\n" +
            "                           <numeroTelefono></numeroTelefono>\n" +
            "                           <tipoTelefono>3</tipoTelefono>\n" +
            "                        </telefono>\n" +
            "                        <direccion>\n" +
            "                           <codigoCiudad>50001</codigoCiudad>\n" +
            "                           <codigoRegion>50000</codigoRegion>\n" +
            "                        </direccion>\n" +
            "                     </informacionContacto>\n" +
            "                  </cliente>\n" +
            "               </referenciaCliente>\n" +
            "            </informacionPersonal>\n" +
            "            <informacionFinancieraCliente>\n" +
            "               <PEP>0</PEP>\n" +
            "               <totalActivos>49000000</totalActivos>\n" +
            "               <totalPasivos>45000000</totalPasivos>\n" +
            "               <totalIngresos>4500000</totalIngresos>\n" +
            "               <totalEgresos>1900000</totalEgresos>\n" +
            "               <informacionAdicional>\n" +
            "                  <monto>%s</monto>\n" +
            "               </informacionAdicional>\n" +
            "      <transaccionesExtranjeras xmlns:v20=\"http://mdwcorp.falabella.com/schema/BCO/Finanzas/v2013.05\">\n" +
            "     <v20:aplicaResidenciaEEUU>true</v20:aplicaResidenciaEEUU>\n" +
            "     <v20:aplicaPermanenciaEEUU>false</v20:aplicaPermanenciaEEUU>\n" +
            "     <v20:aplicaTributacionPaisDiferente>true</v20:aplicaTributacionPaisDiferente>\n" +
            "     <v20:paisTributacion>E.U</v20:paisTributacion>\n" +
            "     <v20:identificacionTributaria>00000000</v20:identificacionTributaria>\n" +
            "    </transaccionesExtranjeras>\n" +
            "            </informacionFinancieraCliente>\n" +
            "            <actividadLaboral>\n" +
            "               <fechaCeseEmpleo>1900-01-01</fechaCeseEmpleo>\n" +
            "               <descripcionCargo>docente</descripcionCargo>\n" +
            "               <nombreEmpresa>secretaria educacion distrital</nombreEmpresa>\n" +
            "               <direccionEmpresa>ie atanasio girardot</direccionEmpresa>\n" +
            "               <clasificacionActividad>6</clasificacionActividad>\n" +
            "               <telefono>\n" +
            "                  <codigoArea>1</codigoArea>\n" +
            "                  <numeroTelefono>122000</numeroTelefono>\n" +
            "                  <tipoTelefono>1</tipoTelefono>\n" +
            "               </telefono>\n" +
            "               <tipoContrato>2</tipoContrato>\n" +
            "            </actividadLaboral>\n" +
            "         </cliente>\n" +
            "         <contrato>\n" +
            "            <diaPago>30</diaPago>\n" +
            "         </contrato>\n" +
            "         <producto>\n" +
            "            <codigoProducto>%s</codigoProducto>\n" +
            "            <identificadorProducto>1</identificadorProducto>\n" +
            "            <descripcionProducto>respaldar el credito con falabella</descripcionProducto>\n" +
            "            <limiteBanco>\n" +
            "               <valorMaximoOperacion>10000000</valorMaximoOperacion>\n" +
            "            </limiteBanco>\n" +
            "            <limiteCliente>\n" +
            "               <valorMaximoOperacion>100000</valorMaximoOperacion>\n" +
            "            </limiteCliente>\n" +
            "            <estadoProducto>0</estadoProducto>\n" +
            "         </producto>\n" +
            "      </ns1:clienteSolicitudAdmisionGenerarExpReq>\n" +
            "   </soap:Body>\n" +
            "</soap:Envelope>");


    private final String request;

    RequestCrearProducto(String request) {
        this.request = request;
    }
    public String getRequest() {
        return request;
    }
}
