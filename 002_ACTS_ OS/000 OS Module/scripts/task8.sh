#!/bin/bash
#Assignment ques - You have a list of files. Traverse through the list and display the permision set of each file?

#rm -rf ./filelist.txt

#touch filelist.txt

#echo $(ls -l /etc | grep "^-" | awk '{print $9}')  > filelist.txt

#var=$(tr ' ' '\n' < filelist.txt)

#echo "$var" > filelist.txt

while read line

do

file=$(cat filelist.txt | grep "^$line\b")

num_per=$(stat -c %a /etc/"$file")

echo "$line ----> $num_per"

done < filelist.txt

#cd ../


