import java.util.Scanner;  
public class mirror  
{  
public static void main(String args[])   
{  
//creating an instance of the scanner class   
Scanner in = new Scanner(System.in);  
System.out.print("Enter number of rows (m): ");  
//reads number of rows  
int m = in.nextInt();  
System.out.print("Enter number of columns (n): ");  
//reads number of columns  
int n = in.nextInt();  
//creating an array of m*n type  
int arr[][] = new int[m][n];  
//another array to store mirror image   
int newArr[][] = new int[m][n];  
System.out.println("Enter array elements");  
//read array elements for row nth row  
for (int i = 0; i < m; i++)   
{  
System.out.println("Enter Row "+ (i+1) + ":");  
for (int j = 0; j < n; j++)   
{  
arr[i][j] = in.nextInt();  
}  
}  
//prints the input array   
System.out.println("Input Array:");  
for (int i = 0; i < m; i++)   
{  
for (int j = 0; j < n; j++)   
{  
System.out.print(arr[i][j] + "\t");  
}  
System.out.println();  
}  
//interchanging (swapping) matrix elements  
for (int j = 0; j < n; j++)   
{  
for (int i = 0; i < m; i++)   
{  
newArr[i][n - 1 - j] = arr[i][j];   
}  
}  
//prints mirror image of the given matrix  
System.out.println("Mirror Image of Array:");  
for (int i = 0; i < m; i++)   
{  
for (int j = 0; j < n; j++)   
{  
System.out.print(newArr[i][j] + "\t");  
}  
System.out.println();  
}  
}  
}  
