package ListArrayCartShopping;
import java.util.*;


public class UserInterface {

	public static void main(String args[]) 
	{
		
		Scanner y=new Scanner(System.in);
		int c;
		String product;
		Products p=new Products();
		List<String>list;
		
		do
		{
			System.out.println("1. Add\n");
			System.out.println("2. Display\n");
			System.out.println("3. Exit\n");
			System.out.println("Enter your choice:");
			c=y.nextInt();
			
			switch(c)
			{
			case 1:
			
				System.out.println("Enter the product:");
				product=y.next();
				p.addProductToList(product);
				break;
			
			case 2:
			
				p.sortProductList();
				list=p.getProductList();
				Iterator it=list.iterator();
				if(list.size()==0)
				
					System.out.println("The list is empty");
				
				else
				{
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
				}
			
				break;
				
			case 3:
			
				System.out.println("Thank you for using the application");
				
				break;
				
			}
			
			
		}while(c!=3);
		
	}
}
	
		
		
	
	


