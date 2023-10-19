import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class ReplaceIt {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in list");
		sc = new Scanner(sc.nextLine());
		ArrayList<String> letters = new ArrayList<String>();
		while(sc.hasNext()){
			letters.add(sc.next());
		}
		ListIterator<String> iter = letters.listIterator();
		String lastWord;
		while(iter.hasNext()){
			iter.next();
			//System.out.println(iter.next());
		}
		String replacer = iter.previous();
		iter.remove();
		String replace = iter.previous();
		iter.set(replacer);
      
		while(iter.hasPrevious()){
			if(iter.previous().equals(replace)) {
				iter.set(replacer);
			}
		} 
		System.out.println(letters);
	}
}
