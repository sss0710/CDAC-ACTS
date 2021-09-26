#!/bin/bash

#Create a script that stores the following information about all users using bash shell in a varibale named "info_user":  'username' and it's 'shell'. 

#Display the contents of the variable after initiating a wait period of 5s


#syntax to put in variable is - var=$(command)

info_user=$(cat /etc/passwd | grep "bash" | awk -F':' '{print $1, $7}')

sleep 5s

echo "$info_user"
