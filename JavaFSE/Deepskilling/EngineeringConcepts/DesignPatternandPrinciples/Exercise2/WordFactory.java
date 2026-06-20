package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise2;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
