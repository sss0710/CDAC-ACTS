#!/bin/bash

#Create a script that brings out all the users who are using bash shell

echo "Following users are using bash shell on this Linux box"

sleep 2s

cat /etc/passwd | grep "bash"

