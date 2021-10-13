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


