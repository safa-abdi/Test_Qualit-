#include <stdio.h>

int main() {
    char userInput[256];
    printf("Enter your message: ");
    fgets(userInput, sizeof(userInput), stdin);
    printf(userInput);  
    return 0;
}
