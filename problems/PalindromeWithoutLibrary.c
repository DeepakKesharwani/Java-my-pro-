#include<stdio.h>
#include<string.h>

int main(){
	char string[25],reverse_String[25]={'\0'};
	int i,length=0,flag=0;
	fflush(stdin);
	printf("Enter a string \n");
	gets(string);

	for(i=0;string[i]!='\0';i++){
		length++;
	}

	for(i=length-1;i>=0;i--){
		reverse_String[length -i-1] = string[i];
	}
	printf("%s is reverse String\n\n",reverse_String);

	for(i=0;i<length;i++){
		if(reverse_String[i] == string[i]){
			flag = 1;
		}else{
			flag = 0;
		}
	}

	if(flag ==1){
		printf("%s is palindrome\n",string);
	}else{
		printf("%s is not palindrome\n",string);
	}
	return 0;
}