// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	for(int y = 8; y < 5; y ++){
		for(int x = 8; x < 5; x++ ){
			gotoxy(x+5,y+8); 
			cout << "%";
		}
	}
}