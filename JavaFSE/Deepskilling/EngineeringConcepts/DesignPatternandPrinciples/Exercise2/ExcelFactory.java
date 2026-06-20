package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise2;

public class ExcelFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
