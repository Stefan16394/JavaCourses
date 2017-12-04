package P02_Private_Class_Fiddling;

import P02_Private_Class_Fiddling.com.peshoslav.BlackBoxInt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
		Scanner sc=new Scanner(System.in);
		Constructor c=BlackBoxInt.class.getDeclaredConstructor();
		c.setAccessible(true);
		BlackBoxInt blackBoxInt=(BlackBoxInt)c.newInstance();
		while (true)
		{
			String[] input=sc.nextLine().split("_");
			if (input[0].equals("END"))
			{
				break;
			}

			Method method=BlackBoxInt.class.getDeclaredMethod(input[0],int.class);
			method.setAccessible(true);
			method.invoke(blackBoxInt,Integer.valueOf(input[1]));

			Field field=BlackBoxInt.class.getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(blackBoxInt));

		}
	}
}
