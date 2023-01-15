#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>

int kill(pid_t pid, int sig);

void main(){
	int id;
	printf("enter pid of process you want to send to \n");
	scanf("%d", &id);
	kill(id, SIGINT);
	printf("error no is %d \n",errno);
}
