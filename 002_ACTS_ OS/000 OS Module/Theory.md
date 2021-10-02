#	OPERATING SYSTEMS

#	DAY 1

Objective
---
To introduce Operating System concepts with Linux environment, and to learn Shell Programming

Day 1 Theory
---

What is OS?
---

**An Operating System (OS) is an interface between a computer user and computer hardware.** 

An operating system is a software which performs all the basic tasks like file management, memory management, process management, handling input and output, and controlling peripheral devices such as disk drives and printers.

Some popular Operating Systems include **Linux Operating System, Windows Operating System, VMS, OS/400, AIX, z/OS, etc.**

Some of important functions of an operating System
---
**Processor Management:** An operating system manages the processor’s working by allocating various jobs to it and ensuring that each process receives enough time from the processor to function properly.

**Memory Management:** An operating system manages the allocation and deallocation of the memory to various processes and ensures that the other process does not consume the memory allocated to one process.

**Device Management:** There are various input and output devices. An operating system controls the working of these input-output devices. It receives the requests from these devices, performs a specific task, and communicates back to the requesting process.

**File Management:** An operating system keeps track of information regarding the creation, deletion, transfer, copy, and storage of files in an organized way. It also maintains the integrity of the data stored in these files, including the file directory structure, by protecting against unauthorized access.

**Security:** The operating system provides various techniques which assure the integrity and confidentiality of user data. Following security measures are used to protect user data:
*	Protection against unauthorized access through login.
*	Protection against intrusion by keeping Firefall active.
*	Protecting the system memory against malicious access.
*	Displaying messages related to system vulnerabilities.

**Error Detection:** From time to time, the operating system checks the system for any external threat or malicious software activity. It also checks the hardware for any type of damage. This process displays several alerts to the user so that the appropriate action can be taken against any damage caused to the system. 

**Job Scheduling:** In a multitasking operating system where multiple programs run simultaneously, the operating system determines which applications should run in which order and how time should be allocated to each application. 

Interaction wit
The application--- programs make use of the operating system by making requests for services through a defined application program interface (API). In addition, users can interact directly with the operating system through a user interface, such as a command-line interface (CLI) or a graphical UI (GUI).

Why is OS hardware dependent?
------
We should understand that the following things are hardware dependent:

System startup/reset
Interrupt handling
Virtual memory management & protection
Device I/O
System-level protections for code access and security
Some mutual exclusion primitives

Now if we see closely, all above are functions of an OS. Hence OS is hardware deendent.

Platform dependent typically refers to applications that run under only one operating system in one series of computers (one operating environment); for example, Windows running on x86 hardware or Solaris running on SPARC hardware. Sometimes, it means the same as "hardware dependent" or "machine dependent" and refers to applications that run in only one hardware series with the operating system not being relevant.

In contrast, "platform independent" means that the application can run in different operating environments. Applications written in Java are a prime example

What did we learn so far about an OS (yeah in simple terms)
---
1. A program which controls the execution of all other programs
(applications).

2. Acts as an intermediary between the user(s) and the computer.

3. Objectives:
– convenience,
– efficiency,
– extensibility

4. The Operating System (OS): 
– controls all execution. 
– multiplexes resources between applications. 
– abstracts away from complexity.

Components of an OS
---
Shell
Kernel

Shell handles user interactions. It is the outermost layer of the operating system and manages the interaction between user and operating system by:

- Prompting the user to give input
- Interpreting the input for the operating system
- Handling the output from the operating system

Kernel is the core component of an operating system which acts as an interface between applications, and the data is processed at the hardware level

The kernel is responsible for performing the following tasks:

- Input-Output management 
- Memory Management 
- Process Management for application execution. 
- Device Management 
- System calls control


Question 1 - Difference between kernel and OS (10 min)
---
*   Good reference: https://www.geeksforgeeks.org/difference-between-operating-system-and-kernel/

Types of Operating Systems
---
- Batch OS
- Distributed OS
- Multitasking OS
- Network OS
- Real-OS
- Mobile OS

Question 2 - Write one-liner on each OS with examples (10 min)
---

*   Read this - https://www.geeksforgeeks.org/types-of-operating-systems/

Modes of operation in OS
---
User mode --> mode bit = 1
kernel mode --> mode bit = 0

Important: The mode bit is set to 0 in the kernel mode. It is changed from 0 to 1 when switching from kernel mode to user mode.

**Kernel Mode**

In Kernel mode, the executing code has complete and unrestricted access to the underlying hardware. It can execute any CPU instruction and reference any memory address. Kernel mode is generally reserved for the lowest-level, most trusted functions of the operating system. Crashes in kernel mode are catastrophic; they will halt the entire PC.

**User Mode**

In User mode, the executing code has no ability to directly access hardware or reference memory. Code running in user mode must delegate to system APIs to access hardware or memory. Due to the protection afforded by this sort of isolation, crashes in user mode are always recoverable. Most of the code running on your computer will execute in user mode.

Example
---
Regular user space programs evoke system calls all the time to get work done, for example:
ls
ps
top
bash

Digging one layer deeper, the following are some example system calls which are invoked by the above listed programs. Typically these functions are called through libraries such as glibc, or through an interpreter such as Ruby, Python, or the Java Virtual Machine.
open (files)
getpid (processes)
socket (network)

A typical program gets access to resources in the kernel through layers of abstraction as follows:

- User Programs
- Library/Interpreter
- System Calls
- Kernel Space

Assignment 1
---
**Question 1 - Difference between kernel and OS** 

|**Kernel**|**OS**|
|-------------------|---------------|
|kernel is a part of OS|OS is a system software.|
|kernel provides interface between OS and the hardware|OS triggers system call and communicates with kernel|
|Main purpose is to interact with hardware(Process management, disk Management, task management, Memory Management)|-|
|All OS need kernel to run|All systems need kernel to run|
It is the first program which loads when OS boots up|It loads immediately after kernel loads|

**Question 2 - Write one-liner on Type of OS with examples**

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

#	DAY 2

##      Day 2 Theory

Full screen mode -> Click inside the machine and Press Ctrl+Alt+Enter
To clear data on screen ->  Ctrl+L

```
[lavishjhamb@localhost ~]$
```
[username@machinename <location>]


```~ -> <home of the user>
$ --> user in action is a regular user
# --> user in action is a root user
```

'root' user is main user is linux with user id '0'. It has all the permissions possible.

```
[root@localhost ~]#
``` 

Kind of users in Linux
---
1. Root User
2. Regular User
3. Super User (Sudoer)

To Change location in Linux - To traverse in Linux
---
```
cd <location where you want to go>
```

File Hierarchy in Linux - Directory Structure in Linux
---

Folders inside '/'
```
bin   dev  home  lib64  mnt  proc  run   srv  tmp  var
boot  etc  lib   media  opt  root  sbin  sys  usr

/bin
/dev
/home
/lib64
/mnt
/proc
/run
/srv
/tmp
/var
/boot
/etc
/lib
/media
/opt
/root
/sbin
/sys
/usr
```

**Ques 1 - Explain what's inside each folder under '/'**
*   Read this - https://www.geeksforgeeks.org/linux-file-hierarchy-structure/#:~:text=The%20Linux%20File%20Hierarchy%20Structure,in%20Unix%2Dlike%20operating%20systems.&text=In%20the%20FHS%2C%20all%20files,different%20physical%20or%20virtual%20devices

To see current location
---
```
pwd --> present working directory
```


Meaning of '.' and '..'
---
```
. --> same location
.. --> previos directory
```
```
[root@localhost audit]# cd .
[root@localhost audit]# pwd
/var/log/audit
[root@localhost audit]# cd ..
[root@localhost log]# cd ..
[root@localhost var]# cd ..
[root@localhost /]# cd /var/log/audit/
[root@localhost audit]# cd ../../..
[root@localhost /]# 
```

Folder (Directory) creation
---
```mkdir <foldername>
[root@localhost edac_os]# pwd
/root/edac_os
[root@localhost edac_os]# mkdir dir1
[root@localhost edac_os]# mkdir dir2
[root@localhost edac_os]# mkdir dir3
[root@localhost edac_os]# ls
dir1  dir2  dir3
```

Folder removal
---
```
rm -rf <absolute path of the folder>
```

*   rm -> remove
*   r -> recursively
*   f -> forcefully

```
[root@localhost edac_os]# rm -rf /root/edac_os/dir3
[root@localhost edac_os]# ls
dir1  dir2
```

Remove multiple folders at a time 
---
```
[root@localhost edac_os]# rm -rf *
```

How to create files
---
```
touch <filename>  -> it will create a blank file
```

Sceanrio we are working on
---
We are under /root/edac_os

and this contains - dir1 and dir2
and dir1 contains - file1 and file2
and dir2 contains - file3 and file4

Condition: Current location -> '/'

Task
Delete file1 under dir1
```
[root@localhost /]# rm -rf /root/edac_os/dir1/file1
[root@localhost ~]# cd /root/edac_os/dir1
[root@localhost dir1]# ls
file2
```

Create file5 under dir2
```
[root@localhost /]# touch /root/edac_os/dir2/file5
[root@localhost /]# cd /root/edac_os/dir2
[root@localhost dir2]# ls
file3  file4  file5
```

Editing of a file using 'vi'
---
```
vi <filename>
Press i --> insert
<Fill in the content>
Press Esc
:wq! --> Save my data and exit
:q! --> Exit
:w! --> just saves the current data
```

To see the contents of file
---
```
cat <filename>
[root@localhost dir2]# vi file3
[root@localhost dir2]# cat file3
I'm editing file3 because Im bound to
```

Edit file2 and write "I disturb during tasks" in it
```
vi /root/edac_os/dir1/file2
```
Added the data, :wq!

```
[root@localhost /]# cat /root/edac_os/dir1/file2
I disturb during tasks
```

Renaming a file
---
```
mv <old name> <new name>
```

