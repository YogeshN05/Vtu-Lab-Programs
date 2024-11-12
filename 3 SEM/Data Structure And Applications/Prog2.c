/*Design and Develop and Implement a Program in C for the following operations on Strings
a. Read a main String (STR), a Pattern String (PAT) and a Replace String (REP)
b. Perform Pattern Matching Operation: Find and Replace all occurrences of PAT in STR with REP if PAT exists in STR. 
Report suitable messages in case PAT does not exist in STR
Support the program with functions for each of the above operations. Don't use Built-in functions.*/
#include<stdio.h>
char str[100],pat[100],rep[100],ans[100];
int i=0,j=0,k,m=0,c=0,flag=0;
void stringmatch()
{
    while(str[c]!='\0')
    {
        if(str[m]==pat[i])
        {
            m++;
            i++;
            if(pat[i]=='\0')
            {
                flag=1;
                for(k=0;rep[k]!='\0';k++,j++)
                {
                    ans[j]=rep[k];
                }
                i=0;
                c=m;
            }
        }
        else
        {
            ans[j]=str[c];
            j++;
            c++;
            i=0;
            m=c;
        }
    }
    ans[j]='\0';
}
void main()
{
    printf("\n Enter the main string: ");
    gets(str);
    printf("\n Enter the pat string: ");
    gets(pat);
    printf("\n Enter the rep string: ");
    gets(rep);
    stringmatch();
    if(flag==1)
    {
        printf("\n Resultant String is %s",ans);
    }
    else
    printf("Pattern Not Found");
}

/*
Enter the main string: Yogi
Enter the pat string: i
Enter the rep string: esh
Resultant String is Yogesh

Enter the main string: Yogi
Enter the pat string: esh
Enter the rep string: i
Pattern Not Found
*/