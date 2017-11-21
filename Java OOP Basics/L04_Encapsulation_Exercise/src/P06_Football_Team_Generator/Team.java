package P06_Football_Team_Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Team {
    private String name;
    private List<Player> list;

    public Team(String name) {
        setName(name);
        this.list=new ArrayList<>();
    }

    public void setName(String name) {
        if(name==null || name.trim().length()==0)
        {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void addPlayer(Player player)
    {
        this.list.add(player);
    }

    public List<Player> getList() {
        return Collections.unmodifiableList(this.list);
    }

    public void removePlayer(String player)
    {

        boolean found=false;
        for (Player player1:list)
        {
            if (player1.getName().equals(player))
            {
                found=true;
                list.remove(player1);
                break;
            }
        }
        if (!found)
        {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",player,this.name));
        }
    }
}
