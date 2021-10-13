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