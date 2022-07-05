package TestNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	// ******Making the method to false to show the dependancies*****
	@Test(enabled = true)
	public void Login() {
		System.out.println("Login Successfull");

	}

	@Test (dependsOnMethods = "Login")
	public void selectProduct() {
		System.out.println("Product is selected");
	}
	@Test (dependsOnMethods = "selectProduct")
	public void addtoCart() {
		System.out.println("Product Added to Cart");
	}

}
