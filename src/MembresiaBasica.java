public class MembresiaBasica extends Membresia{
    private int visitasRestantes; //numero de accesos en membresia basica

    public MembresiaBasica(String idMiembro, String nombreUsuario){
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = 10; //inicializamos la cantidad por defecto
    }

    @Override
    public boolean verificarAcceso(){
        if(this.visitasRestantes>0){
            this.visitasRestantes -= 1;
            System.out.println("Acceso concedido!");
            System.out.println("Tiene " + this.visitasRestantes + " accesos más");
            return true;
        }
        System.out.println("Ha agotado sus ingresos!");
        System.out.println("Actualice a una membresia premium para ingresos ilimitados");
        return false;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("ID: " + idMiembro);
        System.out.println("Nombre del usuario: " + nombreUsuario);
    }
}
