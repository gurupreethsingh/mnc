package variables_c;
// multiplication table using scanner class
import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
	System.out.println("Enter a Number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for (int i=1; i<=10;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
	}
	}

}
