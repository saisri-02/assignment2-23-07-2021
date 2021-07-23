import java.util.*;
public class Hashsetiterator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value : ");
int n=sc.nextInt();
Set s=new HashSet();
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
s.add(Integer.valueOf(sc.nextInt()));
}
Iterator itr=s.iterator();
while(itr.hasNext())
{
Integer i=(Integer)itr.next();
System.out.println(i);
}
}
}

output:

Enter n value : 
5
Enter array elements : 
1 3 5 4 2
1
2
3
4
5