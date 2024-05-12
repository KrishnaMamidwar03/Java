package PhoneBook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class StoreData {
	public static void StoreContact(List<PhoneBook> book, String fileName) throws IOException {
		try(PrintWriter pr = new PrintWriter(new FileWriter(fileName))){
		book.stream().forEach(l->pr.println(l));	
		}
	}
}
