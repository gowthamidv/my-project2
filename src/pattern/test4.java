package pattern;

public class test4 {

	public static void main(String args[]){
		// TODO Auto-generated method stub
//int i,j,n=6;
//for(  i=0;i<n;i++) {
	
	
	//for( j=n-1; j>1; j--) {
		//System.out.print(" ");
//}
	//for( j=0;j<=i;j++) {
	//System.out.print("*");
	//}
	//System.out.println();
	//}
	//}
//}

int row=5,i,space,j;
for(i=0;i<row;i++) {
	for(space=i;space<row;space++)
		System.out.print(" ");
	for(j=0;j<(i+1);j++)
		System.out.print("*");
	System.out.println(" ");
}
	}
}
