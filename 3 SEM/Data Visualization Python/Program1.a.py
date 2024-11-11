'''Write a python program to find the best of two test average marks out of three 
test marks accepted from the user. '''
test1 = float(input("Enter Test1 marks: ")) 
test2 = float(input("Enter Test2 marks: ")) 
test3 = float(input("Enter Test3 marks: ")) 
 
if test1 <= test2 and test1 <= test3: 
   min_score = test1 
elif test2 <= test1 and test2 <= test3: 
   min_score = test2 
else: 
   min_score = test3 
 
average = (test1 + test2 + test3 - min_score) / 2 
print("The Average of Best Two Tests is: ", average) 
 

'''Output: 
Enter Test1 marks: 45 
Enter Test2 marks: 20 
Enter Test3 marks: 40 
The Average of Best Two Tests is: 43'''