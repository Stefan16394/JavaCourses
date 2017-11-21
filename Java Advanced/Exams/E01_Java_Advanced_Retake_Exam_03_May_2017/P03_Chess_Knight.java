package E01_Java_Advanced_Retake_Exam_03_May_2017;

import java.util.Scanner;

public class P03_Chess_Knight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] matrix=new String [8][8];
        int rowStart=0;
        StringBuilder piecesTake=new StringBuilder();
        while (rowStart<8)
        {
            String[] row=sc.nextLine().split("\\|");
            for(int i=0;i<8;i++)
            {
                matrix[rowStart][i]=row[i];
            }
            rowStart++;
        }
        int startPosition=Integer.parseInt(sc.nextLine());
        int invalidMoves=0;
        int outOfBounds=0;
        while(true)
        {
            String[] move=sc.nextLine().split(" -> ");
            if(move[0].equals("END"))
            {
                break;
            }
            int startI=Integer.parseInt(String.valueOf(move[0].charAt(0)));
            int startJ=Integer.parseInt(String.valueOf(move[0].charAt(1)));
            int endI=Integer.parseInt(String.valueOf(move[1].charAt(0)));
            int endJ=Integer.parseInt(String.valueOf(move[1].charAt(1)));
            if(!isValidMove(startI,startJ,endI,endJ))
            {
                invalidMoves++;
            }
            else if(outOfBounds(endI,endJ))
            {
                outOfBounds++;
            }
            else
            {
                startI=endI;
                startJ=endJ;
                if(!matrix[startI][startJ].equals(" "))
                {
                    piecesTake.append(matrix[startI][startJ]).append(", ");
                }
            }

        }
         if(piecesTake.length()>1) {
             piecesTake.deleteCharAt(piecesTake.length() - 2);
         }
        System.out.printf("Pieces take: %s\nInvalid moves: %d\nBoard out moves: %d\n"
                ,piecesTake.toString(),invalidMoves,outOfBounds);
    }
    private static boolean isValidMove(int startI,int startJ,int endI,int endJ)
    {
              if(((startI-1==endI &&(startJ-2==endJ ||startJ+2==endJ)))||
                ((startI+1==endI &&(startJ-2==endJ ||startJ+2==endJ)))||
                ((startI-2==endI &&(startJ-1==endJ ||startJ+1==endJ)))||
                ((startI+2==endI &&(startJ-1==endJ ||startJ+1==endJ))))
        {
            return true;
        }

        return false;

    }
    private static boolean outOfBounds(int endI,int endJ)
    {
        if(endI<0||endI>7||endJ<0||endJ>7)
        {
            return true;
        }
        return false;
    }


}
