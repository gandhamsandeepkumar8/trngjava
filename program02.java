import java.util.Scanner;
class Program02
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();//15
int num2=scob.nextInt();//3
int i;//variable declaration
i=0; //initialization 
while(i<=num1)
{
             System.out.println(i+",");
             i=i+num2;
}//while loop

}//main()
}//program01 