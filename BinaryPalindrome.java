import java.util.Scanner;
public class BinaryPalindrome {
    public static boolean checkPalindrome(int n){
        String s=Integer.toBinaryString(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(checkPalindrome(n)==true){
            System.out.println("BINARY PALINDROME");
        }
        
        else{
            System.out.println("NOT BINARY PALINDROME");
        }
    }
}
