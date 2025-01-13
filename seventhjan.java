import java.util.* ;


public class seventhjan {

    public static  void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("ENTER the number for square matrix ");
        int rowsORcoloumnsOFmatrix = scnr.nextInt();

        int [][] twoDimensionalArray1 = new int [rowsORcoloumnsOFmatrix] [rowsORcoloumnsOFmatrix] ;
        /*for(int i=0; i<rowsORcoloumnsOFmatrix ; i++)
        {
            for (int j=0; j<rowsORcoloumnsOFmatrix; j++)
            {
                System.out.print(twoDimensionalArray1[i][j]);
            }

            System.out.println(" ");
        } */

        int position = 0;
        int k;
        int l;

        // firstly i will go horizontally 

        // oth to nth column
        //System.out.println("-------------"+rowsORcoloumnsOFmatrix);
        
        for ( l=0; l<rowsORcoloumnsOFmatrix; l++)
        {
            
            int clmn=0;
            k=l;
            twoDimensionalArray1[clmn][k]=++position;

            k=k-1;
            clmn=clmn+1;
            

            while (k>=0)
            {
               
                position++;
                twoDimensionalArray1[clmn][k]=position;


                k=k-1;
                clmn=clmn+1;
            }

        }

int z;
        for (int p=1; p<rowsORcoloumnsOFmatrix; p++)
        {
            int clmn2=rowsORcoloumnsOFmatrix-1;
            z=p;
            twoDimensionalArray1[z][clmn2]=++position;

            ++z;
            --clmn2;

            while (z<rowsORcoloumnsOFmatrix)
            {
                twoDimensionalArray1[z][clmn2]=++position;
                ++z;
                --clmn2;

            }
        }

        String kk;
        int z3;
        String pp=String.valueOf(rowsORcoloumnsOFmatrix*rowsORcoloumnsOFmatrix);

        z3=pp.length();
        z3=z3+3;
        for(int i=0; i<rowsORcoloumnsOFmatrix ; i++)
        {

            for (int j=0; j<rowsORcoloumnsOFmatrix; j++)
            {
                kk=String.valueOf(twoDimensionalArray1[i][j]);
                System.out.print(twoDimensionalArray1[i][j]);
                int w=0;
                int leth=kk.length();
                for (w=0; w<(z3-leth); w++)
                {
                    System.out.print("_");
                }
            }

            System.out.println(" ");
        } 
    }

    
}
