_# Shopping-Cart--Array-List
Practice program Shopping Cart - ArrayList

The festival season is about to begin. Mary is planning to purchase several items through an online shopping platform. She has added

all the items to the shopping cart. Now she wants to verify if she has added all the items that she had planned to purchase. Help Mary

to view the contents of the cart.Implement the above scenario using an ArrayList. Component Specification: Products Type(Class) Attributes Methods Responsibilities Products List<String> productList Include the getter and setter method.

Note: The class and methods should be declared as public and all the attributes should be declared as private.
Requirement 1: Add product to the ArrayList.
As per this requirement, the system should be able to add a product to the ArrayList.

Component Name Type(Class) Methods Responsibilities

Add a product to the

ArrayList.

Products

public void

addProductToList(String

product)

This method is used to add a product to the ArrayList.

Requirement 2: Sort the products in the ArrayList in alphabetical order.

As per this requirement, the system should be able to sort the products in alphabetical order.

Component  Name Type(Class) Methods Responsibilities Sort the products in alphabetical order.

Products public void

sortProductList()

This method is used to sort the items in the ArrayList in alphabetical order.

In the UserInterface class,

1.Create a main method with the menu as described in the sample Input and Output.

2.When the user selects option 1.Add, add the product into the productList.

3.When the user selects option 2.Display, it should display the products in alphabetical order. If the list is empty, it should display "The

list is empty".

4.When the user selects option 3.Exit, display the message "Thank you for using the application" and terminate the program.

5.Option can take only values 1 to 3.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Ensure to follow the object-oriented specifications provided in the question.

- Ensure to provide the names for classes, attributes, and methods as specified in the question.

  Adhere to the code template, if provided.

- Please don't use System.exit(0) to terminate the program.

Sample Input / Output 1:

1.Add

2.Display

3.Exit

Enter your choice

1

Enter the product

purse

1.Add

2.Display

3.Exit

Enter your choice

1

Enter the product

key

1.Add

2.Display

3.Exit

Enter your choice

1

Enter the product

doll

1.Add

2.Display

3.Exit

Enter your choice

2

doll

key

purse

1.Add

2.Display

3.Exit

Enter your choice

3

Thank you for using the application

Sample Input / Output 2:

1.Add

2.Display

3.Exit

Enter your choice

2

The list is empty

1.Add

2.Display

3.Exit

Enter your choice

3

Thank you for using the application

Sample Input / Output 3:

1.Add

2.Display

3.Exit

Enter your choice

3

Thank you for using the application
_
