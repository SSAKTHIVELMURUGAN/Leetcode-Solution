#include<stdio.h>
int main()
{
    int i,j,k,s,n;
    printf("ROW ");
    scanf("%d",&n);
    s=n;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf(" ");
        }
        for(k=0;k<i;k++)
        {
            printf("*");
        }
        s-=1;
        printf("\n");
    }
}
    			
  		
