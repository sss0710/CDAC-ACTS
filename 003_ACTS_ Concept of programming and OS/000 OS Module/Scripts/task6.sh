#!/bin/bash
##Create a script that displays all Linux users with ID greater than 1000

#https://ryanstutorials.net/bash-scripting-tutorial/bash-if-statements.php

cat /etc/passwd|  awk -F':' '{if ($3 > 1000) {print $1, $3}}'

