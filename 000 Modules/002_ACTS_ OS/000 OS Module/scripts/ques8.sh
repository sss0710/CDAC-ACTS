#!/bin/bash
read -p "Enter number 1: " num1
read -p "Enter number 2: " num2
read -p "Enter number 3: " num3

if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]
then
echo "Greatest num:" $num1
elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]
then
echo "Greatest num:" $num2
else
echo "Greatest num:" $num3
fi
