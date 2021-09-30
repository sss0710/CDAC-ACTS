#!/bin/bash

info_user=$(cat /etc/passwd | grep "bash" | cut -d':' -f1,7)
user_info=$(cat /etc/passwd | grep "bash" | awk -F':' '{print $1, $7}')

sleep 2s

echo "$info_user"
echo "$user_info"
