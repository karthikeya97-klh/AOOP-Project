package profile;

public class OldPrinter implements LegacyPrinter {
	
	public void print(String content) {
        System.out.println("Old Printer printing: "+ content);
    }
}