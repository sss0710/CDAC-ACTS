
#!/bin/bash

#Create a script that takes a number as user input and tells if prvided number is a two digit number or single digit number.

read -p "Enter number : " num

if [[ $num -gt 0 && $num -lt 10  ]]
then
	echo "Single Digit Number"

elif [[ $num -gt 9 && $num -lt 100  ]]
then
	echo "Two Digit Number"
else
	echo "Invalid Input"
fi	
