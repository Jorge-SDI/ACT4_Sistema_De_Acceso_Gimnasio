public class MembresiaPremium extends Membresia {
    private int pasesInvitado; //variable para acceso como invitado

    public MembresiaPremium(String idMiembro, String nombreUsuario){
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = 1; //inicializamos internamente el numero de accesos por defecto
    }

    @Override
    public boolean verificarAcceso(){
        System.out.println("Acceso individual concedido!");
        return true;
    }

    public boolean ingresarConInvitado(){  //metodo propio de la clase premium
        if(this.pasesInvitado > 0){
            System.out.println("Ha ingresado con un invitado!");
            this.pasesInvitado -= 1;
            return true;
        }
        System.out.println("No puede acceder con más invitados!");
        System.out.println("Puede seguir accediendo de forma individual...");
        return false;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("ID: " + idMiembro);
        System.out.println("Nombre del usuario: " + nombreUsuario);
    }
}
