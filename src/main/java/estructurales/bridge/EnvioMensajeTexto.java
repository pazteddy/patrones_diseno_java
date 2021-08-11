package estructurales.bridge;

public class EnvioMensajeTexto implements EnvioMensaje{
    @Override
    public void envioMensaje() {
        System.out.println("Enviando nro comprobante de compra por mensaje de texto....");
    }
}
