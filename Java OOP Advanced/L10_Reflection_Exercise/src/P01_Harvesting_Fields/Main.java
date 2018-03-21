package P01_Harvesting_Fields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Field[] methods=RichSoilLand.class.getDeclaredFields();
		while (true)
		{
			String command=reader.readLine();
			switch (command)
			{
				case "private":
					Arrays.stream(methods).filter(x-> Modifier.isPrivate(x.getModifiers()))
							.forEach(x-> {
								System.out.println(String.format("private %s %s",x.getType().getSimpleName(),x.getName()));
							});
					break;
				case "protected":
					Arrays.stream(methods).filter(x-> Modifier.isProtected(x.getModifiers()))
							.forEach(x-> {
								System.out.println(String.format("protected %s %s",x.getType().getSimpleName(),x.getName()));
							});
					break;
				case "public":
					Arrays.stream(methods).filter(x-> Modifier.isPublic(x.getModifiers()))
							.forEach(x-> {
								System.out.println(String.format("public %s %s",x.getType().getSimpleName(),x.getName()));
							});
					break;
				case "all":
					Arrays.stream(methods)
							.forEach(x-> {
								System.out.println(String.format("%s %s %s",Modifier.toString(x.getModifiers()),x.getType().getSimpleName(),x.getName()));
							});
					break;
				case "HARVEST":
					return;
			}
		}
	}
}