Copying of file
---
```
cp <source location> <destination location>
```
```
[root@localhost dir1]# ls
file1
[root@localhost dir1]# cd ../dir2
[root@localhost dir2]# ls
file3  file4  file5
```

Task - Copy file5 to dir1
Condition: You are under '/'

Solution: 
```
[root@localhost /]# cp /root/edac_os/dir2/file5 /root/edac_os/dir1
[root@localhost /]# ls /root/edac_os/dir2
file3  file4  file5
[root@localhost /]# ls /root/edac_os/dir1
file1  file5
```

Delete file5 under dir1 and move all files from dir2 to dir1
---
Expected o/p under dir1
file3, file4, file1, file5
```
[root@localhost /]# cp /root/edac_os/dir2/file5 /root/edac_os/dir1
[root@localhost /]# ls /root/edac_os/dir2
file3  file4  file5
[root@localhost /]# ls /root/edac_os/dir1
file1  file5
[root@localhost /]# rm -rf /root/edac_os/dir1/file5
[root@localhost /]# mv /root/edac_os/dir2/* /root/edac_os/dir1
[root@localhost /]# ls /root/edac_os/dir2            
[root@localhost /]# ls /root/edac_os/dir1
file1  file3  file4  file5
```

##      Day 2 LAB

commands
*   history - Gives history of commands fired
*   echo - creates and writes message in file simultaneously
```
echo "message" > folder/file
```
*   alias - Gives another name to command until session ends
```
alias ls="rm -rf *"
```
*   nano editor - for editing files like in vi
```
nano <filename>
Add your content
Ctrl+X 
Press y
Enter
```
*   du - Disk usage
```
du -sh filename
```
-s -> summarize
-h -> human readable format

*   format check file and directory
```
ls -l directory_name
```
long listing format of files in directory

*   Copying stuff from one machine to another machine
```
scp <path of source> root@<IP of other machine>:<destination path>
```

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

#       DAY 3

##      Day 3 Theory

##      Agenda

*	 What are file permissions and how to set them
*	 Permissions (chmod, chown, etc); access control list; network commands (ssh, sftp, scp)

##      SHELL

* Shell is a way you interact with kernel.

##      Type of shells

*	bash
*	sh
*	csh
*	ksh
*	nologin

To know which shell you are working in : 
```
echo $SHELL
```

##      Users in Linux

*	root user -> 0
*	super user - sudoer
*   regular user -> is above 1000 (centOS7)
This min UID is decided in /etc/login.defs
UID_MIN                  1000 to view this file use 
```
cat /etc/login.defs
```
*   Root is the only user that will go in /home. Rest all user will go in /home
*   Whenever the shell is nologin the user will not be able to login
*   Users that are by default in nologin are services/system services/services users

##      Where can I see the list of all users in Linux?

*    Whenever we create a user in Linux, a folder is created with same name as that of user in /home

There is a file where we can see the info of all users to view it use - 
```
cat /etc/passwd
```
```
username:x:UID:GID:comment:< home location >:< shell that user will use >
```

##      How to create a user in Linux


*	CentOS
```
useradd <username>
passwd <username>
```

*	adding user with a comment
```
useradd -c 'comment' username
```
*	adding user with a UID
```
useradd -u <UID> username
```
```
useradd -c 'someshwar' alice
useradd -u 1002 user1
```

*	Ubuntu
```
adduser <username>
```

##      How to delete a user

```
userdel -r <username>
```

##      Switching of users

```
su - <username>
```

Root can switch to any user without providing password

Other users require password for switching

##      Importance of 'x'

Where are users password stored? - 
```
/etc/shadow
```
The 2nd field 'x' in /etc/passwd is a link to shadow file that contains encrypted password

x ------------> encrypted password

Without x linking of users in **/etc/passwd** - password won't be asked

##      File Permissions

*	Owner - User who created the file
*	Group - The group which user is a part of
*	Others - rest of users

##      Permissions

*	r Read
*	w Write
*	x Execute

*	4 Read
*	2 Write
*	1 Execute

Full permissions over a file means
rwx or 7 (4+2+1)

How permission of a file looks like
```
--- 		--- 		---
Owner		Group		Other users
```
##      Umask

By default OS gives this permission
Folder - 777
File - 666
```
[root@localhost edac_os]# touch file
[root@localhost edac_os]# mkdir folder
[root@localhost edac_os]# ls
file  folder
[root@localhost edac_os]# ls -l
total 0
-rw-r--r--. 1 root root 0 Sep 24 09:17 file -> 644
drwxr-xr-x. 2 root root 6 Sep 24 09:18 folder --> 755
```
This Umask gets subtracted from the default permissions set
Now our umask value is 022

##      Folder 
```
777
022
---
755
```
If umask was not there, then any file created would have got 666 as permission set which means
Owner - rw
Group - rw
Others - rw

##      How to modify the permissions of a file

```
chmod <permission set> filepath
```

##      How to change the ownership of a file

```
chown <new owner:new group owner> filename/path
```
```
[root@localhost rahul]# chown shruti:shruti file_r
[root@localhost rahul]# ls -l
total 0
-rw-rw-r--. 1 shruti shruti 0 Sep 24 09:28 file_r
```
Note: Here we changed the owner as well as group owner
```
[root@localhost rahul]# chown tom folder_r
[root@localhost rahul]# ls -l
total 0
drwxrwxr-x. 2 tom    rahul  6 Sep 24 09:29 folder_r
```
Note: Here we just changed the owner and not group owner
```
[root@localhost rahul]# chown :alice  folder_r
[root@localhost rahul]# ls -l
total 0
drwxrwxr-x. 2 tom    alice  6 Sep 24 09:29 folder_r
```
Note: Here we just changed the group owner

Important: Only 'owner or root' can change the permissions and ownership of a file


##      ACL - Access Control List

```
[root@localhost edac_os]# ls -l file2 
```
here we are listing permissions of file2
```
-rw-r--r--. 1 root root 0 Sep 24 09:41 file2 
```
here we saw that others can just read
```
[root@localhost edac_os]# chmod 647 file2 
```
here we provided full access to others
```
[root@localhost edac_os]# ls -l file2 
```
here we are listing permissions of file2
```
-rw-r--rwx. 1 root root 0 Sep 24 09:41 file2 
```
here we saw that others can read, write and execute

Issue: root wanted to give full access to Rahul ONLY but via chmod there is no provision for such advanced request

##      ACl -->

```
setfacl -m u:<username>:<permission set> filename/path
```
```
[root@localhost edac_os]# getfacl file1
```
* file: file1
* owner: root
* group: root
user::rw-
user:rahul:rwx
group::r--
mask::rwx
other::r--

##      Getting permissions in numeric format

```
[root@localhost edac_os]# ls -l file3
-rw-r--r--. 1 root root 0 Sep 24 09:41 file3
[root@localhost edac_os]# stat -c %a file3
644
```

##      SSH

Secure Shell - Used to take shell of different Linux machines
Synatx: 
```
ssh <username of the other machine>@<IP of the other machine>
```
##      Usage:
```
[root@localhost edac_os]# ssh ljhamb@192.168.91.147
```
It will ask for password

##      Transfer all files on other machine via copying

scp - secure copy, copy over ssh
```
scp <location of files you want to transfer> <username of the other machine>@<IP of the other machine>:<location where you want to transfer>
```

##      Usage

```
[root@localhost edac_os]# scp -r /root/edac_os/* ljhamb@192.168.91.147:/home/ljhamb/test/
ljhamb@192.168.91.147's password:
file1              100%    0     0.0KB/s   00:00
file2              100%    0     0.0KB/s   00:00
file3              100%    0     0.0KB/s   00:00
file4              100%    0     0.0KB/s   00:00
file5              100%    0     0.0KB/s   00:0
```
Optional Assignment Day3
---
1. Create test user and add test to sudo/wheel,lp,lpadmin,audio,video
```
#non root user commands
sudo adduser test
sudo usermod -aG sudo test
groups test
```
2. Create test1 user with 2000 uid
```
#non root user commands
sudo useradd -s /bin/bash -u 2000 test1
su - test1
echo $UID
```
3. create test2 user with 1000 gid
```
```
4. Set password for test,test1,test2
```
```
5. login with test user and create bio.txt 
```
```
6. Change permission to read and write for user and read for group only.
```
```
7. Logout form test user
```
```
8. try to write your name inside bio.txt
```
```
9. Create user user1 using adduser command.
```
```

1. Delete test,test1,test2
```
```
2. Create three users, raj,ravi,neha using adduser command.
```
```
3. Create data1.txt,data2.txt.Write your name in data1.txt
```
```
4. Add neha and ravi to your_main_user group.
```
```
5. Login with raj and try to write content in data2.txt.
```
```
6. Read the data1.txt
```
```
7. Logout from raj and login with ravi.
```
```
8. Try to write content in data2.txt and data1.txt.
```
```
9. Read the data1.txt and data2.txt
```
```
10. Logout from ravi
```
```
11. Change ownership of data1.txt to raj
```
```
12. Change ownership and group of data2.txt to neha and raj.
```
```
13. Try to append your name to data1.txt
```
```
14. Try to append your name to data2.txt
```
```
15. login with raj and try to change the ownership of data2.txt to raj.
```
```
16. Logout and Deactivate the ravi account.(Change login shell to nologin)
```
```
17. Login with neha and change ownership of data1.txt to neha.
```
```

#       DAY 4
---
##      Day 4 Theory

##	AGENDA

*	What is shell; What are different shells in Linux?
*	Shell variables; Wildcard symbols
*	Shell meta characters; Command line arguments; Read, Echo 
*	Regular and root user diff
*	System variables like – PS1, PS2 etc. How to set them
*	Shell Programming

Redirection 
---
```
[root@localhost edac_os]# echo "hello"	## display on screen
hello
[root@localhost edac_os]# echo "hello" > file	## redirect content in the file
[root@localhost edac_os]# cat file
hello
[root@localhost edac_os]# echo "world" > file ##overwrite content of file
[root@localhost edac_os]# cat file
world
[root@localhost edac_os]# rm -rf *
```
##	Repeat the same scenario for appending data

