// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
gotoxy(5,6);
cout<<'%';
gotoxy(5,6+1);
cout<<'%';
gotoxy(5,6+2);
cout<<'%';
gotoxy(5,6+3);
gotoxy(5,6+4);
cout<<'%';
for(int i =0; i < 5; i++){
gotoxy(5,6+1);
cout <<'%';
}
}
