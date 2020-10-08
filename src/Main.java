public class Main {
    public static void main(String[] args) {
        long tInicio = System.currentTimeMillis();
        CustomThread t = new CustomThread();
        t.start(); //Se manda a hacer en segundo plano

        try {
            t.join(); //Espera a que termine el Thread
        }catch(Exception e){
            System.out.println("Error");
        }

        System.out.println("EL tiempo transcurrido es: "+ (System.currentTimeMillis()-tInicio) +" milisegundos");

        System.out.println("Terminado"); //Se ejecuta antes porque está en primer plano
    }
}
