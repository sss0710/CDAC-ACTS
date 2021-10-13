#!/bin/bash

while read line 
do 
    display=$(stat -c %a /etc/$line)
    echo "$line ---> $display"
done < /home/dell-pc/edac_os/file.txt
