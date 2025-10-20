import java.util.*;

class _20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] operations = sc.nextLine().split(" ");

        System.out.print(operations);
        sc.close();
    }

    static int helper(String[] operations){
        int value = 0;
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].contains("+")) value += 1;
            else if(operations[i].contains("-")) value -= 1;
        }

        return value;
    }
}
