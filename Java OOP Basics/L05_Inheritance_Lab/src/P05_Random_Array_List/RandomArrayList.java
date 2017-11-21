package P05_Random_Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList<Object> extends ArrayList {
    private Random random=new Random();
    public Object getRandomElement()
    {
      int index=random.nextInt(super.size());
      return (Object)super.remove(index);
    }
}
