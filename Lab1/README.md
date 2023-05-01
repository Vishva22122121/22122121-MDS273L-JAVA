Write a Java Program that will collect your basic details that fall into different data types and displays them.After the details have been displayed, with the help of conditional statements, check if the gender of the user is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.Assume that you can divide the states among India into four different regions (North, South, East, and West). If you are from the southern part of India; with the help of a switch statement, it should display The Student is from the southern states of India", along with the basic details.
Firstly, we will create github public repository [22122121-MDS273L-JAVA]. 
In second step, we will create README.md file, which will contain Name: Vishva, Reg No. :22122121, Email: gokani.vishva@msds.christuniversity.in, Class: 2MScDS B.
In third step, we need to clone the repository while creating new folder inside the repository, naming the folder as Lab1 and README.md file of Lab1.
In Java Programme:
- Install require library here it is import java.util.Scanner;
- Here, we are taking variables ID, Name, Gender, State as static varaible so we can use it in main class.
- In main class we need to call scanner(sc) as we need to take input from user.[Scanner sc = new Scanner(System.in);]
- [System.out.println(" ");] is used for printing value for ID, Name, State.
- [Integer.parseInt(sc.nextLine())] we use this for printing integer value in next line, [sc.nextLine()] is used for printing the value which is taken in next line.
- Here, we use if and elseif condition such that if Gender=='m' then it will print ("Male") and if Gender=='f' then it will print("Female").
-Lastly, we are using switch statements for giving conditions for State and printing Region. While, using switch method it should always end with default and following the printout statement for the same. 
- Output: 
--Enter your ID :
22122121
Enter your Name:
Vishva
Enter your State
Gujarat
Enter 'm' for male or 'f' for female:
f
Female
Region:West

--Enter your ID : 
22122121
Enter your Name:
Achaal
Enter your State
Andhra Pradesh
Enter 'm' for male or 'f' for female:
f
Female
Region:South

- We need to push the code to repository by using following codes:
git add --all
git commit -m("comment")
git push
