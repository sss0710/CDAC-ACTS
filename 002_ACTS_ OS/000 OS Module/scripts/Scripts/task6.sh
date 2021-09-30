#!/bin/bash

cat /etc/passwd |grep "bash"| awk -F':' '{if($3 >= 1000) {print $1}}'

