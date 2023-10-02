public class Practical33 {
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer("Song 1");
        MusicPlayer player2 = new MusicPlayer("Song 2");

        player1.start(); 
        player2.start(); 

        System.out.println("Main thread continues...");
    }
}

class MusicPlayer extends Thread {
    private String song;

    public MusicPlayer(String song) {
        this.song = song;
    }

    public void run() {
        System.out.println("Playing: " + song);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.err.println("Music player interrupted.");
        }
        System.out.println("Finished playing: " + song);
    }
}
