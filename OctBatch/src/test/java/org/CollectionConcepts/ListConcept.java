package org.CollectionConcepts;
import java.util.ArrayList;
import java.util.List;
public class ListConcept {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList();
		//1.To add data in list
		li.add(10); // 0
		li.add(10); // 1
		li.add(100);// 2
		li.add(90); //3
		System.out.println("List of data using ArrayList:  "+li);
		//2.to get specific value
		Integer i = li.get(2);
		System.out.println("Specific value based on index: "+i);
		//3. to find the sizee
		int sizeList = li.size();
		System.out.println("Size of my list: "+sizeList);
		//4. To replace/update the existing data with new data
		Integer setValue = li.set(2, 80);
		System.out.println("List of data using ArrayList:  "+li);
		//5. add few more data
		li.add(2,60);
		System.out.println("adding new data to List of data using ArrayList:  "+li);
		//6. to remove any day
		Integer removefrmList = li.remove(3);
		System.out.println("remove  data from List of data using ArrayList:  "+removefrmList);
		System.out.println("List of data using ArrayList:  "+li);
		//7. to get index of data
		int indexOf = li.indexOf(10);
		System.out.println("Index value of data: "+indexOf);
		//8. last index
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println("Last Index value of data: "+lastIndexOf);
		//9. adding list to a list
		List<Integer> li1 = new ArrayList();
		li1.addAll(li);
		li1.add(90);
		System.out.println("List value of data: "+li1);
		//10. remove data
		li1.removeAll(li);
		System.out.println("Remove the data present in earlier list: "+li1);
		//11. retainall--> common value available in both list will be retained
		li1.retainAll(li);
		System.out.println("retain the data present in earlier list: "+li1);
	}

}
