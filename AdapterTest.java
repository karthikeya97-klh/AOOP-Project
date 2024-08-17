package profile;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AdapterTest {

    @Test
    public void testLegacyPrinterAdapter() {
        // Create an instance of the legacy printer and the adapter
        LegacyPrinter oldPrinter = new OldPrinter();
        Document modernDoc = new PrinterAdapter(oldPrinter);

        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            // Test the adapter's render method
            modernDoc.render("This is a test document.");

            // Normalize line endings for comparison
            String expectedOutput = "Old Printer printing: This is a test document." + System.lineSeparator();
            String actualOutput = outContent.toString();

            // Assert that the output matches the expected output
            assertEquals(expectedOutput, actualOutput);

        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }
}