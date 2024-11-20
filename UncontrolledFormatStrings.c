#include <stdio.h>

int main() {
    char userInput[256];

    printf("Enter your message: ");
    // Utilisation de scanf sans contrôle sur le format, ce qui permet un format string vulnérable.
    scanf("%s", userInput);

    // Affichage direct de l'entrée de l'utilisateur sans échapper le formatage
    // Cela est vulnérable aux attaques de type format string
    printf(userInput);  // VULNÉRABILITÉ : Aucun contrôle sur l'entrée utilisateur

    return 0;
}
