package estructurales.bridge;

public class EnvioMensajeEmail implements EnvioMensaje{

    @Override
    public void envioMensaje() {
        System.out.println("Enviando comprobante de compra por correo electronico....");
    }
}
