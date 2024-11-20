#include <stdio.h>

int main() {
    char userInput[256]; 
    printf("Enter your message: ");
    scanf("%s", userInput);  
    printf("You entered: %s\n", userInput); 
    return 0;
}
