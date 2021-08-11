package estructurales.bridge;

public abstract class Mensaje {
    EnvioMensaje envioMensaje;
    public Mensaje(EnvioMensaje envioMensaje){
        this.envioMensaje=envioMensaje;
    }
    abstract public void envio();
}
