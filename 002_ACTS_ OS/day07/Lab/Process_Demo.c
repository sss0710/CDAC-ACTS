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

to check process list:



kill - l
to imporant signals :
SIGKILL - kill -9 <pid> #brutal behavior to kill a process
SIGTERM - kill -15 <pid> //may be unhandled   (process is busy in I/O operations, waiting for some input)
*/
