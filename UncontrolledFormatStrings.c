#include <stdio.h>

int main() {
    char userInput[256]; 
    printf("Enter your message: ");
    scanf("%s", userInput);  
    printf(userInput); 
    return 0;
}
