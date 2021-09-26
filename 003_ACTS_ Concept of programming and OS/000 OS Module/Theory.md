#	OPERATING SYSTEMS

##	DAY1

##	Objective

To introduce Operating System concepts with Linux environment, and to learn Shell Programming

##	Day 1 Theory

What is OS?
-----------
**An Operating System (OS) is an interface between a computer user and computer hardware.** 

An operating system is a software which performs all the basic tasks like file management, memory management, process management, handling input and output, and controlling peripheral devices such as disk drives and printers.

Some popular Operating Systems include **Linux Operating System, Windows Operating System, VMS, OS/400, AIX, z/OS, etc.**

Some of important functions of an operating System
--------------------------------------------------
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

Interaction with OS
-------------------
The application programs make use of the operating system by making requests for services through a defined application program interface (API). In addition, users can interact directly with the operating system through a user interface, such as a command-line interface (CLI) or a graphical UI (GUI).

Why is OS hardware dependent?
-----------------------------
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
-----------------------------------------------------------
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
-------------------
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


**Ques 1 - Difference between kernel and OS (10 min)**
*   Good reference: https://www.geeksforgeeks.org/difference-between-operating-system-and-kernel/

Types of Operating Systems
--------------------------
Batch OS
Distributed OS
Multitasking OS
Network OS
Real-OS
Mobile OS

**Ques2 - Write one-liner on each OS with examples (10 min)**

*   Read this - https://www.geeksforgeeks.org/types-of-operating-systems/

##  Modes of operation in OS

User mode --> mode bit = 1
kernel mode --> mode bit = 0

Important: The mode bit is set to 0 in the kernel mode. It is changed from 0 to 1 when switching from kernel mode to user mode.

**Kernel Mode**

In Kernel mode, the executing code has complete and unrestricted access to the underlying hardware. It can execute any CPU instruction and reference any memory address. Kernel mode is generally reserved for the lowest-level, most trusted functions of the operating system. Crashes in kernel mode are catastrophic; they will halt the entire PC.

**User Mode**

In User mode, the executing code has no ability to directly access hardware or reference memory. Code running in user mode must delegate to system APIs to access hardware or memory. Due to the protection afforded by this sort of isolation, crashes in user mode are always recoverable. Most of the code running on your computer will execute in user mode.

Example
--
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

##	Day 2

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
----------------------
1. Root User
2. Regular User
3. Super User (Sudoer)

To Change location in Linux - To traverse in Linux
--------------------------------------------------
```
cd <location where you want to go>
```

File Hierarchy in Linux - Directory Structure in Linux
------------------------------------------------------

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
-----------------------
```
pwd --> present working directory
```


Meaning of '.' and '..'
-----------------------
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
---------------------------
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
--------------
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
---------------------------------
```
[root@localhost edac_os]# rm -rf *
```

How to create files
-------------------
```
touch <filename>  -> it will create a blank file
```

Sceanrio we are working on
--------------------------
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
----------------------------
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
---------------------------
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
---------------
```
mv <old name> <new name>
```

Copying of file
---------------
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
------------------------------------------------------------
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

LAB - 23/09/2021
----------------
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
## DAY 3
Agenda
------
*	 What are file permissions and how to set them
*	 Permissions (chmod, chown, etc); access control list; network commands (ssh, sftp, scp)

SHELL
-----
* Shell is a way you interact with kernel.

Type of shells
--------------
*	bash
*	sh
*	csh
*	ksh
*	nologin

To know which shell you are working in : 
```
echo $SHELL
```

Users in Linux
-----------
*	root user -> 0
*	super user - sudoer
*	regular user -> is above 1000 (centOS7)
This min UID is decided in /etc/login.defs
UID_MIN                  1000 to view this file use 
```
cat /etc/login.defs
```
*   Root is the only user that will go in /home. Rest all user will go in /home
*   Whenever the shell is nologin the user will not be able to login
*   Users that are by default in nologin are services/system services/services users

Where can I see the list of all users in Linux?
------------------------------------------------
*    Whenever we create a user in Linux, a folder is created with same name as that of user in /home

There is a file where we can see the info of all users to view it use - 
```
cat /etc/passwd
```
username:x:UID:GID:comment:< home location >:< shell that user will use >

How to create a user in Linux
-----------------------------
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
How to delete a user
--------------------
```
userdel -r <username>
```

Switching of users
------------------
```
su - <username>
```

Root can switch to any user without providing password

Other users require password for switching

Importance of 'x'
-----------------
Where are users password stored? - 
```
/etc/shadow
```
The 2nd field 'x' in /etc/passwd is a link to shadow file that contains encrypted password

x ------------> encrypted password

Without x linking of users in **/etc/passwd** - password won't be asked

File Permissions
----------------
*	Owner - User who created the file
*	Group - The group which user is a part of
*	Others - rest of users

Permissions
-----------
*	r Read
*	w Write
*	x Execute

*	4 Read
*	2 Write
*	1 Execute

Full permissions over a file means
rwx or 7 (4+2+1)

How permission of a file looks like

--- 		--- 		---
Owner		Group		Other users

Umask
-----
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

Folder 
777
022
---
755

If umask was not there, then any file created would have got 666 as permission set which means
Owner - rw
Group - rw
Others - rw

How to modify the permissions of a file
---------------------------------------
```
chmod <permission set> filepath
```

How to change the ownership of a file
-------------------------------------
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


ACL - Access Control List
-------------------------
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

ACl --> 
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

Getting permissions in numeric format
-------------------------------------
```
[root@localhost edac_os]# ls -l file3
-rw-r--r--. 1 root root 0 Sep 24 09:41 file3
[root@localhost edac_os]# stat -c %a file3
644
```
SSH
---
Secure Shell - Used to take shell of different Linux machines
Synatx: 
```
ssh <username of the other machine>@<IP of the other machine>
```
Usage:
```
[root@localhost edac_os]# ssh ljhamb@192.168.91.147
```
It will ask for password

Transfer all files on other machine via copying
-----------------------------------------------
scp - secure copy, copy over ssh
```
scp <location of files you want to transfer> <username of the other machine>@<IP of the other machine>:<location where you want to transfer>
```
Usage
-----
```
[root@localhost edac_os]# scp -r /root/edac_os/* ljhamb@192.168.91.147:/home/ljhamb/test/
ljhamb@192.168.91.147's password:
file1              100%    0     0.0KB/s   00:00
file2              100%    0     0.0KB/s   00:00
file3              100%    0     0.0KB/s   00:00
file4              100%    0     0.0KB/s   00:00
file5              100%    0     0.0KB/s   00:0
```








































































































