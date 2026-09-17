import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Membresia> ingresoConMembresia = new ArrayList<>();
        ingresoConMembresia.add(new MembresiaBasica("1A27V", "Antonio Cortés"));
        ingresoConMembresia.add(new MembresiaPremium("1B38X", "Jenny Sánchez"));

        for (Membresia membresia : ingresoConMembresia) {
            System.out.println(membresia);
            System.out.println("Información general");
            membresia.mostrarDatos();
            System.out.println(" ");
            if(membresia instanceof MembresiaPremium premium){ //verificamos si nuestra instancia actual es la membresia premium
                for(int i = 0; i < 2; i++) {
                    premium.ingresarConInvitado(); //llamamos a su metodo propio (acceso como invitado)
                    System.out.println(" ");
                }
                premium.verificarAcceso(); //acceso ilimitado de forma normal
            }else{ //de lo contrario estamos sobre la membresia basica
                for (int i = 0; i <= 11; i++) {
                    membresia.verificarAcceso(); //llamamos a su método heredado
                    System.out.println(" ");
                }
            }
            System.out.println("--------------------------------");
        }
    }
}
