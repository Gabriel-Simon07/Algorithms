package rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Rent> rents = new ArrayList<>();
		System.out.println("How many rooms will be rented?");
		int valueRooms = scanner.nextInt();
		
		for(int i = 1; i <= valueRooms; i++) {
			System.out.println("Rent #" + i);
			System.out.println("Name:");
			String name = scanner.next();
			System.out.println("Email:");
			String email = scanner.next();
			System.out.println("Room:");
			int numberRoom = scanner.nextInt();
			rents.add(new Rent(name, email, numberRoom));
		}
		
		System.out.println("Busy rooms:");
		for(Rent rent : rents) {
			System.out.println(rent.toString());
		}
		scanner.close();
	}
}
