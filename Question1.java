class Question1 {
	public static void main(String args[])
	{
	int rows = 4;
        int cols = 4;

        System.out.println("BOX");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(i==0 ||  j==0 || i==rows-1 || j==cols-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("OVAL");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if((i==0 && j>0 && j<cols-1) ||  (j==0 && i>0  && i<rows-1) || (i==rows-1 && j>0 && j<cols-1) || (j==cols-1 && i>0  && i<rows-1)) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("ARROW");
        for(int i=0; i<=rows; i++) {
            for(int j=0; j<=cols; j++) {
                if(j==2 || (i==1 && j==1) || (i==2 && j==0) || (i==1 && j==3) || (i==2 && j==4)) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("DIAMOND");
        for(int i=0; i<=rows; i++) {
            for(int j=0; j<=cols; j++) {
                if((i==0 && j==2) || (i==1 && j==1) || (i==2 && j==0) || (i==1 && j==3) || (i==2 && j==4)|| (i==3 && j==1) || (i==4 && j==2) || (i==3 && j==3)) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
	}
	}
}