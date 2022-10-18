package revision;

class Continue1
{
public static void main(String []args) 
{
for(int i=0;i<=3;i++)
{
	if(i==2)
	{
		continue;
	}
	System.out.println(i);
}
System.out.println("out of for loop");
}
}