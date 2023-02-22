Create a java program that performs the following operation:
The program should collect an integer array from the user
After the array is entered, you need to create a menu of items
Find the Mean Value
Find the Median Value
Find the Mode Value
From the user-given array.
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.


Here in this program we use 'Scanner' class to collect integer array from the user. We are taking number of elements of Array and then elements of Array which is of integer type in new array for integer i the loop starts with 0, i runs unless it is less then n(i.e new array[n] which will be formed). After which it displays a menu of operations using 'Scanner.nextInt' method. By switch(where one statement is executed several times) in Case-1 for calculate mean of the array and print out it's output we use System.out.println("Mean of Array"+ mean) then break. Similarly Case-2 is for calculating median and Case-3 is for calculating mode.

Following which by user's choice, program calls appropriate function('mean','median','mode'). Next to it there is a function to compute the mean value, median and mode. The 'mean' function computes the sum of elements in the array and divides by the length of the array to obtain the mean value. The 'median' function first sorts the array in ascending order using the 'Array.sort' method, then find the middle element(s) depending on the length of array whether it is odd or even. The 'mode' function uses nested loops to count the frequency of each element in Array and keeps track of the elment with highest frequency. If there are multiple elements with highest frequency, the function returns the first one. 

Enter number of Elements of Array
4
Enter the elements of the array:
1
2
3
4
1. Find Mean
2. Find Median
3. Find Mode
Enter your Choice
1
Mean of Array 2.5