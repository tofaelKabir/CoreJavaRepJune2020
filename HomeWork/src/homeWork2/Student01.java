package homeWork2;

/* 
 Create a class "Student01" inside package "hw2Q3Variable". Assume you initialize a variable, id = (any id) which is non-static. Without creating an object, can you print your id in the console by System.out.println? If yes, print your id and answer here. If no, explain by Java comments in one line what change you have to bring print your age. Paste your code below. 
 * */
public class Student01 {
	public static int id = 1980;

	public static void main(String[] args) {
		System.out.println(id);
		/*
		 * a non static variable can not be called/initialized under a static method; so
		 * need to put 'static' before int id otherwise it will not be printed
		 */

	}

}
