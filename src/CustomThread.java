public class CustomThread extends Thread {
    private int tiempodeEspera;

    public CustomThread(int tiempodeEspera) {
        this.tiempodeEspera = tiempodeEspera;
    }

        @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Repetición número. " + i);
                sleep(tiempodeEspera); //simula una pausa en el sistema de X milisegundos
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
