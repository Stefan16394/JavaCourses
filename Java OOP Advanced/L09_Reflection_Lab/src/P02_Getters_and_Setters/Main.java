package P02_Getters_and_Setters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class cl=Reflection.class;
        Method[] methods=cl.getDeclaredMethods();
        List<Method> getters=new ArrayList<>();
        List<Method> setters=new ArrayList<>();
        for (Method method:methods)
        {
            if (method.getName().startsWith("get"))
            {
                if (method.getParameterCount()==0)
                {
                    getters.add(method);
                }
            }
            else if (method.getName().startsWith("set"))
            {
                if (method.getParameterCount()==1)
                {
                 if (method.getReturnType().equals(void.class))
                 {
                     setters.add(method);
                 }
                }
            }
        }
        getters.sort((x,y)->x.getName().compareTo(y.getName()));
        setters.sort((x,y)->x.getName().compareTo(y.getName()));
        printGetters(getters);
        printSetters(setters);
    }

    private static void printSetters(List<Method> setters) {
        for (Method method:setters)
        {
            System.out.printf("%s and will set field of %s\n",method.getName(),method.getParameterTypes()[0]);
        }
    }

    private static void printGetters(List<Method> methods) {
        for (Method method:methods)
        {
            System.out.printf("%s will return %s\n",method.getName(),method.getReturnType());
        }
    }
}
