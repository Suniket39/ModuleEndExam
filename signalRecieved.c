#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <errno.h>

int kill(pid_t pid, int sig);

void main(){
	int id;
	printf("Enter pid of the process you want to recieve signal from");
	scanf("%d", &id);
	kill(id, SIGINT);
	printf("Recieved the signal from  process");
}
