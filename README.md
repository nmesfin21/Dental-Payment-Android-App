# Dental-Payment-Android-App
I have built an android software application that processes a dental payment. The application appears as follows on my phone. I have circled the application with the black color.

![image](https://user-images.githubusercontent.com/31902677/52541639-4af75b80-2d4c-11e9-8c19-31caaba9d784.png)

The Application has three main activities which are Main Activity, Billing Activity and Register activity. 

# Main Activity
The main activity deals with login to the application. It is the first thing a user see when the application is up and running. The main activity contains two text fields (Username and Password text fields) and two buttons (Log In and Register buttons). 

![image](https://user-images.githubusercontent.com/31902677/52541632-28654280-2d4c-11e9-84b8-2680df99047b.png) Figure 1) Main Activity page

UserName and password Textfield:        
The first text field is for the user to enter user name and the second text field is for password input.  If the entered user name and password are not correct, a message will display on the screen saying “check the user name or password”. 

LOG IN Button:  
If the provided user name and password are correct, and the LOG IN button is clicked, the app will take the user to BILL activity. If the LOG IN button is pressed accidentally without the username and/or password, a message will appear on the screen prompting the user to provide username and/or passwords.

REGISTER Button:        
If an employee is not in the system, the employee can get access by registering to the system. In order to do that, from the main activity page the employee has to click the register button which will take the user to REGISTRATION activity. 

# Bill Activity
The Bill Activity is where the payment is processed.

![image](https://user-images.githubusercontent.com/31902677/52541565-79c10200-2d4b-11e9-817f-5d1272509d12.png) ![image](https://user-images.githubusercontent.com/31902677/52541568-7e85b600-2d4b-11e9-8325-546217b9f609.png) ![image](https://user-images.githubusercontent.com/31902677/52541574-85142d80-2d4b-11e9-9c53-c872b2f6b565.png) 

Figure 2a) default bill		                  2b) bill on action			 	        2c) bill display

The view a user encounter when it gets to the Billing activity looks like figure 2a. it is consists of  five buttons, three edit text fields, one text View and five check boxes and text descriptions. Figure 2b shows what the app looks like when an employee create a bill for a person named Barrack Obama who has done cleaning, fluoride, cavity and additional $15 worth of service. Figure 2c shows what the app looks like when an employee press display bill summary button.

Patient Text Field:
Patient text field is where the user enters the patient name. The text field has a hint “Enter Patient Name” in it to guide the user what to do. 

Cleaning checkbox:
If the cleaning check box is clicked,  a cleaning value of $35 will be added to a bill, otherwise the cleaning value will be set to 0; 

Fluoride checkbox:
If the fluoride check box is clicked, a cleaning value of $50 will be added to the bill; otherwise the fluoride value will be set to 0; 

Cavity checkbox:
If the cavity check box is clicked, a cavity value of $150 will be added to the bill; otherwise the cavity value will be 0;

X-Ray checkbox:
If the xray check box is clicked, an xray value of $85 will be added to the bill; otherwise the xray value will be 0.

Other checkbox:
If the other check box is clicked, other value text field will become editable and whatever the user entered in other value text field will be added to the bill. 

Other EditText:
Other Edit Text is where the user enters other value. If the other checkbox is not clicked, other text field is set to be not editable.

Total EditText:
This is where the total payment of the result appears. 

Calculate Button:
When the calculate button is pressed, all the procedures will be added and the total result will appear on total Edit Text

Home Button:
When clicked, it akes the user back to home page (figure 1).

Clear Button:
When clear Button clicked, it will take the bill activity back to the default status just like figure 2a.

Display Bill Summary Button:
When clicked, the summary of the bill appears at the bottom of the screen as shown in figure 2c.

# Register Activity
When a user press the Register button on main activity page (figure 1), the app takes the user to the Register Activity where the user prompts to register.

![image](https://user-images.githubusercontent.com/31902677/52541579-8d6c6880-2d4b-11e9-8071-2bf4822fb30b.png) Figure 3) Register Activity

There are nine text fields and a single button on this page. The text fields are provided in order to receive information from the customer. If first name, last name or a user name is not provided, the system prompts the user to prompts the user to enter those information in order to register the employee. On the other hand, if the provided password and confirmation password are not the same, the system let the user to match the password and confirm password. All of the text fields are provided with hint text to help the user.

REGISTER button:
When the register button is pressed on the Registration activity, it will add the information provided in Employee database and return to the main activity page(Figure 2)

# EMPLOYEE DATABASE
I have created a SQLite database to store the employees’ information. The database contains Username, first name, last name, date of birth, phone number, email and password of an employee. 
