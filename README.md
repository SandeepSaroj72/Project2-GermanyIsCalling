# Project2-GermanyIsCalling

**This project automates the functional testing of the "Germany Is Calling" web application using Selenium WebDriver and TestNG.
The suite includes test scripts for validating the SignUp page, Login page and HomePage, capturing screenshots on failure, and navigating the site. 
The project is designed to do regression testing and catch issues .**

**1. Test Execution Steps**
**Prerequisites:**
**Java**: Ensure Java (JDK 8 or later) is installed on your machine.
**Eclipse IDE**: Download and setup latest version of Eclipse IDE
**Selenium Jar Files**: Makes Sure you have downloaded the selenium Jar file
**Driver File(Executable File):** Ensure the latest version of Driver is downloaded and available in your system's PATH or included in the project directory. 
                                    a. chromedriver     b. msedgedriver   c. geckodriver
**Maven**: Ensure Maven is installed and configured.
**TestNG**: Ensure TestNG is installed in your eclipse IDE.

**Setup**
1. install Eclipse IDe
2. Create a new java project  (File-->new-->java Project)
3. Right click on your project and Go to properties option and click on java build path and go to libraries and click on classpath
    and then add external jars files, add all selenium jar files and library files
4.  Right Click on your project and click on new and then select folder option and create a folder name driver and copy paste all driver executable file in this
5.  Right Click on your project and click on new and then select folder option and create a folder name GetScreenShot, this will store all screenshots when any test case will fail.
6.  Right Click on your project and click on new and then select folder option and create a folder name TestData, here we will store pdf file, xmls file, property file

  
**2. Assumption**
**a. Stable Internet Connection**
**b. Valid Test Credentials:**  for e.g  Name: Sandeep   Email: sandeepsaroj72040@gmail.com  Password: Sandeep@12345
**c. Invalid Test Credentials**
**d. Cross-browser Compatibility:**
It is assumed that the page elements (e.g., text fields, buttons, links) do not change their attributes (like XPaths or IDs) frequently.


**3. Additional Information**
**Challenges**
i was not able to call the field variable of one method to another method because of testNG limitation.
i was trying to build a logic with parametesised method so i can enter the value by calling webelement address variable but i could'nt do that 
as a result i have written so many testScript to test SignUP validation



**Author: Sandeep Saroj**
