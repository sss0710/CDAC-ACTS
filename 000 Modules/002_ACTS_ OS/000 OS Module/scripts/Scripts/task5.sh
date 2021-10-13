#!/bin/bash

read -p "Enter the username : " usr 

var=$(cat /etc/passwd | grep "bash" | grep -w "$usr" | awk -F':' '{print $3}')

if [[ -n "$var" ]]
		then
    				echo "$var"
    		else
    				echo "user does not exist"
fi

