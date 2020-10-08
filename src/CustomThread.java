public class CustomThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Repetición número. " + i);
                sleep(500); //simula una pausa en el sistema de X milisegundos
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
