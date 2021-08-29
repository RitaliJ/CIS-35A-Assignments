/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6B
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */


Extract ClassScoresStatisticalAnalysis to a local folder.
To compile the Class statistics program run command from the root folder:

javac src/**/*.java

____

To Run the first driver (Driver1) use the command: 

java -cp src driver.Driver1

On execution the program will read the file but with the incorrect file name while attempting to create the student objects. However the program will catch the error in the file name and create an exception log at "exceptionlog.txt". The program will then try to fix the exception of the incorrect file name by correcting it and then populate the student array and serialize the student objects to individual files. 

____

To Run the second driver (Driver2) use the command: 

java -cp src driver.Driver2

On execution the program will read the file, create the student objects, and then serialize the studentGrade objects to individual files. The serialized files will include the student's grades for quizzes and class statistics.

____

To Run the third driver (Driver3) use the command: 

java -cp src driver.Driver3

On execution the program will ask call the StudentAPI implementation and read the file to populate the students. The program will then ask the user for their student ID. The program will also ask for what information the user would like to view. Based on the input, the program will print the student's scores, class statistics, or both. 
