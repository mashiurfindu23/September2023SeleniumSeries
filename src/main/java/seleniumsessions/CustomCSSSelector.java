package seleniumsessions;

import org.openqa.selenium.By;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		
		// if not id or class others attribute to create css selector
		//tagname[atrr= 'value']
		
		// https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		//     input[name='firstname']   // is not included 
		//     input[id='input-firstname'] // is not included 
		
		//mulple attribute
		
		//tag[attr1='value'][attr2= 'value'][attr3='value']
		
		//text() is not supported in css
		
		
		
		//contains:
		
		//     tag[attr*='value']   * will work as an contains()
		
		//https://app.hubspot.com/login
		//    input[class*='login-email']
		//   input[id*='username']
		
		// starts-with:
		
//	     tag[attr^='value']
		
		// https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//     input[placeholder^='First']      caret(^) sign will work as stats-with
		
		
		
		
		// ends-with:
		
	//	 tag[attr$='end value']
		//https://app.hubspot.com/login
		//         input[class$='login-email']
		
		
		
		// parent to child:  letest selenium video video # 13 time is 1: 08 mins
		
		//    parent tag child tag
		//    parent tag>child tag>child tag    > sigh will give all the direct child element
		//https://app.hubspot.com/login
		//         div.private-form__input-wrapper input#username
		// https://www.orangehrm.com/en/contact-sales/       select country
		//         select#Form_getForm_Country option
		
		
		
		//or in css its denoted by comma separated
		
		//input#username,input#password,button#loginBtn,button#ssoBtn   all functionality in login page 
		//usecase: above 4 functionalities are present in login page or not
		//https://app.hubspot.com/login
//		int importentFieldCount= driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,button#ssoBtn")).size();
//		System.out.println(importentFieldCount);
//		if(importentFieldCount==4) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
// 	img[title='naveenopencart'],input[name='search'],button[data-toggle='dropdown']
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		
		
		
	// 	not in css: 
		
		//usecase: if there are same attributes value but I want to exclude any one 
		//example: input.form-control.form-control:not(#password) here password field is excluded
		//https://app.hubspot.com/login
		
	//example	input.form-control:not(input[name='search']) in writing css when we create input.form-control 
	// 	we get 7 field but I want to exclde search field 
	// input.form-control:not(input[name='search'],input[name='firstname']) will give 5 field excluding search and first name
		
	//	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		
		//indexing
		//https://www.orangehrm.com/en/book-a-free-demo/
		//select#Form_getForm_Country>option:first-child             will give only first element like "Country"
		//select#Form_getForm_Country>option:last-child			will give only last element like "Zaire"
		//or
		//select#Form_getForm_Country>:first-of-type   without tag           will give only first element like "Country"
		//select#Form_getForm_Country>:last-of-type		without tag	will give only last element like "Zaire"
		//select#Form_getForm_Country>option:first-child
		// specific element
		//select#Form_getForm_Country>option:nth-of-type(1)    will give "Country"
		//select#Form_getForm_Country>option:nth-of-type(2)    will give "Afghanistan"
		//select#Form_getForm_Country>option:nth-of-type(n)    will give "All the 233 Country"
		//without tag
		//select#Form_getForm_Country>:nth-of-type(1)    will give "Country"
		//select#Form_getForm_Country>:nth-of-type(2)    will give "Afghanistan"
		//select#Form_getForm_Country>:nth-of-type(n)    will give "All the 233 Country"
		//importent: but with tag is more preferable
		//importent: but indexing point of view xpath is more preferable
		
		//Sibling concept: Allow only following-sibling
		//label[for='input-email']+input[id='input-email']      traversing from lebel to input
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		
	}

}
