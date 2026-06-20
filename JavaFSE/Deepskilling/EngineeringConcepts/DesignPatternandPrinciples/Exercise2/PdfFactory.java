package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise2;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