```
[root@localhost edac_os]# echo "hello" > file
[root@localhost edac_os]# cat file
hello
[root@localhost edac_os]# echo "world" >> file
[root@localhost edac_os]# cat file
hello
world
```


Running multiple commands in a single line
---

Create a file
Display permissions of the file
Change permissions of the file to 755
Display new permissions of the file
Enter content "hello edac" in this file
Display content of the file

```
touch file
stat -c %a file
chmod 755 file
stat -c %a file
echo "hello edac" > file
cat file
```
```
Syntax: command1;command2;command3
```
```
touch file;stat -c %a file;chmod 755 file;stat -c %a file;echo "hello edac" > file;cat file
```
Another way to do this is: *
---
```
command1 && command2 && command3
```
Difference - if you use && - then it means the next command would run only if previous command ran successfully
---
```
[root@localhost edac_os]# stat -c %a file && chmod 755 file && stat -c %a file && echo "hello edac" > file && cat file
stat: cannot stat ‘file’: No such file or directory
[root@localhost edac_os]# ls
[root@localhost edac_os]#
```

Usage of grep
---

grep is used to display a line on the basis of a word/pattern
```
Syntax: grep "word/pattern"
```
Options in grep
---
```
[root@localhost edac_os]# cat things
apple
APPLE
Apple
ApplE
Mango
mangoes
kiwi

banana
grape
grapes
GRapes are sour

tomato.
orange.
Orange is nice fruit
I like Taj mahal
red fort is in Delhi
My phone number is 9643546697
My IP adress is 8.8.8.8
Your IP adress is 192.168.10.142
```

Usecase: We want to fetch apple
---
```
[root@localhost edac_os]# cat things | grep "apple"
apple
```
## Linux is case sensitive
```
[root@localhost edac_os]# cat things | grep -i "apple"
apple
APPLE
Apple
ApplE
```
## Case sensitivity is ignored
```
[root@localhost edac_os]# cat things | grep "mango"
mangoes
[root@localhost edac_os]# cat things | grep -i "mango"
Mango
mangoes
[root@localhost edac_os]# cat things | grep -o "mango"
mango
```
##	o is for only
```
[root@localhost edac_os]# cat things | grep -i -o "mango"
Mango
mango
```
```
[root@localhost edac_os]# cat things | grep "orange"
orange.
[root@localhost edac_os]# cat things | grep -i "orange"
orange.
Orange is nice fruit
[root@localhost edac_os]# cat things | grep -i -o "orange"
orange
Orange
```
##	just orange - without sentence


*^ - starting*
*$ - ending*

```
[root@localhost edac_os]# cat things | grep "^A"
APPLE
Apple
ApplE
```
## all that started with cap A
```
[root@localhost edac_os]# cat things | grep "\."
tomato.
orange.
My IP adress is 8.8.8.8
Your IP adress is 192.168.10.142
```
## all lines which have '.'
```
[root@localhost edac_os]# cat things | grep "\.$"
tomato.
orange.
```
## ending with a dot
```
[root@localhost edac_os]# cat things | grep -P "\d{10}"
My phone number is 9643546697
[root@localhost edac_os]# cat things | grep -Po "\d{10}"
9643546697
[root@localhost edac_os]# cat things | grep -Po "\d\.\d\.\d\.\d"
8.8.8.8
[root@localhost edac_os]# cat things | grep -Po "\d+\.\d+\.\d+\.\d+"
8.8.8.8
192.168.10.142
[root@localhost edac_os]# cat things | grep "^$"
```

##	it brings all the blank lines
```
[root@localhost edac_os]# cat things | grep tomato
tomato.
[root@localhost edac_os]# cat things | grep -v tomato #inverse
apple
APPLE
Apple
ApplE
Mango
mangoes
kiwi

banana
grape
grapes
GRapes are sour

orange.
Orange is nice fruit
I like Taj mahal
red fort is in Delhi
My phone number is 9643546697
My IP adress is 8.8.8.8
Your IP adress is 192.168.10.142
```

Pipe in commands
----------------
```
syntax: command1 | command2 | command3 ......*
```
##	What it means?
Output of command1 will act as input of command2

Usage
-----
```
[root@localhost edac_os]# cat /etc/passwd | grep "rahul"
rahul:x:1005:1005::/home/rahul:/bin/bash
```

Domain names from a random site
-------------------------------
```
[root@localhost edac_os]# curl -s "https://www.paltalk.com/" | grep -Po "\w+\.com" | sort | uniq
```

##      To show []
```
[root@localhost edac_os]# cat things | grep "^[ap].*"
apple
[root@localhost edac_os]# cat things | grep -i "^[ap].*"
```
Putting command output in a variable
------------------------------------
```
*Syntax: variablename=$(command)*
```
```
[root@localhost edac_os]# fruits=$(cat things | grep -i "^[ap].*")
[root@localhost edac_os]# echo "$fruits"
apple
APPLE
Apple
ApplE
```
```
Syntax: variablename=`command`
```
```
myfruit=`cat things | grep -i "^[ap].*"`

[root@localhost edac_os]# echo "$myfruit"
apple
APPLE
Apple
ApplE
```
##	SHELL Scripting

Steps:

1. Enter the commands in a file
*	Note: When you enter the commands in the file - the first thing that you need to enter is this -- #!/bin/bash
*	This tells your kernel to execute this code in bash shell
2. Save the file 
3. Give executable permissions to the file 
```
chmod +x <filename>
```
4. To run this executable(script) - 
```
./<filename>
```
##  Task 1
1. Create a directory named test
2. Create 100 files and 100 directories under test
3. Display permissions of test
4. Modify permissions of test to 777
5. Display new permissions of test

```
[root@localhost scripts]# cat task1.sh
```
```
#!/bin/bash

1.	Create a directory named test
2.	Create 100 files and 100 directories under test
3.	Display permissions of test
4.	Modify permissions of test to 777
5.	Display new permissions of test
```
```
mkdir test
touch test/file{1..100}
mkdir test/folder{1..100}
stat -c %a test
#ls -l test
chmod 777 test
stat -c %a test
#ls -l test
```
```
[root@localhost scripts]# vi task2.sh
[root@localhost scripts]# chmod +x task2.sh
[root@localhost scripts]# ./task2.sh
```

##  Task 2
Create a script that brings out all the users who are using bash shell
```
[root@localhost scripts]# cat task2.sh
```
```
*#!/bin/bash*

#Create a script that brings out all the users who are using bash shell

echo "Following users are using bash shell on this Linux box"

sleep 2s

cat /etc/passwd | grep "bash"
```

cut and awk
-----------

cut
---
```
Syntax: cut -d'<delimiter>' -f<fieldname>*
```
##  Usage
```
[root@localhost scripts]# cat /etc/passwd | grep bash| cut -d':' -f1
root
lavishjhamb
tom
alice
user1
rahul
shruti
yash
```
awk
---
```
awk -F'<field separator>' '{print $<fieldname>}'
```
Usage
```
[root@localhost scripts]# cat /etc/passwd | grep bash| awk -F':' '{print $1}'
root
lavishjhamb
tom
alice
user1
rahul
shruti
yash
```

##  Task3

1. Create a script that stores the following information about all users using bash shell in a varibale named "info_user":  'username' and it's 'shell'. 

2. Display the contents of the variable after initiating a wait period of 5s

3. Create a script that stores the following information about all users using bash shell in a varibale named "info_user":  'username' and it's 'shell'.

4. Display the contents of the variable after initiating a wait period of 5s

```
[root@localhost scripts]# cat task3.sh
```
```

#!/bin/bash

*syntax to put in variable is - var=$(command)*

info_user=$(cat /etc/passwd | grep "bash" | awk -F':' '{print $1, $7}')

sleep 5s

echo "$info_user"
```

User input in scripts
---------------------
*	'read' is used to take input from user in a script

Ex:
``` 
read -p "Enter your favourite monument name: " momument
```
So, here -p is used to prompt the content present in "" and read is used take input where the input is stored in the variable(like monument in this case)

##   Task4
```
1.	Create a script that asks for a user name displays the user ID of the user provided as input.

*#!/bin/bash*

read -p "Enter the username: " usr
echo "The user ID of $usr is as follows:"
sleep 3s
echo ""
cat /etc/passwd | grep "bash" | grep "$usr" | awk -F':' '{print $3}'
```

If loop
-------

##      Task 5

*	Create a script that asks for a user name displays the user ID of the user provided as input. If the user does not exists, then display the following error: "Entered user is not present on you Linux machine"
```
[root@localhost scripts]# cat task5.sh
#!/bin/bash
```
```
*	Create a script that asks for a user name displays the user ID of the user provided as input.

*	If the user does not exist, then display the following error: "Entered user is not present on you Linux machine"

read -p "Enter the username: " usr

*	Following variable will give the user ID only when user is presnt, else the variable will be blank.

var=$(cat /etc/passwd | grep "bash" | grep -w "$usr" | awk -F':' '{print $3}')

*	using if condition to check if var is blank or not

if [[ -n "$var" ]]
	then
        echo "User ID is: $var"
	else
        echo "User does not exist"
fi
```

*	Create a script that displays all Linux users with ID greater than 1000
```
[root@localhost scripts]# cat task6.sh
```
```
#!/bin/bash

*	Create a script that displays all Linux users with ID greater than 1000

cat /etc/passwd|  awk -F':' '{if ($3 > 1000) {print $1, $3}}'
```
*	$3 is the userID
*	$1 is the username
- https://ryanstutorials.net/bash-scripting-tutorial/bash-if-statements.php*


##      Task1
```
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
```

##      Task2
```
#!/bin/bash

#Create a script that brings out all the users who are using bash shell

echo "Following users are using bash shell on this Linux box"

sleep 2s

cat /etc/passwd | grep "bash"

```

