import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Stefko");
        list.add("sds");
        list.add("sdasdda");
        for (String s:list)
        {   if (s.equals("sds")) {

            list.remove(s);
        }

        }

    }
}
