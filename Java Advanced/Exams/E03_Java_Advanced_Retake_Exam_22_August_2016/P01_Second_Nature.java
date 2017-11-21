package E03_Java_Advanced_Retake_Exam_22_August_2016;

import java.util.*;

public class P01_Second_Nature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Integer> flowers=new ArrayDeque<>();
        ArrayDeque<Integer> cans=new ArrayDeque<>();
        int[] flower= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] water=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> blossomed=new ArrayDeque<>();
        fillqueue(flowers,flower);
        fillqueue(cans,water);

        while (flowers.size()>0 && cans.size()>0)
        {
            int currentBucket=cans.pollLast();
            int currentFlower=flowers.pollFirst();

            if(currentBucket>currentFlower)
            {
                currentBucket=Math.abs(currentFlower-currentBucket);
               try{
                   int nextBucket=cans.pollLast()+currentBucket;
                   cans.offerLast(nextBucket);

               }
               catch (NullPointerException e)
               {   cans.offerLast(currentBucket);
                   break;
               }
            }
            else if(currentBucket<currentFlower)
            {
                int currentB=currentBucket;
                while (currentFlower>0)
                {
                    currentFlower=currentFlower-currentB;
                    if(currentFlower<0)
                    {
                        cans.offerLast(Math.abs(currentFlower));
                        break;
                    }

                    try{
                         currentB=cans.pollLast();
                        if(currentB==currentFlower)
                        {
                            blossomed.add(currentFlower);
                            break;
                        }

                    }

                    catch (NullPointerException e)
                    {
                        flowers.offerFirst(currentFlower);
                        break;
                    }
                }
            }
            else
            {
                    blossomed.add(currentFlower);
            }

        }

        if(flowers.size()==0)
        {
            while (cans.size()>0)
            {
                System.out.print(cans.pollLast()+" ");

            }
        }
        else
        {
            while (flowers.size()>0)
            {
                System.out.print(flowers.pollFirst()+" ");
            }
        }
        System.out.println();
        if(blossomed.size()==0)
        {
            System.out.println("None");
            return;
        }
        for (int blossom:blossomed)
        {
            System.out.print(blossom+" ");
        }


    }
    private static void fillqueue(ArrayDeque<Integer> queue,int[] s)
    {
        for (int value : s) {
            queue.offer(value);
        }
    }







}
