#include<stdio.h>
int main()
{
	int i,j,k,n,step;
	printf("enter row size:");
	scanf("%d",&n);
	step=2*n-1;
	for(i=1;i<=n;i++)
	{
		for(k=1;k<i;k++)
		{
			printf(" ");
		}
		for(j=1;j<=step;j++)
		{
			printf("*");
		}
		step-=2;
		printf("\n");
	}
	return 0;
}
