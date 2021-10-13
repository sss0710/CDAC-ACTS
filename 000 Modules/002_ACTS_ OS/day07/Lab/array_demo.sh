#!/bin/bash
list_of_numbers=(10 20 30 40 50)
sum=0
#length of array
len_list_of_numbers=${#list_of_numbers[@]}
echo "Length of list : " $len_list_of_numbers
for ((index=0;index<$len_list_of_numbers;index++))
do 
    echo "value of" list_of_numbers[$index] " = " ${list_of_numbers[$index]}
    let "sum=$sum+${list_of_numbers[$index]}"
done
echo "Sum of array : " $sum
