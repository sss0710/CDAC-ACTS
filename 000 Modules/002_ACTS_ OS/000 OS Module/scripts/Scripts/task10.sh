#Create a script that asks for a random number from the user.
#Check if that number matches any UID in the Linux machine.
#If it does, display the username and it's shell
#If it doesn't then increment that number by 10 and display the incremented number?


#!/bin/bash

read -p "enter a random no.: " num

uid=$(cat /etc/passwd | grep -w "$num" | awk -F':' '{print $1, $7}')

if [[ -n "$uid" ]]
then
	echo "$uid"
else
	echo $(( $num+10 ))
fi

