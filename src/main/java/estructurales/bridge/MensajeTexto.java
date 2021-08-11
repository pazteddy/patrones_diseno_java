package estructurales.bridge;

public class MensajeTexto extends Mensaje{
    public MensajeTexto(EnvioMensaje envioMensaje){
        super(envioMensaje);
    }
    @Override
    public void envio() {
        envioMensaje.envioMensaje();
    }
}
