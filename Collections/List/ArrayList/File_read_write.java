package ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_read_write {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> number = new ArrayList<>();

		int size = sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Index: "+i);
			int numbers = sc.nextInt();
			number.add(numbers);
		}

		System.out.println("Print the ArrayList");
		System.out.println(number);


		try {
			FileWriter writer = new FileWriter("numbers.txt");
			for (int num : number) {
				writer.write(num + "\n");
			}
			writer.close();
			System.out.println("✅ Numbers saved to 'numbers.txt'.");
		} catch (IOException e) {
			System.out.println("❌ Error saving file.");
			e.printStackTrace();
		}


		// Read from file
		ArrayList<Integer> readNumbers = new ArrayList<>();
		try {
			File file = new File("numbers.txt");
			Scanner fileReader = new Scanner(file);
			while (fileReader.hasNextLine()) {
				int num = Integer.parseInt(fileReader.nextLine());
				readNumbers.add(num);
			}
			fileReader.close();
			System.out.println("📄 Numbers read from file: " + readNumbers);
		} catch (FileNotFoundException e) {
			System.out.println("❌ File not found.");
			e.printStackTrace();
		}
		sc.close();

	}
}