import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> one = new ArrayList<String>();
			one.add("AB");
			one.add("BATTT");
			one.add("Arun");
			one.add("Booma");
			one.add("Sleep");
			
			List<String> two = new ArrayList<String>();
			two.add("BA");
			two.add("BAT");
			two.add("run");
			two.add("ooma");
			
			Set<String> y = new HashSet();
			Set<String> y2 = new HashSet<>();
			for(String name:one) {
				for(String name1:two) {
					if(name.contains(name1)) {
						System.out.println(name);
						y.add(name);
					} 
				}
			}
			
			outerloop:for(String name:one) {
				innerloop:for(int counter = 0 ;counter < two.size();counter ++) {
					
					if(!name.contains(two.get(counter))) {
						if(two.size() -1 == counter ) {
						System.out.println("Name Not"+name);
						y2.add(name);
					}
						
					} else {
						continue outerloop;
					}
				}
			}
			
			ArrayList<String> final1 = new ArrayList<String>();
			final1.addAll(y);
			final1.addAll(y2);
			
			for (String name : final1) {
				System.out.println("Final List"+name);
			}
			
	}
	
	
	

}
