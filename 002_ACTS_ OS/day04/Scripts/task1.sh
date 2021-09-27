#!/bin/bash

#Create a directory named test
#Create 100 files and 100 directories under test
#Display permissions of test
#Modify permissions of test to 777
#Display new permissions of test

mkdir test
touch test/file{1..100}
mkdir test/folder{1..100}
stat -c %a test
#ls -l test
chmod 777 test
stat -c %a test
#ls -l test

