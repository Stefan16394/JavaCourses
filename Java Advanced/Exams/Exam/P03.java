package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,LinkedHashMap<String,TreeSet<String>>> blog=new LinkedHashMap<>();

        while (true)
        {
            String[] input=sc.readLine().split(" ");
            if (input[0].equals("Statistics"))
            {
                break;
            }
            String user=input[0];
            String command=input[1];

            if (command.equals("joined"))
            {
                if (!blog.containsKey(user))
                {
                   LinkedHashMap<String,TreeSet<String>> followersMap=new LinkedHashMap<>();
                   TreeSet<String> list=new TreeSet<>();
                   followersMap.put("Followers",list);


                    TreeSet<String> list2=new TreeSet<>();

                    blog.put(user,followersMap);
                    blog.get(user).put("Following",list2);

                }
            }
            else if(command.equals("followed"))
            {
                String followedThisUser=input[2];
                if(blog.containsKey(user)&&blog.containsKey(followedThisUser)&&!user.equals(followedThisUser))
                {
                    blog.get(user).get("Following").add(followedThisUser);
                    blog.get(followedThisUser).get("Followers").add(user);
                }
            }

        }
       blog= blog.entrySet().stream().sorted((a,b)->{
            int firstWlogger=a.getValue().get("Followers").size();
            int secondWlogger=b.getValue().get("Followers").size();
            if (firstWlogger!=secondWlogger)
            {
                return Integer.compare(secondWlogger,firstWlogger);
            }
            int first=a.getValue().get("Following").size();
            int second=b.getValue().get("Following").size();
            return Integer.compare(first,second);
        }).collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        int counter=1;
        System.out.printf("The V-Logger has a total of %d vloggers in its logs.\n",blog.keySet().size());
        for (Map.Entry<String, LinkedHashMap<String, TreeSet<String>>> blogger:blog.entrySet())
        {
            System.out.printf("%d. %s : %d followers, %d following\n",counter,blogger.getKey(),
                    blogger.getValue().get("Followers").size(),
                    blogger.getValue().get("Following").size());
            if (counter==1)
            {
                for (String follower:blogger.getValue().get("Followers"))
                {
                    System.out.printf("*  %s\n",follower);
                }
            }
            counter++;
        }
        System.out.println();
    }
}
