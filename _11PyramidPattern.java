//Write a program that prints a pyramid of stars based on user input for the number of rows.
// Not Completed
public class _11PyramidPattern {

    public static void main(String[] args){
        int n=5;

        for(int i=1;i<=n;i++){

            for(int k=1;k<(n-i);k++){
                System.out.println(" ");
            }
            for(int j=1;j<(2*i)-1;j++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }

}
