package P03_High_Quality_Mistakes;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Class aClass= Reflection.class;
        Field[] fields= Arrays.stream(aClass.getDeclaredFields()).sorted(Comparator.comparing(Field::getName)).toArray(Field[]::new);
        Method[] methods= Arrays.stream(aClass.getDeclaredMethods()).sorted(Comparator.comparing(Method::getName)).toArray(Method[]::new);
        Method[] getters= Arrays.stream(methods).filter(x->x.getName().startsWith("get") && x.getParameterCount()==0)
                .toArray(Method[]::new);
        Method[] setters=Arrays.stream(methods).filter(x->x.getName().startsWith("set") && x.getParameterTypes().length==1)
                .toArray(Method[]::new);

        StringBuilder sb=new StringBuilder();
        for (Field field:fields)
        {
            int modifier=field.getModifiers();
            if (!Modifier.isPrivate(modifier))
            {
                sb.append(String.format("%s must be private!\n",field.getName()));
            }

        }
        for (Method method:getters) {
            int modifier=method.getModifiers();
            if (!Modifier.isPublic(modifier))
            {
                sb.append(String.format("%s have to be public!\n",method.getName()));
            }
        }
        for (Method method:setters) {
            int modifier=method.getModifiers();
            if (!Modifier.isPrivate(modifier))
            {
                sb.append(String.format("%s have to be private!\n",method.getName()));
            }
        }
        System.out.print(sb.toString());
    }



}
