#include <stdio.h>
#include <string.h>

int main(){
    char str1[100],str2[100],len1,len2,i,x;

    gets(str1);
    gets(str2);
    len1 = strlen(str1);
    len2 = strlen(str2);

    for(i = 0; i < len1; i++){
        if(str1[i] >= 65 && str1[i] <= 90){
            str1[i] = 'a' + str1[i] - 'A';
        }
    }
    for(i = 0; i < len2; i++){
        if(str2[i] >= 65 && str2[i] <= 90){
            str2[i] = 'a' + str2[i] - 'A';
        }
    }
    x = strcmp(str1,str2);
    if(x > 0) printf("1\n");
    else if(x < 0) printf("-1\n");
    else printf("0\n");
    return 0;

}
