#!/bin/bash

#Create a script that creates a dir named test and then creates 5 files under it named as file1, file2..file5 and then renames all files by adding .txt extension to all file names

##remove test if already present

rm -rf test

echo "My current location is `pwd`"

mkdir test;

cd test ## created test folder and went inside it

for i in {1..5} ## initiated for loop

 do

   touch file$i

 done

ls ##listed all files created under test folder

cd .. ## went out of test folder 
