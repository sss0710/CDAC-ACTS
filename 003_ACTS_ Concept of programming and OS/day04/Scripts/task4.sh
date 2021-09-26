#!/bin/bash

#Create a script that asks for a user name displays the user ID of the user provided as input.

read -p "Enter the username: " usr
echo "The user ID of $usr is as follows:"
sleep 3s
echo ""
cat /etc/passwd | grep "bash" | grep "$usr" | awk -F':' '{print $3}'
