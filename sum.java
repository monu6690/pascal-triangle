import java.util.math.pow;
class sum
{
	public static void main(String[] args){
	 Scanner num1=new Scanner(System.in);
	 Scanner num2=new Scanner(System.in);
	 int no=num1.nextint();
	 int n=num2.nextint();
	 int fact=1;
	 float total=1;
	 int i;
	 for(i=1;i<=no;i++){
	 fact=fact*i;
	 total=total+pow(n,i)/fact;
	 System.out.println("the total is" +total);
	 }
	}
}