#include<stdio.h>

int main(void){
	char str[] = "abcde";
	char* start = str;
	char* end = start;
	char temp;

	while(*end){
		end++;
	}

	end--;

	printf("Before reversing: %s\n", str);
	while(start<end){
		temp = *start;
		*start++ = *end;
		*end-- = temp;
	}
	printf("After reversing: %s\n", str);
	return 1;
}