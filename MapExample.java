import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sid[]= {"s1","s2","s3","s4","s5"};//Array containing student id
		int marks[]= {78,89,70,56,63};
		
		HashMap h=new HashMap();
		for(int i=0;i<sid.length;i++)//iterating from the Arrays
		{
			h.put(sid[i],marks[i]);
		}
		System.out.println("elements of the hashmap:"+h);
		System.out.println("size of the hashmap:"+h.size());

	}

}
