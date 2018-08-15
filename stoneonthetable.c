#include <stdio.h>
#include <stdlib.h>

int main(){
    int quantity_stones;
    scanf("%d\n",&quantity_stones);
    int i;
    int remove = 0;
    char stones[quantity_stones];
    for (i = 0; i < quantity_stones; i++){
        scanf("%c",&stones[i]);
        if(i >= 1){
            printf("i: %d\n",i);
            if(stones[i] == stones[i-1]){
                remove++;
            }
        }
    }
    printf("%d",remove);
    return 0;
}