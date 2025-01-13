#include <stdio.h>




// difference between pointer and reference
// $$$$$ n should be bigger than 3;
int main()
{

int n=4;
//printf("enter n \n");
//scanf("%d",&n);
printf("-- %d \n",n);
int hh=2*n-1;
int half=n/4;
int did = n+half;
int array1[did][hh];    
int array2[n][hh];
int array3[n] [hh];


 




for (int w1=0; w1<n; w1++)
{
int start=0;
int end=w1;
for (start=0; start<(end); start++)
{
//printf("0");
array3[w1][start]=0;
}
start=w1;
end=w1+(2*(n-w1)-1);
for (start=start; start<(end); start++)
{
//printf("4");
array3[w1][start]=4;
}

start=end;
end=2*n-1;
for (start=start; start<(end); start++)
{
//printf("0");
array3[w1][start]=0;
}
//printf("\n");

}





 for (int z=0; z<n; z++){

    int j;

   for ( j=0; j<n-1-z; j++)
   {
      array2[z][j]=0;
      
      
   }   
   
   int k;
   for ( k=j ; k<(j+2*z+1); k++)
   {
   
   array2[z][k]=4;
   }
   
   for (int l=k; l<(2*n-1); l++)
   {
   
   array2[z][l]=0;
   }



}


/*
int p,q;
for (int p=0; p<n; p++)
{
for (int q=0; q<2*n-1; q++)
{
printf("%d ", array2[p][q]);
}
printf("\n");
}



for (p=0; p<n; p++)
{
for (q=0; q<2*n-1; q++)
{
printf("%d ", array3[p][q]);
}
printf("\n");
}


*/






for ( int y=0; y<did; y++)
{
    
    for (int r=0; r<hh; r++)
    {
    
        array1[y][r]=32;
    }

}


for (int i=0; i<n; i++)
{
    for (int j=0; j<hh; j++)
    {
        if (array2[i][j]==4)
        {
            
            array1[i][j]=42;
        }



       
    }
}


for (int i=0; i<n; i++)
{
    for (int j=0; j<hh; j++)
    {
        if ((array3[i][j]==4)  )
        {
            
            array1[i+half][j]=42;
        }

    }
}



for ( int y=0; y<did; y++)
{
    
    for (int r=0; r<hh; r++)
    {
        
        printf("%c ", array1[y][r]);
    }
    printf("\n");
}



























}