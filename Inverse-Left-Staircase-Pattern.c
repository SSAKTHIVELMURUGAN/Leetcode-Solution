#include<stdio.h>
int main()
{
    int i,j,k,s,n;
    printf("Enter the rows ");
    scanf("%d",&n);
    s=n;
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf(" ");
        }
        for(k=0;k<s;k++)
        {
            printf("*");
        }
        s-=1;
        printf("\n");
    }
}
    			
  		
