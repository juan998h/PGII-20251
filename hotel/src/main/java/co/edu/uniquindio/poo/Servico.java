package co.edu.uniquindio.poo;

public class Servico {
    private static Servico instancia;

    private Servico() {

    }
    public static Servico getInstancia(){
        if(instancia == null){
            instancia = new Servico();
        }
        return instancia;

        public void notificar(String mensaje){
            System.out.println("SU TIPO DE HABITACION ES:" + mensaje);
        }
}