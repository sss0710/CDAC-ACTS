##  Assignment 1

**Ques1 - Difference between kernel and OS** 

|**Kernel**|**OS**|
|-------------------|---------------|
|kernel is a part of OS|OS is a system software.|
|kernel provides interface between OS and the hardware|OS triggers system call and communicates with kernel|
|Main purpose is to interact with hardware(Process management, disk Management, task management, Memory Management)|-|
|All OS need kernel to run|All systems need kernel to run|
It is the first program which loads when OS boots up|It loads immediately after kernel loads|

**Ques2 - Write one-liner on Type of OS with examples**

*   **Batch OS**: Takes similar jobs having the same requirement and group them into batches to be executed. It is responsibility of operator to sort jobs with similar needs. 
	*	Example: Payroll System, Bank Statements

*   **Distributed OS**: It uses multiple processors to serve multiple real-time applications and multiple users.Data processing jobs are distributed among the processors accordingly.
	*	Example:  telecommunication networks, aircraft control systems.

*   **Multitasking OS**: It provides interface for executing the multiple program tasks by single user at a same time on one computer system.
	*	Example:windows XP, Windows 10, Linux

*   **Network OS**: These systems run on a server and provides the server the capeability to manage data, users, groups , security, applications and other network functions.
	*	Example: Linux, Microsoft Windows Server 2008

*   **Real-Time OS**: It is a defined as a data processing system in which the time interval required to process and respond to inputs is so small
that it controls the environment.
Example:Medical Imaging System, Weapons System, Air traffic Control System.

*   **Mobile OS**: An operating system for smartphones, tablets and other mobile devices is called mobile OS,
Example: Android, Blackberry OS

##	Assignment 2

**Ques1 Explain Linux Directory Structure and File System Hierarchy?**

Read this - https://www.geeksforgeeks.org/linux-file-hierarchy-structure/#:~:text=The%20Linux%20File%20Hierarchy%20Structure,in%20Unix%2Dlike%20operating%20systems.&text=In%20the%20FHS%2C%20all%20files,different%20physical%20or%20virtual%20devices.

**Ques2 Centos Directories & file creation/file editing problem**

*	Create 5 directories under /root/edac_os

dir1, dir2, dir3, dir4, dir5

```
[root@localhost edac_os]# mkdir -p dir{1..5}
[root@localhost edac_os]# ls
dir1  dir2  dir3  dir4  dir5
```
*	Create the following files under each directory

dir1 --> file1
dir2 --> file2
dir3 --> file3
dir4 --> file4
dir5 --> file5

```
[root@localhost edac_os]# touch dir1/file1
[root@localhost edac_os]# touch dir2/file2
[root@localhost edac_os]# touch dir3/file3
[root@localhost edac_os]# touch dir4/file4
[root@localhost edac_os]# touch dir5/file5
[root@localhost edac_os]# ls dir1
file1
[root@localhost edac_os]# ls dir2
file2
[root@localhost edac_os]# ls dir3
file3
[root@localhost edac_os]# ls dir4
file4
[root@localhost edac_os]# ls dir5
file5
```

*	Create file6 and file7 under dir4
```
[root@localhost edac_os]# touch dir4/file{6..7}
[root@localhost edac_os]# ls dir4
file4  file6  file7
```
*	Delete file1 under dir1
```
[root@localhost edac_os]# cd dir1
[root@localhost dir1]# ls
file1
[root@localhost dir1]# rm -rf *
[root@localhost dir1]# ls
[root@localhost dir1]# 
[root@localhost dir1]# 
```

*	Copy all files from dir4 to dir1
```
[root@localhost dir1]# cp -r /root/edac_os/dir4/* .
[root@localhost dir1]# ls
file4  file6  file7
[root@localhost dir1]# ls ../dir4
file4  file6  file7
```

*	Move all files from dir1 to dir2
```
[root@localhost dir1]# mv * /root/edac_os/dir2
[root@localhost dir1]# ls
[root@localhost dir1]# ls ../dir2
file2  file4  file6  file7
```

*	Delete file1 from dir2
```
[root@localhost dir1]# cd ../dir2
[root@localhost dir2]# rm -rf file1
[root@localhost dir2]# rm file1
rm: cannot remove ‘file1’: No such file or directory
```

*	Remove all the directories except dir2
```
[root@localhost dir2]# cd ..
[root@localhost edac_os]# rm -rf dir1
[root@localhost edac_os]# rm -rf dir{3..5}
[root@localhost edac_os]# ls
dir2
```

*	Rename dir2 to finaldir
```
[root@localhost edac_os]# mv dir2 finaldir
```

*	List the files under finaldir
```
[root@localhost edac_os]# ls finaldir
file2  file4  file6  file7
```

*	Each file under finaldir should have the following content - 'I'm a file under finaldir'
```
[root@localhost edac_os]# echo "I'm a file under finaldir" > finaldir/file2
[root@localhost edac_os]# echo "I'm a file under finaldir" > finaldir/file4
[root@localhost edac_os]# echo "I'm a file under finaldir" > finaldir/file6
[root@localhost edac_os]# echo "I'm a file under finaldir" > finaldir/file7
[root@localhost edac_os]# cat finaldir/file2
I'm a file under finaldir
[root@localhost edac_os]# cat finaldir/file4
I'm a file under finaldir
[root@localhost edac_os]# cat finaldir/file6
I'm a file under finaldir
[root@localhost edac_os]# cat finaldir/file7
I'm a file under finaldir
```

