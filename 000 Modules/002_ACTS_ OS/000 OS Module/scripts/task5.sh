#!/bin/bash

#Create a script that takes a directory name and lists down all the files (only files) under that dir.

read -p "Enter directory path : " path

file=$(ls -l "$path" | grep "^-" | awk '{print $9}')

if [[ -n $file ]]
then
	echo "$file"
else
	echo "Files not present"
fi

