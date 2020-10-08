public class Main {
    public static void main(String[] args) {
        long tInicio = System.currentTimeMillis();
        CustomThread t = new CustomThread(1);
        t.start(); //Se manda a hacer en segundo plano

        try {
            t.join(); //Espera a que termine el Thread
        }catch(Exception e){
            System.out.println("Error");
        }

        System.out.println("EL tiempo transcurrido es: "+ (System.currentTimeMillis()-tInicio) +" milisegundos");

        System.out.println("Terminado"); //Se ejecuta antes porque está en primer plano

        try {
            CustomThread t1 = new CustomThread(1000);
            t1.start();
            t1.join(); //Espera a que termine el Thread
            CustomThread t2 = new CustomThread(2000);
            t2.start();
            t2.join(); //Espera a que termine el Thread
            CustomThread t3 = new CustomThread(3000);
            t3.start();
            t3.join(); //Espera a que termine el Thread
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
