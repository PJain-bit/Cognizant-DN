interface Playable {
    void play();
}

// Implement the interface in classes Guitar and Piano[cite: 144].
class Guitar implements Playable {
    // Provide its own implementation of play() [cite: 145]
    @Override
    public void play() {
        System.out.println("Strumming the guitar strings...");
    }
}

class Piano implements Playable {
    // Provide its own implementation of play() [cite: 145]
    @Override
    public void play() {
        System.out.println("Playing a melody on the piano keys...");
    }
}
public class Ex19_InterfaceImplementation {
    public static void main(String[] args) {
        // Instantiate the classes and call the method[cite: 146].
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();

        myGuitar.play();
        myPiano.play();
    }
}
