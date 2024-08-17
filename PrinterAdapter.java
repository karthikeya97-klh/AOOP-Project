package profile;

public class PrinterAdapter implements Document {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    
    public void render(String content) {
        legacyPrinter.print(content);
    }
}
