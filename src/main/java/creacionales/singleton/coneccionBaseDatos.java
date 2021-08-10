package creacionales.singleton;


public class coneccionBaseDatos {
    private String url;
    private String baseDatos;
    private static coneccionBaseDatos miconfigurador;

    public static coneccionBaseDatos getConfigurador(String url,String baseDatos) {
        System.out.println("Configurando base de datos...");
        if (miconfigurador==null) {
            System.out.println("Creando instancia para la connecion");
            miconfigurador=new coneccionBaseDatos(url,baseDatos);
        }
        return miconfigurador;
    }
    private coneccionBaseDatos(String url,String baseDatos){
        this.url=url;
        this.baseDatos=baseDatos;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getBaseDatos() {
        return baseDatos;
    }
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

}
