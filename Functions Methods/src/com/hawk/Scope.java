public class Scope{
    public static void main(String[] args){
        int a = 10; // "a" is available to all which is in the block of "a"("a" is in the block of main() function. )
        System.out.print(a);
        { // Block Scope. its in main() fucntion.
                // int a = 29; // Alredy initialised outside the block in the same method, hence you cannot initialized it again.
                a = 29; // Value can be Modified;
                
                // if you create a variable, it will be only able to use here.
                // Values initialised in this block, will remain in block
                // int c = 99;	
        }
        // System.out.print(c); // error: cannot access outside block function.
        System.out.print(a); // output: 29 

    }
}