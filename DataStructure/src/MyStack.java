import java.util.ArrayList;
import java.util.List;

public class MyStack <T>{
	
	List<T> list= new ArrayList<T>();
	
	public void insert(T item) {
		
		System.out.println(list.add(item));
	}
	public T remove(T item) {
		if(list.size()==0) {
			System.out.println("plus rien n'a retirer dans la liste");
		}else {
		list.remove(list.size()-1);
		}
		return item;
		
	}
	
}
