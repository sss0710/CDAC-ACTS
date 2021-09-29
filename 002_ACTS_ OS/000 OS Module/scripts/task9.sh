#!/bin/bash

echo 

while read line

do

shell=$(cat /etc/passwd | grep "^$line\b"  | awk -F':' '{print $1}' '{print \n}')

echo "$user_per"

done < "
