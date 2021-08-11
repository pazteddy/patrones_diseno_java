package estructurales.bridge;

public class appBridge {
    public void displayBridge() {
        EnvioMensaje mensajeTextoEnvio=new EnvioMensajeTexto();
        Mensaje mensajeTexto=new MensajeTexto(mensajeTextoEnvio);
        mensajeTexto.envio();
        EnvioMensaje envioMensajeEmail=new EnvioMensajeEmail();
        Mensaje mensajeEmail=new MensajeEmail(envioMensajeEmail);
        mensajeEmail.envio();
    }
}
