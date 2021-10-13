#!/bin/bash

read -p "Enter text : " text
word=$(echo -n "$text" | wc -w)
char=$(echo -n "$text" | wc -c)
spchar=$(expr length "${text//[^\~!@#$&%*()]/}")

echo "The Number of words is : $word"

echo "The Number of characters are : $char"

echo "The Number of whitespace is : $(expr length "$text" - length `echo "$text" | sed "s/ //g"`) "

echo "The Number of Special symbols are : $spchar"
