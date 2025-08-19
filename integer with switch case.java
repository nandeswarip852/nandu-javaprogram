#include <stdio.h>

int main() {
    int num;

    printf("Enter an integer between 1 and 5: ");
    scanf("%d", &num);

    switch (num) {
        case 1:
            printf("You entered One.\n");
            break;
        case 2:
            printf("You entered Two.\n");
            break;
        case 3:
            printf("You entered Three.\n");
            break;
        case 4:
            printf("You entered Four.\n");
            break;
        case 5:
            printf("You entered Five.\n");
            break;
        default:
            printf("Number out of range.\n");
    }

    return 0;
}
