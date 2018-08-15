#include <stdio.h>
#include <stdlib.h>

main(int argc, char const *argv[]){
    int number_of_events,i;
    int untreated_crimes = 0;
    int police_officers = 0;
    scanf("%d",&number_of_events);
    int cases[number_of_events];
    for(i = 0; i < number_of_events; i++){
        scanf("%d",&cases[i]);
        if (cases[i] < 0){
            if(police_officers <= 0){
                untreated_crimes += 1;
            }
            else {
                police_officers--;
            }
        }
        if (cases[i] > 0){
            police_officers += cases[i];
        }
    }
    printf("%d",untreated_crimes);
    return 0;
}