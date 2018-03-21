package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P07_Collect_the_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        String fourth = sc.nextLine();
        String[] strings=new String[]{first,second,third,fourth};
        String[] movements = sc.nextLine().split("");
        int coins=0;
        int ilegalMoves=0;
        int startString=0;
        int index=0;
        String used=first;
        for(int i=0;i<movements.length;i++)
        {
            String move=movements[i];
            if(move.equals("V"))
            {
             startString=startString+1;

             if(startString<=3 && index>=0 && index<strings[startString].length())
             {
                 used=strings[startString];
              if(used.charAt(index)=='$')
              {
                  coins++;
              }
             }
             else
             {   startString=startString-1;
                 used=strings[startString];
                 ilegalMoves++;

             }
            }
            else if(move.equals(">"))
            {
                index=index+1;
                if(index>used.length()-1)
                {   index=index-1;
                    ilegalMoves++;
                }
                else
                {
                    if(used.charAt(index)=='$')
                    {
                        coins++;
                    }
                }
            }
            else if(move.equals("<"))
            {
             index=index-1;
                if(index<0)
                {   index=index+1;
                    ilegalMoves++;
                }
                else
                {
                    if(used.charAt(index)=='$')
                    {
                        coins++;
                    }
                }

            }
            else if(move.equals("^") && index>=0 && index<strings[startString].length())
            {
                startString=startString-1;
             if(startString>=0)
             {
                  used=strings[startString];
                 if(used.charAt(index)=='$')
                 {
                     coins++;
                 }
             }
             else
             {   startString=startString+1;
                 used=strings[startString];
                 ilegalMoves++;

             }
             }
            }
        System.out.println("Coins = "+coins);
        System.out.println("Walls = "+ilegalMoves);
        }

    }
