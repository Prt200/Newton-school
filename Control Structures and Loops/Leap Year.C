#include <stdio.h> // header file for Standard Input Output
#include <stdlib.h> // header file for Standard Library

int main() {
	int year;
   printf("");
   scanf("%d", &year);
   if (year % 400 == 0) {
      printf("YES");
   }

   else if (year % 100 == 0) {
      printf("NO");
   }
  
   else if (year % 4 == 0) {
      printf("YES");
   }
   else {
      printf("NO");
   }
	return 0;
}
