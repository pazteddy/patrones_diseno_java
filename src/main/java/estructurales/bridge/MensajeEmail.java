package estructurales.bridge;

public class MensajeEmail extends Mensaje{
    public MensajeEmail(EnvioMensaje envioMensaje){
        super(envioMensaje);
    }

    @Override
    public void envio(){
        envioMensaje.envioMensaje();
    }
}
