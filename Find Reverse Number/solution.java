//from Kunal Kushawaha lessons

public class Main {
    public static void main(String[] args) {
        int n= 12345;
        int ans=0;
        while (n>0){

            int reminder=n%10;
            ans=ans*10 +reminder;
            n=n/10;


        }
        System.out.println(ans);

    }
}
