#!/bin/bash

echo "Initialisizing sleep 30s command and sending it to background"
echo "-------------------------------------------------------------"
sleep 30s &
jobs
echo "-------------------------------------------------------------"
echo "Now running gedit command while sleep 30s runs in background"
echo "-------------------------------------------------------------"
sleep 5s
gedit
jobs
