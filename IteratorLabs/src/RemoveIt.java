import java.util.*;


public class RemoveIt {
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
		lastWord = iter.previous();
		iter.remove();
      
		while(iter.hasPrevious()){
			if(iter.previous().equals(lastWord)) {
				iter.remove();
			}
		} 
		System.out.println(letters);
	}
}
