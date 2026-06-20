package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise2;
public class FactoryTest {
    public static void main(String[] args) {

        DocumentFactory factory = new PdfFactory();

        Document doc = factory.createDocument();

        doc.open();
    }
}