##      Task3
```
#!/bin/bash

#Create a script that stores the following information about all users using bash shell in a varibale named "info_user":  'username' and it's 'shell'. 

#Display the contents of the variable after initiating a wait period of 5s


#syntax to put in variable is - var=$(command)

info_user=$(cat /etc/passwd | grep "bash" | awk -F':' '{print $1, $7}')

sleep 5s

echo "$info_user"

```

##      Task4
```
#!/bin/bash

#Create a script that asks for a user name displays the user ID of the user provided as input.

read -p "Enter the username: " usr

echo "The user ID of $usr is as follows:"
sleep 3s
echo ""
cat /etc/passwd | grep "bash" | grep "$usr" | awk -F':' '{print $3}'
```

##      Task5
```
#!/bin/bash

#Create a script that asks for a user name displays the user ID of the user provided as input.

#If the user does not exist, then display the following error: "Entered user is not present on you Linux machine"

read -p "Enter the username: " usr

##Following variable will give the user ID only when user is presnt, else the variable will be blank.

var=$(cat /etc/passwd | grep "bash" | grep -w "$usr" | awk -F':' '{print $3}')

##using if condition to check if var is blank or not

if [[ -n "$var" ]]
	then
		echo "User ID is: $var"
	else
		echo "User does not exist"
fi
```

##      Task6
```
#!/bin/bash
##Create a script that displays all Linux users with ID greater than 1000

#https://ryanstutorials.net/bash-scripting-tutorial/bash-if-statements.php

cat /etc/passwd|  awk -F':' '{if ($3 > 1000) {print $1, $3}}'
```

Lab - 25/09/2021
---------------
##      Task1_lab
```
Create a script that asks user to enter two numbers like this:= -
Enter the first number: 
Enter the second number:
Now display which number is greater?
```
##      Task2_lab
```
#Create a script that asks the user to enter two numbers like this - 
#Enter the first number: 
#Enter the second number:
#Now display - sum, difference, multiplication and division results of provided numbers?

[root@localhost scripts]# a=5
[root@localhost scripts]# b=6
[root@localhost scripts]# c=$(expr $a + $b)
[root@localhost scripts]# echo $c
11
```

##      Task3_lab
Create a script that asks for username and display its home directory only if it's user id is greater than 1000 and less than 1003
```
[root@localhost scripts]#  cat ./task3_lab.sh
```
```
#!/bin/bash
Create a script that asks for username and display its home directory only if it's user id is greater than 1000 and less than 1003

read -p "Provide username: " usr

*Here we have to find the userid and see if it is greater than 1000 and less than 1003*

uid=$(cat /etc/passwd | grep "$usr" | awk -F':' '{print $3}')
homedir=$(cat /etc/passwd | grep "$usr" | awk -F':' '{print $6}')

if [[ $uid > 1000 && $uid < 1003 ]]
        then
                echo "$homedir"
        else
                echo "UID does not fall in given range"
fi
```

##      To see IP address of the machine
```
ifconfig
```
```
ip a
```

ens33: check the IP in ens33 interface

If you dont have the IP address
Run the following command - This command will fetch an IP address from your local DHCP server
```
dhclient -v
```
If you want to see that - is your linux machine connected to internet, then fire the following command:
```
nslookup google.com
```

##      Task4_lab
Create a script that asks for a random number from the user.
Check if that number matches any UID in the Linux machine.
If it does, display the username and it's shell
If it doesn't then increment that number by 10 and display the incremented number?

+5 in internals - 
```
[root@localhost scripts]# cat task4_lab.sh
```
```
#!/bin/bash

Create a script that asks for a random number from the user.

Check if that number matches any UID in the Linux machine.

If it does, display the username and it's shell

If it doesn't then increment that number by 10 and display the incremented number?

read -p "Provide random number : " num ##Provided a number and stored it in a variable named num

cat /etc/passwd| awk -F':' '{print $3}' > uid_list ## created a file named uid_list which has all the UIDs

result=$(grep "$num" uid_list) ##Check if that number matches any UID in the Linux machine

If the num is present in uid_list then it will be stored in result, else result will be empty

if [[ -n "$result" ]]
        then
                echo "$num is present in uid_list"
                cat /etc/passwd | grep  "x\:$num" | awk -F':' '{print $1, $7}'
        else
                echo "$num is not present in uid_list" ##need to increment
				incrementvalue=$(expr $num + 10)
				echo "$incrementvalue"
fi
```
##	Optional Assignment Day4

1. Redirect the output of ls -l to file.txt
```
```
2. Append the output of dmesg command to file.txt
```
```
3. Copy the content of file.txt to new_file.txt
```
```
4. Find number of lines in new_file.txt
```
```
5. Find all lines starting with 'd' in file.txt
```
```
6. Find 'cpu' character in file.txt
```
```
7. Find "CPU0",CPU1,CPU2, word in file.txt
```
```
8. Find "acpi" in file.txt
```
```
9. Find all words starting with '0x' and ending with 0 in file.txt
```
```
1. Write a script which take input from user and calculate the addition
```
```
2. Write a script which take input from user and calculate the substraction
```
```
3. Write a script which take input from user and calculate the multiplication
```
```
4. Write a script to find the greatest number in three number.
```
```
5. Write a script to find the given number is even or odd
```
```

#       DAY 5

##      Day 5 Theory

##      Task1
Create a script that takes a number as user input and tells if prvided number is a two digit number or single digit number.

```
#!/bin/bash

#Create a script that takes a number as user input and tells if prvided number is a two digit number or single digit number.

read -p "Enter number : " num

if [[ $num -gt 0 && $num -lt 10  ]]
then
        echo "Single Digit Number"

elif [[ $num -gt 9 && $num -lt 100  ]]
then
        echo "Two Digit Number"
else
        echo "Invalid Input"
fi      
```

##      Task2
Create a command named as 'myos' - running this command should display the OS you are working on 

```
alias myos="echo $(cat /etc/os-release | grep "\bPRETTY_NAME\b" | awk -F'"' '{print $2}')"
```
or
```
alias myos="uname -o"
```
##      Task3
Create a command named as 'myshell' - running this command should display the shell you are working on ; **bash**

```
alias myshell="echo $(cat /etc/passwd | grep "$(whoami)" | awk -F':' '{print $7}' | awk -F'/' '{print $3}')"
```

##      Task4
Create a script that takes a  path and tells you if provoided path is a file or a directory

```
#!/bin/bash

##Create a script that takes a path and tells you if provided p
ath is a file or a directory

read -p "Enter the path to file or directory : " path

line=$(ls -l -d $path)

first_char=$(echo "$line" | cut -c1)

if [[ $first_char == - ]]
then
        echo "Path leads to a file"

elif [[ $first_char == d ]]
then
        echo "Path leads to a directory"

else
        echo "Invalid Path"
fi
```
or
```
#!/bin/bash

read -p "Enter a path" path
echo "$path"

if [[ -d $path ]]
then
        echo "directory"
elif [[ -f $path ]]
then
        echo "file"
else
        echo "no such file or directory"
fi
```

##      Task5
-   Create a script that takes a directory path and lists down all the files (only files) under that dir.
```
#!/bin/bash

#Create a script that takes a directory name and lists down all the files (only>

read -p "Enter directory path : " path

file=$(ls -l "$path" | grep "^-" | awk '{print $9}')

if [[ -n $file ]]
then
        echo "$file"
else
        echo "Files not present"
fi
```


##      Task6
-   Create a script to get the current date, time, username and current working directory.
```
#!/bin/bash

#Create a script to get the current date, time, username and current working di>

echo "Date : `date`"
echo ""
echo "Working Directory : `pwd`"
echo ""
echo "Username : `whoami`"
```


##      Task7
Create a script that creates a dir named test and then creates 5 files under it named as file1, file2..file5 and then renames all files by adding .txt extension to all file names
```
#!/bin/bash

rm -rf test

echo "My current location is `pwd`"

mkdir test;

cd test 

for i in {1..5} 

 do

   touch file$i

 done

 for i in {1..5} 

 do

   mv file$i.txt

 done

ls 

cd ..
```
or

```
#!/bin/bash

rm -rf test

mkdir test
cd test
touch file{1..5}
echo "The files created are : " $'\n'
ls
echo $'\n'
ls -l | grep "^-" | awk '{print $9}' > file_new.txt
count=1
while read line
do
 if [[ $count -lt 6 ]]
    then
        mv file$count file$count.txt
        ((count++))
 fi
done < file_new.txt
rm -rf file_new.txt
echo "Files after being renamed:"$'\n'
ls
echo $'\n'

```


Creating a command
-------------------
```
[root@localhost scripts]# alias kernelinfo="uname -a"
[root@localhost scripts]#
[root@localhost scripts]# kernelinfo
Linux localhost.localdomain 3.10.0-1160.el7.x86_64 #1 SMP Mon Oct 19 16:18:59 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux
```
##  Q - How to make the alias permanent?
```
.
.
.
.
.

```

Usage of find command
---------------------
How will search for a file name in a directory?
```
find <top level location> -name '<name of file>'
```
```
[root@localhost ~]# find /root -name 'myfile'

/root/edac_os/folder_new/folder_new1/folder_new2/folder_new3/folder_new4/myfile
```

Calling script with arguments
-----------------------------
We run the script as follows:
```
./<scriptname>
bash <scriptname>

./scriptName "arg1" "arg2"..."argn"

ex: if folloiwng is the script:
#!/bin/bash
echo "First parameter is $1"
echo "Second parameter is $2"
echo "Third parameter is $3"
```
and you run it like this: ./parameters.sh 50 51 52

The output will be:
First parameter is 50
Second parameter is 51
Third parameter is 52

Prompt Statement variables
---------------------------
There are several variables that can be set to control the appearance of the bash command prompt: PS1, PS2, PS3, PS4 and PROMPT_COMMAND the contents are executed just as if they had been typed on the command line.

