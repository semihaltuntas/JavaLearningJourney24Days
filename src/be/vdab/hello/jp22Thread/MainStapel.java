package be.vdab.hello.jp22Thread;

public class MainStapel {
    public static void main(String[] args) {
        var stappel = new Stapel();
        var thread1 = Thread.startVirtualThread(new Kok(stappel));
        var thread2 = Thread.startVirtualThread(new Kok(stappel));
        var thread3 = Thread.startVirtualThread(new Kok(stappel));


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stappel.getAantalPannenkoeken());
    }
}
