rm -rf test
echo "my cur work dir `pwd`"
mkdir test;
cd test;
for i in {1..5}
do
	touch file$i.txt
done
ls
cd ..