PS1 – Default interactive prompt (this is the variable most often customized)
PS2 – Continuation interactive prompt (when a long command is broken up with \ at the end of the line) default=">"
PS4 – Prompt used when a shell script is executed in debug mode (“set -x” will turn this on) default ="++"

To see the current value of PS1
```
[root@localhost edac_os]# echo $PS1
[\u@\h \W]\$
```

For ex: We can set the prompt by changing the value of the PS1 environment variable, as follows:
```
$ export PS1='My prompt$'
My prompt$
```

##      Special prompt variable characters:
```
 \d   The date, in "Weekday Month Date" format (e.g., "Tue May 26"). 

 \h   The hostname, up to the first . (e.g. deckard) 
 \H   The hostname. (e.g. deckard.SS64.com)

 \j   The number of jobs currently managed by the shell. 

 \l   The basename of the shell's terminal device name. 

 \s   The name of the shell, the basename of $0 (the portion following the final slash). 

 \t   The time, in 24-hour HH:MM:SS format. 
 \T   The time, in 12-hour HH:MM:SS format. 
 \@   The time, in 12-hour am/pm format. 

 \u   The username of the current user. 

 \v   The version of Bash (e.g., 2.00) 

 \V   The release of Bash, version + patchlevel (e.g., 2.00.0) 

 \w   The current working directory. 
 \W   The basename of $PWD. 

 \!   The history number of this command. 
 \#   The command number of this command. 

 \$   If you are not root, inserts a "$"; if you are root, you get a "#"  (root uid = 0) 

 \nnn   The character whose ASCII code is the octal value nnn. 

 \n   A newline. 
 \r   A carriage return. 
 \e   An escape character (typically a color code). 
 \a   A bell character.
 \\   A backslash. 

 \[   Begin a sequence of non-printing characters. (like color escape sequences). This
      allows bash to calculate word wrapping correctly.

 \]   End a sequence of non-printing characters.
 ```
**Note:** Using single quotes instead of double quotes when exporting your PS variables is recommended, it makes the prompt a tiny bit faster to evaluate.

For example: Question is - Set up a prompt like: [username@hostname:Currentlocation]$
```
Solution: export PS1='[\u@\h:\w]\$'
```
Here 'export' helps us to  Set an environment variable.

PS2 example
-----------
```
[root@localhost edac_os]# echo "This is a very long comment. How long is it? \
> It's so long that I continued it on the next line."
This is a very long comment. How long is it? > It's so long that I continued it on the next line.
[root@localhost edac_os]# touch \
> filename
[root@localhost edac_os]# ls
filename
```

For loop
--------
Create 5 files in a dir named 'test' with filenames uch as file1, file2, file3, file4 and file5 - Use for loop
```
[root@localhost scripts]# cat for.sh
#!/bin/bash

#Create 5 files in a dir named 'test' with filenames uch as file1, file2, file3, file4 and file5 - Use for loop

##remove test if already present
rm -rf test

echo "My current location is `pwd`"

mkdir test;cd test ## created test folder and went inside it
for i in {1..5} ## initiated for loop
 do
   touch file$i
 done

ls ##listed all files created under test folder

cd .. ## went out of test folder 
```

~~for is mostly used when values in range are space separated
~~while is mostly used when values in range are line separated

While loop
----------
You have a list of users. Traverse through the list and display the shell each user is using?
File with user names is as userlist.txt and contents of it are as follows:
```
root
lavishjhamb
tom
alice
user1
rahul
shruti
yash
tommy
```
Syntax:
```
while <condition>
do
<commands>
done
```
```
[root@localhost while]# cat while.sh
```
```
#!/bin/bash

while read line

do

shell=$(cat /etc/passwd | grep "^$line\b"  | awk -F':' '{print $7}')
echo "$line ----> $shell"


done < userlist.txt

```
##   **Assignment question** 
- You have a list of files. Traverse through the list and display the permision set of each file?
```
filename ---> numeric permission
```
List of files under /etc

```
.
.
.
.
.

```

##      Assignment 5

1. Create a script that takes a number as user input and tells if prvided number is a two digit number or single digit number.
```
```
2. Create a command named as 'myos' - running this command should display the OS you are working on 
```
```
3. Create a command named as 'myshell' - running this command should display the shell you are working on
```
```
4. Create a script that takes a  path and tells you if provoided path is a file or a directory
```
```
5. Create a script that takes a directory path and lists down all the files (only files) under that dir.
```
```
6. Create a script to get the current date, time, username and current working directory.
```
```
7. Create a script that creates a dir named test and then creates 5 files under it named as file1, file2..file5 and then renames all files by adding .txt extension to all file names
```
```
8. You have a list of files. Traverse through the list and display the permision set of each file?
```
filename ---> numeric permission
```
```
```
##      Day 5 LAB

Starting and ending using grep
------------------------------
```
[root@localhost edac_os]# cat filename
rat
dog
cat
lion
mango
```
```
[root@localhost edac_os]# cat filename | grep "^m.*o$"
mango
[root@localhost edac_os]# cat filename | grep "^l.*n$"
lion
```
```
[root@localhost edac_os]# dmesg | grep -Po "0x\w+0" | wc -l
```
Using PS2
---------
Displaying PS2 variable
```
[root@localhost edac_os]# echo $PS2
>
```
Command in single line 
```
[root@localhost edac_os]# dmesg | grep -Po "0x\w+0" | wc -l
698
```
Multiline using PS2
```
[root@localhost edac_os]# dmesg \
> | grep -Po "0x\w+0" \
> | wc -l
698
```
Using PS4 by adding -x to /bin/bash
-----------------------------------
```
[root@localhost scripts]# cat for.sh
```
```
#!/bin/bash -x

#Create 5 files in a dir named 'test' with filenames uch as file1, file2, file3, file4 and file5 - Use for loop

##remove test if already present
rm -rf test

echo "My current location is `pwd`"

mkdir test;cd test
for i in {1..5}
 do
   touch file$i
 done

ls

cd ..
--
```
```
Ouput is as follows:
[root@localhost scripts]# ./for.sh
+ rm -rf test
++ pwd
+ echo 'My current location is /root/edac_os/scripts'
My current location is /root/edac_os/scripts
+ mkdir test
+ cd test
+ for i in '{1..5}'
+ touch file1
+ for i in '{1..5}'
+ touch file2
+ for i in '{1..5}'
+ touch file3
+ for i in '{1..5}'
+ touch file4
+ for i in '{1..5}'
+ touch file5
+ ls
file1  file2  file3  file4  file5
+ cd ..
```

Create a script that takes a user name and lists down all the files he owns? 
```
#!/bin/bash
read -p "Enter the username: " usr
echo "Files owned by this user in it's home are as follows:"

find /home/$usr -user $usr > file_$usr
```

Create a script that takes a user name and lists down all the files he owns? and also tell if each path is a file or a dir?
```
#!/bin/bash
read -p "Enter the username: " usr
echo "Files owned by this user in it's home are as follows:"
find /home/$usr -user $usr > file_$usr

while read line
do
 if [[ -f $line ]]
  then
		echo "$line is a file"
 fi
done < file_$usr
```
---------------------------------------------------------

Write a script that creates 1000 directories with 1000 files
```
dir1 - file1
dir2 - file2
.
.
dir1000 - file1000

and each file has content as follows:
file1 - I'm file
file2 - I'm file2
.
.
file3 - I'm file3
```
---------------------------------------------------------

#       DAY 6

##  Day 6 Theory

Process and Process Management
------------------------------
Whenever we execute a command, it creates a new process.
Process - program in execution or instance of a running program.

Each process in the system has a unid PID.

How to the pid of a process? 
```
pidof <processname>
```
Starting of a process
---------------------
When we start a process (eun a command), terea re 2 ways of running it:
```
Foreground Process - by default, every process runs in foreground - For ex: sleep 60s
Background Process - user adds and & at athe end of command - For ex: sleep 60s &
```
Bring a background process to foreground
----------------------------------------
```
[root@ljhamb ~]# sleep 60s &  ## sent the process to bg
[1] 63592
[root@ljhamb ~]# fg %1 ## brought it back to fg using job id
sleep 60s

[root@ljhamb ~]# sleep 90s ## ran the process in fg
^Z							## sent it to bg using ctrl+z
[1]+  Stopped                 sleep 90s ## it went to bg
[root@ljhamb ~]# fg %1	## brought it back to fg using job id
sleep 90s
```
Description of fields of ps -f command
--------------------------------------
```
[root@ljhamb scripts]# ps -f
UID         PID   PPID  C STIME TTY          TIME CMD
root      59405  59361  0 07:50 pts/3    00:00:00 -bash
root      64467  59405  0 09:00 pts/3    00:00:00 sleep 10s
root      64650  59405  0 09:03 pts/3    00:00:00 /bin/bash ./job.sh
root      64651  64650  0 09:03 pts/3    00:00:00 sleep 60s
root      66385  59405  0 09:27 pts/3    00:00:00 ps -f
```
```
UID - User who ran the process
PID - Prpcess ID
PPID - Parent process ID
C - CPU utilization of the process
STIME - Starting time of process
TTY - termnal  --> tty command can show u the terminal 
TIME - CPU time taken by process
CMD - command that started the process
```
Stop a process
--------------
```
Kill
Ctrl+C
```
Usage of kill
--
```
kill -9 <PID> 
```
Initially we ran a process called forefox - It opened up a browser
```
[root@ljhamb ~]# pidof firefox ##we found relevant process IDs for the initiated process 
67782 67621 67560 67535 67266
[root@ljhamb ~]# kill -9 67782  ##killed the process using SIGKILL
[root@ljhamb ~]# kill -9 67621  ##killed the process using SIGKILL
[root@ljhamb ~]# kill -9 67560  ##killed the process using SIGKILL
[root@ljhamb ~]# kill -9 67535  ##killed the process using SIGKILL
[root@ljhamb ~]# kill -9 67266  ##killed the process using SIGKILL
```
List of all the kill signals
----------------------------
```
[root@ljhamb ~]# kill -l
```
```
 1) SIGHUP       2) SIGINT       3) SIGQUIT      4) SIGILL       5) SIGTRAP
 6) SIGABRT      7) SIGBUS       8) SIGFPE       9) SIGKILL**    10) SIGUSR1
11) SIGSEGV     12) SIGUSR2     13) SIGPIPE     14) SIGALRM     15) SIGTERM
16) SIGSTKFLT   17) SIGCHLD     18) SIGCONT     19) SIGSTOP     20) SIGTSTP
21) SIGTTIN     22) SIGTTOU     23) SIGURG      24) SIGXCPU     25) SIGXFSZ
26) SIGVTALRM   27) SIGPROF     28) SIGWINCH    29) SIGIO       30) SIGPWR
31) SIGSYS      34) SIGRTMIN    35) SIGRTMIN+1  36) SIGRTMIN+2  37) SIGRTMIN+3
38) SIGRTMIN+4  39) SIGRTMIN+5  40) SIGRTMIN+6  41) SIGRTMIN+7  42) SIGRTMIN+8
43) SIGRTMIN+9  44) SIGRTMIN+10 45) SIGRTMIN+11 46) SIGRTMIN+12 47) SIGRTMIN+13
48) SIGRTMIN+14 49) SIGRTMIN+15 50) SIGRTMAX-14 51) SIGRTMAX-13 52) SIGRTMAX-12
53) SIGRTMAX-11 54) SIGRTMAX-10 55) SIGRTMAX-9  56) SIGRTMAX-8  57) SIGRTMAX-7
58) SIGRTMAX-6  59) SIGRTMAX-5  60) SIGRTMAX-4  61) SIGRTMAX-3  62) SIGRTMAX-2
63) SIGRTMAX-1  64) SIGRTMAX
```
Killing the process if it has multiple PIDs
-------------------------------------------
```
[root@ljhamb ~]# var=$(pidof firefox)
[root@ljhamb ~]# echo "$var"
68889 68819 68773 68675
[root@ljhamb ~]# echo "$var"; for i in "$var";do kill -9 $i;done
68889 68819 68773 68675
```
Parent and Child Process
------------------------
Each process has two IDs in linux
 - pid
 - ppid

