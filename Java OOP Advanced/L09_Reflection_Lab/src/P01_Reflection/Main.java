package P01_Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
      Class type= Reflection.class;
        System.out.println(type);
      Class superClass=type.getSuperclass();
        System.out.println(superClass);
      Class[] interfaces=type.getInterfaces();
      for (Class i:interfaces)
      {
          System.out.println(i);
      }
     Reflection ref=(Reflection) type.newInstance();
        System.out.println(ref);
    }
}
