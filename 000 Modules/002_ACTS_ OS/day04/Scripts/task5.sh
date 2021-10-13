#!/bin/bash


#Create a script that asks for a user name displays the user ID of the user provided as input.

#If the user does not exist, then display the following error: "Entered user is not present on you Linux machine"

###############


read -p "Enter the username: " usr

##Following variable will give the user ID only when user is presnt, else the variable will be blank.

var=$(cat /etc/passwd | grep "bash" | grep -w "$usr" | awk -F':' '{print $3}')

##using if condition to check if var is blank or not

if [[ -n "$var" ]]
	then
		echo "User ID is: $var"
	else
		echo "User does not exist"
fi