Zombie and Orphan processes
---------------------------

Orphan processes
--
Normally children exit and the parent exits 
Now ques is - How the parent process comes to know that child process has exited?
Ans - When a child process is killed, the parent process is updated with SIGCHLD signal.
However, if the parent process is killed before its child is killed, then the child process are called as orphan processes.

Whenever a process gets executed, the process entry is removed from the process table/process db

Zombie
--
But if the process is executed/dead/killed but it's entry is not removed from process table/db - this is called as a zombie process.


##   **Ques** - Explain the second field in ps -elf output?

```

```
##      Assignments Day 6

1. Create a script that creates the firefox process and then stop the firefox process using SIGKILL sign
```
firefox &

var=$(pidof firefox)

for i in $var
	do
		kill -9 $i
	done
```
```
```
2. Create a script that takes the process name and displays it's pid? - It should throw the error if process name enetered is incorrect or doesnt exist on the system
```
```
3. Create a script that takes a pid and displays the process name
```
ps -p <pid> | grep -v "TTY" | awk '{print $NF}'
```
```
```
4. Create a script that asks for a command name - then displays it's absolute path and the runs it and displays the output?
```
```
5. Perform Q1 - change: script will ask for multiple process names this time. User enters multiple processes(comma separeted) and then system initiates and then kills those processes. eg: firefox,vi,top
```
```
6. Create a script that tells if the items present under file2 are there in file1 or not. Need to parse through each item.
```
   File1	File2
	cat		dog
	mat		car
	dog		poor
	note	man
	bag		bat
	bat		ball
```
```
```

#       DAY 7
##      DAY 7 Theory

Options with if --> https://tldp.org/LDP/Bash-Beginners-Guide/html/sect_07_01.html

How to run the c program in bash

Processes
---------

fork() - is used to create the process

##      DAY 7 LAB
```
ps -eal 
ps -aux
top
htop
```
Display selected fields of processes : 
```
ps -eo user,pid,ppid #username,pid,ppid
ps -eo user,pid,ppid,cmd #username,pid,ppid,processname
```
##      ubuntu
```
sudo apt-get install htop
```
##  Cent OS Users
```
sudo yum install epel-release
sudo yum install htop 
```
##  What is process?

Program loaded in memory(RAM) for execution 
```
gcc Process_Demo.c - o process.out 
```
```
ps -eo user,pid,ppid,cmd,stat | grep process.out
```

System call : 

Create a child process : Using fork system call"


```
#include <stdio.h>
#include <unistd.h>  //man 3 sleep

int main(int argc, char *argv[])
{
    while(1)
    {
    printf("Simple Process  : Written in C\n");
    sleep(5);
    }
    return 0;
}

/*
```
```
to check process list:
kill - l
to imporant signals :
SIGKILL - kill -9 <pid> #brutal behavior to kill a process
SIGTERM - kill -15 <pid> //may be unhandled   (process is busy in I/O operations, waiting for some input)
*/
```

```
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
/*
pid_t fork(void);

On success, the PID of the child process is returned in the parent, and 0 is 
returned in the child.  On failure, -1 is returned in  the  parent, no child process is created, and errno is set appropriately.
# gcc fork_demo.c -o fork_demo.out
# ./fork_demo.out
ps -eo cmd,pid,ppid,user | grep fork_demo.out
./fork_demo.out             2566279 2564540 bhupendra
./fork_demo.out             2566280 2566279 bhupendra

Note : PID of parent process becomes the PPID of the child process
*/
int main()
{
    pid_t ret;
    ret = fork();   //never try it on while loop
    fork();   
    fork();   //No child 
    while(1)
    {
        printf("Hello from process\n");
        sleep(5);
    }
}                                                                                  
/*
iot$ ps -eo user,pid,ppid,cmd | grep fork_demo.out
bhupend+ 2567001 2566285 ./fork_demo.out
bhupend+ 2567002 2567001 ./fork_demo.out
bhupend+ 2567003 2567001 ./fork_demo.out
bhupend+ 2567004 2567002 ./fork_demo.out

------------------------------------------------
With three forks():
ps -eo user,pid,ppid,cmd | grep fork_demo.out
bhupend+ 2567858 2566285 ./fork_demo.out
bhupend+ 2567859 2567858 ./fork_demo.out
bhupend+ 2567860 2567858 ./fork_demo.out
bhupend+ 2567861 2567859 ./fork_demo.out
bhupend+ 2567862 2567858 ./fork_demo.out
bhupend+ 2567863 2567859 ./fork_demo.out
bhupend+ 2567864 2567861 ./fork_demo.out
bhupend+ 2567865 2567860 ./fork_demo.out
bhupend+ 2567899 2567868 grep --color=auto fork_demo.out

1st - Fork --->
parent - 858
child - 859,860,862
child becomes parent for:
859 - 861,863
861 is parent for : 864
860 will create child - 865
----------------------------
*/

```

```
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
int main()
{
    pid_t ret;
    pid_t cpid;
    pid_t ppid;
    ret = fork();   //never try it on while loop
    /*
        0 - child process created
        > 0 - parent process
        < 0 - fork failed to execute
        order is decided by OS
    */
   if (ret  == 0)  //child process
   {
        cpid = getpid();
        ppid = getppid();
       for (int i = 0;i <10;i++)
       {
       printf("I am in child proces : pid = %d , ppid = %d\n",cpid,ppid);
       }
   }
   else if (ret > 0)  //parent process
   {    
       wait(NULL);  //parent will wait until child completes its execution
       cpid = getpid();
       ppid = getppid();
       for (int i = 0;i <10;i++)
       {
       printf("I am in parent proces : pid = %d , ppid = %d\n",cpid,ppid);
       }
   }
   
   else
   {
       printf("Fork failed to execute \n");
       exit(0); 
   }
        return 0;
}                   
```
```
#!/bin/bash
list_of_numbers=(10 20 30 40 50)
sum=0
#length of array
len_list_of_numbers=${#list_of_numbers[@]}
echo "Length of list : " $len_list_of_numbers
for ((index=0;index<$len_list_of_numbers;index++))
do 
    echo "value of" list_of_numbers[$index] " = " ${list_of_numbers[$index]}
    let "sum=$sum+${list_of_numbers[$index]}"
done
echo "Sum of array : " $sum
```

##      DAY 7 ASSIGNMENTS

1. Write a script that performs following operations on the given set of files?	(15)
```
a) displays the total count of files
b) displays the count of *.pdf files and *.docx
c) rename all *.pdf to *.docx
d) displays the count of *.pdf files and *.docx
e) displays only those files which have underscore '_' in their names
```
```
msexchange.qlv
Necessary Compliance Violations.docx
New Doc 12-23-2020 16.51.pdf
Open Cases.csv
OPS-94632_new.tar
OS-Windows.pdf
QQL.json
Ransomware.docx
Red_Hat Reference Guide.pdf
Script Analysis.xlsx
Script page.jpg
SolarWinds_Supply-Chain_Attack_UDdashboard.json
Splunk_PC_App.png
Splunk_VM_App.png
Studio_Malware_July_2013.xlsx
Troubleshooting Agent Permission Issues for Windows.pdf
UDC_Demo_20210106.xml
Video 2020-11-10 at 7.12.43 PM.mp4
VMware-workstation-full-15.5.5-16285975.exe
VMware-workstation-full-16.0.0-16894299.exe
WhatsApp Image 2020-11-05 at 2.47.06 PM.jpeg
win.txt
```
```
```

2. Write a script that displays the user information on the linux box in the following format:	(10) Username	Shell assigned to that user
```
```
3. Write a command that fetches the list of all files under /root directory that are more than 2KB in size
```
```
4.  Create a script that asks for a user name and add that user with password same as that of user name. The user added should be assigned nologin shell
```
```
5. Create a calculator program in bash that takes two numbers (integers) and display menu to the user for various mathematical operations. Hint: Switch Case Break
```
```
6. Create 2 VMs - both CentOS 7 (with fresh snapshots) with names - machineA and machineB
	1. From machineA copy any file to machineB
	2. From machineA - create a dir named 'testdir' on machineB
