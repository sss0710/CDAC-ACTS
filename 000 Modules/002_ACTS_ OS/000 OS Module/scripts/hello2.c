#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main()
{
int n=3;
for(int i=0;i<n;i++){
fork();
printf(".\n");
}
return 0;
}
