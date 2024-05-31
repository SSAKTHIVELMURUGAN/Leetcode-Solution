#include<stdio.h>
int main()
{
	int i,j,k,n,step=1;
	printf("enter row size:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{

		for(k=1;k<=n-i;k++)
		{
			printf(" ");
		}
		for(j=1;j<=step;j++)
		{
			printf("*");
		}
		step+=2;
		printf("\n");
	}
	return 0;
}
