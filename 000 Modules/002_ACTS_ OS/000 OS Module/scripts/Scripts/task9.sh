#!/bin/bash

read -p "Enter number : " a
read -p "Enter another number : " b

if [[ $a -gt $b ]]
	
then 
	echo "$a is greater"
else
	echo "$b is greater"
fi
