/*Questions:
1.Wrie a Program to traverse (or iterate) ArrayList?
2.WAP to find the length of the ArrayList?
3.Given element WAP to check if element(value) exists in ArrayList?
4.WAP to sort ArrayList in descending order?
5.WAP to remove element from specified index of ArrayList.
*/




import java.util.*;

public class ArrayListExm{

public static void main(String args[]){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(15);
arr.add(30);
arr.add(40);
arr.add(56);

//1.Traverse ArrayList
System.out.println(arr);

//2.Length of the Arraylist
System.out.println("Length:"+arr.size());

//3.If element exist or not
if(arr.contains(30))
{
	System.out.println("30 exists");

}
else{
	System.out.println("30 does not  exists");
}
//4.Sort in descending order
Collections.sort(arr,Collections.reverseOrder());
System.out.println("Sorted Array in descending order:"+arr);

//5.Remove element according to specific index
arr.remove(1);
System.out.println("after removing element:"+arr);

}

}