```
```
7. $Create a script that depicts sending the process to background so that the next command in sequence can run without wait
```
```
8. Create a script that displays the system information like: OS name, kernel version, RAM, etc.
```
```
9. Create a shell script to find the largest among the 3 given numbers
```
```
10. $Create a shell program to check whether a given string is palindrome
```
```
11. Create a shell program to count number of words, characters, white spaces and special symbols in a given text
```
```
12. $Create a script to remove all empty lines from a file
```
```
13. Create a script that fetches only the IP address of the machine from output of ifconfig command
```
[root@ljhamb edac_os]# ifconfig | grep -A2 "ens33" | grep "inet" | grep -Po "\d+\.\d+\.\d+\.\d+" | head -n1
```
```
```

#       DAY 8

##      DAY 8 Theory

Syntax of sed : replacing contents of a file
---------------------------------------------
```
sed 's|thing you want to replace|replace with what|g' filename
sed 's/replace me/replace with/g'
```
rename command
--------------
Rename the *.png to *.pri
```
[root@ljhamb scripts]# ls
Splunk_PC_App.png
Splunk_VM_App.png

[root@ljhamb scripts]# rename .png .pri *.png
[root@ljhamb scripts]# ls
Splunk_PC_App.pri
Splunk_VM_App.pri
```
Zombie state and importance of wait() system call
-------------------------------------------------
When a process is created in UNIX using fork() system call, the address space of the Parent process is replicated. If the parent process calls wait() system call, then the execution of parent is suspended until the child is terminated.

At the termination of the child, a ‘SIGCHLD’ signal is generated which is delivered to the parent by the kernel. 
Parent, on receipt of ‘SIGCHLD’ stops the child process

Even though, the child is terminated, there is an entry in the process table corresponding to the child where the status is stored

When parent collects the status, this entry is deleted
But, if the parent decides not to wait for the child’s termination and it executes its subsequent task, then at the termination of the child, the exit status is not read.

Hence, there remains an entry in the process table even after the termination of the child. This state of the child process is known as the Zombie state.

Now Run two Programs

##      First
```
#include<stdio.h> 
#include<unistd.h> 
#include<sys/wait.h> 
#include<sys/types.h> 

int main() 
{ 
	int i; 
	int pid = fork(); 

	if (pid == 0) 
	{ 
		for (i=0; i<20; i++) 
			printf("I am Child\n"); 
	} 
	else
	{ 
		printf("I am Parent\n"); 
		while(1); 
	} 
} 
```
Second
------
```
#include<stdio.h> 
#include<unistd.h> 
#include<sys/wait.h> 
#include<sys/types.h> 

int main() 
{ 
	int i; 
	int pid = fork(); 
	if (pid==0) 
	{ 
		for (i=0; i<20; i++) 
			printf("I am Child\n"); 
	} 
	else
	{ 
		wait(NULL); 
		printf("I am Parent\n"); 
		while(1); 
	} 
} 

(Here zombie is stopped due to wait)
```


Signals
-------
Signals are software interrupts sent to a program to indicate that an important event has occurred. The events can vary from user requests to illegal memory access errors. Some signals, such as the interrupt signal, indicate that a user has asked the program to do something that is not in the usual flow of control.

OR

Signals are a limited form of inter-process communication (IPC), typically used in Unix, Unix-like, and other POSIX-compliant operating systems. A signal is used to notify a process of an synchronous or asynchronous event.

To list all the signals
-----------------------
```
kill -l
```
issue the kill -l command and it would display all the supported signals
```
[root@ljhamb scripts]# kill -l
 1) SIGHUP       2) SIGINT       3) SIGQUIT      4) SIGILL       5) SIGTRAP
 6) SIGABRT      7) SIGBUS       8) SIGFPE       9) SIGKILL     10) SIGUSR1
11) SIGSEGV     12) SIGUSR2     13) SIGPIPE     14) SIGALRM     15) SIGTERM
16) SIGSTKFLT   17) SIGCHLD     18) SIGCONT     19) SIGSTOP     20) SIGTSTP
21) SIGTTIN     22) SIGTTOU     23) SIGURG      24) SIGXCPU     25) SIGXFSZ
26) SIGVTALRM   27) SIGPROF     28) SIGWINCH    29) SIGIO       30) SIGPWR
31) SIGSYS      34) SIGRTMIN    35) SIGRTMIN+1  36) SIGRTMIN+2  37) SIGRTMIN+3
38) SIGRTMIN+4  39) SIGRTMIN+5  40) SIGRTMIN+6  41) SIGRTMIN+7  42) SIGRTMIN+8
43) SIGRTMIN+9  44) SIGRTMIN+10 45) SIGRTMIN+11 46) SIGRTMIN+12 47) SIGRTMIN+13
48) SIGRTMIN+14 49) SIGRTMIN+15 50) SIGRTMAX-14 51) SIGRTMAX-13 52) SIGRTMAX-12
53) SIGRTMAX-11 54) SIGRTMAX-10 55) SIGRTMAX-9  56) SIGRTMAX-8  57) SIGRTMAX-7
58) SIGRTMAX-6  59) SIGRTMAX-5  60) SIGRTMAX-4  61) SIGRTMAX-3  62) SIGRTMAX-2
63) SIGRTMAX-1  64) SIGRTMAX
```
##  **Assignment** - Difference between 6, 9 and 15

**SIGABRT(6)** - This kill signal is the abort signal. Typically, a process will initiate this kill signal on itself.

**SIGKILL(9)** - The SIGKILL signal forces the process to stop executing immediately. The program cannot ignore this signal. This process does not get to clean-up either.

**SIGTERM(15)** - This signal requests a process to stop running. This signal can be ignored. The process is given time to gracefully shutdown. When a program gracefully shuts down, that means it is given time to save its progress and release resources. In other words, it is not forced to stop. SIGINT is very similar to SIGTERM.


Signal	Description (Some important signals)
--------------------------------------------
SIGHUP	Hang-up detected on controlling terminal or death of controlling process.
SIGINT	Issued if the user sends an interrupt signal (Ctrl + C).
SIGQUIT	Issued if the user sends a quit signal (Ctrl + D).
SIGKILL	If a process gets this signal, it must quit immediately and will not perform any clean-up operations.
SIGTERM	Software termination signal (sent kill by default).
SIGALRM	Alarm clock signal (used for timers)

Every signal has a default action associated with it. The default action for a signal is the action that a script or program performs when it receives a signal.

Some of the possible default actions are −

- Terminate the process.
- Ignore the signal.
- Dump core. This creates a file called core containing the memory image of the process when it received the signal.
- Stop the process.
- Continue a stopped process.

Sending a signal
----------------
Synatx --> kill -signal pid
For ex: 
```
kill -9 1001
```
Sending Signals Using The Keyboard
----------------------------------
The most common way of sending signals to processes is using the keyboard. There are certain key presses that are interpreted by the system as requests to send signals to the process with which we are interacting:

Ctrl-C
Pressing this key causes the system to send an INT signal (SIGINT) to the running process. By default, this signal causes the process to immediately terminate.
```
#strace sleep 30s

^CNULL) = ? ERESTART_RESTARTBLOCK (Interrupted by signal)

strace: Process 42421 detached
##Here we initiated the process and interrupted it with ctrl+c
```
Ctrl-Z
Pressing this key causes the system to send a TSTP signal (SIGTSTP) to the running process. By default, this signal causes the process to suspend execution.
```
#strace sleep 30s
##Here we interrupted the above process using ctr+z and it sent the process to bg
 ^Z
[1]+  Stopped                 strace sleep 30s

[root@ljhamb scripts]# jobs
[1]+  Stopped                 strace sleep 30s
```
Sending Signals Using System Calls
-----------------------------------
Another way of sending signals to processes is by using the kill system call. This is the normal way of sending a signal from one process to another. This system call is also used by the 'kill' command or by the 'fg' command. Here is an example code that causes a process to suspend its own execution by sending itself the STOP signal:
```
#include <unistd.h>     /* standard unix functions, like getpid()       */
#include <sys/types.h>  /* various type definitions, like pid_t         */
#include <signal.h>     /* signal name macros, and the kill() prototype */

/* first, find my own process ID */
pid_t my_pid = getpid();

/* now that i got my PID, send myself the STOP signal. */
kill(my_pid, SIGSTOP);
```
An example of a situation when this code might prove useful, is inside a signal handler that catches the TSTP signal (Ctrl-Z, remember?) in order to do various tasks before actually suspending the process

Start the firefox and interrupt it in 10s
-----------------------------------------
```
lavish@ubuntu:~$ timeout 10s firefox &
```

To know where the binary is located
-----------------------------------
Use which command
```
[root@ljhamb ~]# which ls
/usr/bin/ls
```
To see the exit status
----------------------
```
[root@ljhamb scripts]# mkdir test1
[root@ljhamb scripts]# echo $?
0 ##previous command ran successfully
[root@ljhamb scripts]# mkdir test
mkdir: cannot create directory ‘test’: File exists
[root@ljhamb scripts]# echo $?
1 ##previous command had some error
```


##       System Calls

How to trace system calls made by a process with strace on Linux
---------------------------------------------------------------
In order to inspect what a running application is doing under the hood, and what system calls it is performing during its execution, we can use the 'strace' utility

strace is a tool used to keep track of the system calls made by a running process and the signals received by it. System calls are the fundamental interface between an application and the Linux kernel; when we use strace, the name of the calls made by a process, along with their arguments and return values are displayed on stderr

Each line in the strace output contains:

The system call name
The arguments passed to the system call in parentheses
The system call return value

