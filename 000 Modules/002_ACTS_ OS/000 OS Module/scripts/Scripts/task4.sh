#!/bin/bash

read -p "Enter the username : " usr 

echo "User ID of $usr is : "

echo""

sleep 5s

cat /etc/passwd |grep "bash" | grep "$usr" | awk -F':' '{print $3}'
