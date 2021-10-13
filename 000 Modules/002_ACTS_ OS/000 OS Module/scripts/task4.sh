#!/bin/bash

##Create a script that takes a path and tells you if provided path is a file or a directory
read -p "Enter the path to file or directory : " path

line=$(ls -l -d $path)

first_char=$(echo "$line" | cut -c1)

if [[ $first_char == - ]]
then
	echo "Path leads to a file"

elif [[ $first_char == d ]]
then
	echo "Path leads to a directory"

else
	echo "Invalid Path"
fi