Usage: 
```
[root@centos7 edac]# echo "Hello World" > file_a
[root@centos7 edac]# touch file_b
[root@centos7 edac]# strace cp file_a file_b
```
Filtering only specific system calls
------------------------------------
Use -e option followed by an expression which indicates what system calls should be traced

Usage:

To just check for execve calls
```
[root@ljhamb edac_os]# strace -e execve cp file_a file_b
execve("/usr/bin/cp", ["cp", "file_a", "file_b"], 0x7ffdf62fcea0 /* 27 vars */) = 0
+++ exited with 0 +++
[root@ljhamb edac_os]# strace -e write cp file_a file_b
write(4, "Hello World\n", 12)           = 12
+++ exited with 0 +++
```

Trace an existing and already running process
------------------------------------
strace -p <pid of the process>  --> this is called attaching of strace to a process

We can trace the signals passed to the process if we attach strace to a process
<Demo of initiating top, attaching strace to top and killing top - each in a new shell>


Summary of the system calls
---------------------------
Use 'strace -c'
```
[root@ljhamb ~]# strace -c -p <pid of process>
```
##      Arrays in Linux
-----------------
```
[root@localhost ~]# linux_arr=(vipin imran )  -> declaring
[root@localhost ~]# linux_arr[0]=vipin --> initialising
[root@localhost ~]# echo ${linux_arr[*]}
vipin imran
[root@localhost ~]# echo ${linux_arr[1]}
imran
[root@localhost ~]# echo ${linux_arr[0]}
vipin
```
Usage of arrays in loops
------------------------
```
[root@ljhamb scripts]# linux_arr=(rahul yash)
[root@ljhamb scripts]# echo ${linux_arr[0]}
rahul
[root@ljhamb scripts]# echo ${linux_arr[1]}
yash
[root@ljhamb scripts]# for i in "${linux_arr[@]}"; do echo "$i";done
rahul
yash
[root@ljhamb scripts]# for i in "${linux_arr[*]}"; do echo "$i";done
rahul yash
```
Threading
---------
-   A thread of execution is often regarded as the smallest unit of processing that a scheduler works on.
-   A thread is also called a lightweight process
-   Threads enable true parallelism on multiple processor machines

-   Threads are created like normal tasks, with the exception that the clone() system call is passed flags corresponding to specific resources to be shared:
```
clone(CLONE_VM | CLONE_FS | CLONE_FILES | CLONE_SIGHAND, 0);
```
Meaning of above Flags with clone()
```
CLONE_VM	    Parent and child share address space.
CLONE_FS	    Parent and child share filesystem information.
CLONE_FILES     Parent and child share open files.
CLONE_SIGHAND	Parent and child share signal handlers and blocked signals.
```
Note: Linux has support for hundreds to thousands of threads.

Process vs Thread
---------------
-   Process is heavy weight or resource intensive.	
-   Thread is light weight, taking lesser resources than a process.

-   Process switching needs interaction with operating system.	
-   Thread switching does not need to interact with operating system.

-   In multiple processing environments, each process executes the same code but has its own memory and file resources.	
-   All threads can share same set of open files, child processes.

-   If one process is blocked, then no other process can execute until the first process is unblocked.	
-   While one thread is blocked and waiting, a second thread in the same task can run.

-   Multiple processes without using threads use more resources.	
-   Multiple threaded processes use fewer resources.

In multiple processes each process operates independently of the others.
One thread can read, write or change another thread's data.

Advantages of Thread
--------------------
-   Threads minimize the context switching time.
-   Efficient communication.
-   It is more economical to create and context switch threads.
-   Threads allow utilization of multiprocessor architectures


Types of Thread
---------------
Threads are implemented in following two ways
-   User Level Threads -- User managed threads
-   Kernel Level Threads -- Operating System managed threads acting on kernel, an operating system core

User Level Threads
-----
-   In this case, application manages thread management kernel is not aware of the existence of threads. 
-   The application begins with a single thread and begins running in that thread.

Advantages
----------
-   Thread switching does not require Kernel mode privileges.
-   User level thread can run on any operating system.
-   Scheduling can be application specific in the user level thread.
-   User level threads are fast to create and manage.

Kernel Level Threads
--------------------
-   In this case, thread management done by the Kernel. There is no thread management code in the application area. 
-   Kernel threads are supported directly by the operating system. Any application can be programmed to be multithreaded. 
-   All of the threads within an application are supported within a single process.

Advantages
----------
-   Kernel can simultaneously schedule multiple threads from the same process on multiple processes.
-   If one thread in a process is blocked, the Kernel can schedule another thread of the same process.
-   Kernel routines themselves can multithreaded.

Key Differences
---------------
-   User level threads are faster to create and manage. 
-   Kernel level threads are slower to create and manage.

-   Implementation is by a thread library at the user
level. 
-   Operating system supports creation of Kernel threads.

-   User level thread is generic and can run on any
operating system.
-   Kernel level thread is specific to the operating system.

-   Multi-threaded application cannot take advantage of
multiprocessing.
-   Kernel routines themselves can be multithreaded.

How Linux OS treats threads
---------------------------
-   Linux has a unique implementation of threads.  To the Linux kernel, there is no concept of a thread. 
-   Linux implements all threads as standard processes. 
-   The Linux kernel does not provide any special scheduling semantics or data structures to represent threads. Instead, a thread is merely a process that shares certain resources with other processes.
-   Each thread has a unique task_struct and appears to the kernel as a normal process 

Kernel Level Threads
--------------------
-   Kernel threads are processes that exist only in kernel space. Kernel threads can only be created by other kernel threads.

LifeCycle
---------
-   You can create a kernel thread with the kthread_create() function. The thread will be created in an no-running state.
-   You can create and start a kernel thread with kthread_run(). 
-   Once started a kernel thread continues to exist until either it calls do_exit() or another thread calls kthread_stop()

Show threads per process
------------------------
We can count threads with the list of available sub directories inside /proc/<PID>/task/
For example to check some thread count --> 
```
ls /proc/$(pidof process)/task/
```
What did we learn?

Threads/ Processes are the mechanism by which you can run multiple code segments at a time, threads appear to run concurrently; the kernel schedules them asynchronously, interrupting each thread from time to time to give others chance to execute.

Identifying a thread
--------------------
Each thread identified by an ID, which is known as Thread ID. Thread ID is quite different from Process ID. A Thread ID is unique in the current process, while a Process ID is unique across the system.

Thread ID is represented by type pthread_t

Thread Identification
---------------------
Just as a process is identified through a process ID, a thread is identified by a thread ID. But interestingly, the similarity between the two ends here.

-   A process ID is unique across the system where as a thread ID is unique only in context of a single process.
-   A process ID is an integer value but the thread ID is not necessarily an integer value. It could well be a structure
-   A process ID can be printed very easily while a thread ID is not easy to print.
-   The above points give an idea about the difference between a process ID and thread ID.

Thread ID is represented by the type ‘pthread_t’. 

Function that can compare two thread IDs
-------------------------------------------
```
#include <pthread.h>
int pthread_equal(pthread_t tid1, pthread_t tid2);
```
the above function takes two thread IDs and returns nonzero value if both the thread IDs are equal or else it returns zero.

Function to know thread's own thread Id
---------------------------------------
function ‘pthread_self()’ is used by a thread for printing its own thread ID.
```
#include <pthread.h>
pthread_t pthread_self(void);
```
Thread Creation
---------------
-   Normally when a program starts up and becomes a process, it starts with a default thread. So we can say that every process has at least one thread of control.  A process can create extra threads using the following function :
```
#include <pthread.h>
int pthread_create(pthread_t *restrict tidp, const pthread_attr_t *restrict attr, void *(*start_rtn)(void), void *restrict arg)

```
The above function requires four arguments:

- The first argument is a pthread_t type address. Once the function is called successfully, the variable whose address is passed as first argument will hold the thread ID of the newly created thread.
- The second argument may contain certain attributes which we want the new thread to contain.  It could be priority etc.
- The third argument is a function pointer. This is something to keep in mind that each thread starts with a function and that functions address is passed here as the third argument so that the kernel knows which function to start the thread from.
- As the function (whose address is passed in the third argument above) may accept some arguments also so we can pass these arguments in form of a pointer to a void type. Now, why a void type was chosen? This was because if a function accepts more than one argument then this pointer could be a pointer to a structure that may contain these arguments.


Example of thread creation
--------------------------
```
#include<stdio.h>
#include<string.h>
#include<pthread.h>
#include<stdlib.h>
#include<unistd.h>

pthread_t tid[2];

void* doSomeThing(void *arg)
{
    unsigned long i = 0;
    pthread_t id = pthread_self();

    if(pthread_equal(id,tid[0]))
    {
        printf("\n First thread processing\n");
    }
    else
    {
        printf("\n Second thread processing\n");
    }

    for(i=0; i<(0xFFFFFFFF);i++);

    return NULL;
}
```
```
int main(void)
{
    int i = 0;
    int err;

    while(i < 2)
    {
        err = pthread_create(&(tid[i]), NULL, &doSomeThing, NULL);
        if (err != 0)
            printf("\ncan't create thread :[%s]", strerror(err));
        else
            printf("\n Thread created successfully\n");

        i++;
    }

    sleep(5);
    return 0;
}
```
What it does
------------
-   It uses the pthread_create() function to create two threads
The starting function for both the threads is kept same.
-   Inside the function ‘doSomeThing()’, the thread uses pthread_self() and pthread_equal() functions to identify whether the executing thread is the first one or the second one as created.
-   Also, Inside the same function ‘doSomeThing()’ a for loop is run so as to simulate some time consuming work.

How to compile
--------------
```
gcc file.c -o file.sh -lpthread
```
-   Run the shell file and See the output - threads get created and then start processing. The order of execution of threads is not always fixed. It depends on the OS scheduling algorithm.

Exiting a thread
----------------
-   pthread_exit() is used to exit a thread. This function is usually written at the end of the starting routine. 

Waiting for a thread
--------------------
-   A parent thread is made to wait for a child thread using s




































































































































