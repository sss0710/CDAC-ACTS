#!/bin/bash

num=$(ls /home/dell-pc/edac_os/ | wc -l)
echo "Your file count is : $num"

d=$(ls /home/dell-pc/edac_os/ | grep ".pdf" | wc -l)
echo "the no. of pdf files are : $d"

c=$(ls /home/dell-pc/edac_os/ | grep ".docx" | wc -l)
echo "the no. of docx files are : $c"

for file in /home/dell-pc/edac_os/*.pdf
do
  mv "$file" "${file%.pdf}.docx"
done

echo "------------------------------------"

sleep 5s

d=$(ls /home/dell-pc/edac_os/ | grep ".pdf" | wc -l)
echo "the no. of pdf files are : $d"

c=$(ls /home/dell-pc/edac_os/ | grep ".docx" | wc -l)
echo "the no. of docx files are : $c"
echo "$( ls /home/dell-pc/edac_os/ | grep "_")"
