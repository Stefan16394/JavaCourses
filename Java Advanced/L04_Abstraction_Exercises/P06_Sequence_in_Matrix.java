package L04_Abstraction_Exercises;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_Sequence_in_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] dimensions=sc.nextLine().split(" ");
        int rows=Integer.parseInt(dimensions[0]);
        int cols=Integer.parseInt(dimensions[1]);
        String[][] matrix=new String[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.next();
            }
        }
        String[] line= Line(matrix,rows,cols);
        String[] diagonal =Diagonal(matrix,rows,cols);
        String[] columns=Columns(matrix,rows,cols);
        String toPrint="";
        int times=1;
        int lineTimes= Integer.parseInt(line[1].trim());
        int diagonalTimes= Integer.parseInt(diagonal[1].trim());
        int columnsTimes= Integer.parseInt(columns[1].trim());
        if(lineTimes>diagonalTimes)
        {
            if(lineTimes>columnsTimes)
            {
                times=lineTimes;
                toPrint=line[0];
            }
            else
            {
                times=columnsTimes;
                toPrint=columns[0];
            }
        }
        else if(diagonalTimes>columnsTimes)
        {
            times=diagonalTimes;
            toPrint=diagonal[0];
        }
        else
        {
            times=columnsTimes;
            toPrint=columns[0];
        }
        List<String> print= Collections.nCopies(times,toPrint);
        System.out.println(String.join(", ",print));

    }

    private static String[] Line (String[][] matrix,int rows,int cols)
    {   String[] hit=new String[2];
        hit[0]=matrix[0][0];
        hit[1]=" "+1;
        int longestSeq=0;
        int seq=1;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1])) {
                    seq++;
                    if (seq > longestSeq) {
                        hit[0]=matrix[i][j];
                        hit[1]=" "+seq;
                        longestSeq=seq;
                    }
                } else {
                    seq = 1;
                }
            }
            seq=1;
        }
        return hit;
    }

    private static String[] Diagonal(String[][] matrix,int rows,int cols)
    {  String[] hit=new String[2];
        hit[0]=matrix[0][0];
        hit[1]="1";
        int longestSeq=0;
        int seq=1;
        int rowsOrcols=0;
        if(rows>cols)
        {
            rowsOrcols=cols-1;
        }
        else
        {
            rowsOrcols=rows-1;
        }

        for(int i=0;i<rowsOrcols;i++) {
            if(matrix[i][i].equals(matrix[i+1][i+1]))
            {
                seq++;
                if (seq > longestSeq) {
                    hit[0]=matrix[i][i];
                    hit[1]=" "+seq;
                    longestSeq=seq;
                }
            }
            else
            {
                seq=1;
            }
        }
        return hit;
    }

    private static String[] Columns(String[][] matrix,int rows,int cols)
    {   String[] hit=new String[2];
        hit[0]=matrix[0][0];
        hit[1]="1";
        int longestSeq=0;
        int seq=1;
        for(int i=0;i<cols;i++) {
            for (int j = 0; j < rows-1; j++) {
                if (matrix[j][i].equals(matrix[j+1][i])) {
                    seq++;
                    if (seq > longestSeq) {
                        hit[0]=matrix[j][i];
                        hit[1]=" "+seq;
                        longestSeq=seq;
                    }
                } else {
                    seq = 1;
                }
            }
            seq=1;
        }
        return hit;
    }
}