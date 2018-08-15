#include <stdio.h>
#include <stdlib.h>

int main(){
    int police_officers = 0;
    int crimes = 0;
    int no_events,i;
    int events[no_events];
    scanf("%d",&no_events);
    for (i = 0; i < no_events; i++){
        if(events[i] < 0){
            if(police_officers < 0){
                crimes++;
            } else {
                police_officers--;
            }
        } else {
            police_officers += events[i];
        }
    }
    printf("%d",crimes);
    return 0;
}