public class  Matrix multiplicationExample
{
public static void main (String args[])
{
int a[][]={{1,3,4},{2,4,3},{3,4,5}};
int b[][]={{1,3,4},{2,4,3},{1,2,4}};
int c[][]=new int[5][5];
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
c[i][j]=0;
for(int k=0;k<5;k++)
{
c[i][j]=a[i][k]*b[k][j];
}
System.out.println(c[i][j]+"");
}
System.out.println();
  }
 }
}
