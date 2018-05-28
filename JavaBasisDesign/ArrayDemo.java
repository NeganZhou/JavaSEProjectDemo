package JavaBasisDesign;

public class ArrayDemo {
	public static void main(String[] args) {
		//arm 1、learn static array 2、learn dynamic array 3、learn for each
		//for each only traverse（遍历） both array and object（对象）
//		int arr[] = new int[9];
/*		int arr[] = null;	//statment one dimension array
		arr = new int[9];	//distribution memory to array
*/
		//1 static array
		int a[] = {1,5,3,4};//静态数组声明时名称后面的[]里不能写数量
		for (int i : a) {
			System.out.println(i);
		}
		//i of forech is values of array  foreach中遍历数组时使用的i就是数组的值 谨慎使用
		System.out.println("++++++++++++++++++++++++++++++++++");
		//2 dynamic array
		int b[] = new int [5]; 
		for (int i = 0; i < b.length; i++) {
			b[i] = i * 2;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b["+ i + "] = " + b[i]);
		}
		System.out.println("array b is " +b.length);
		//.length 是相对数组来说的 它返回一个int型的数据来表示数组的长度是从1开始的
		//.length()是对字符串来说的一个方法 他能求出字符串的长度
		//.size()是针对泛型集合来说的，若想看这个泛型集合有多少元素就可以调用此方法
	}
}
