package it.develhope.whileloop;

public class Start {

    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        int count = 0;
        System.out.print("Fibonacci Sequence of First 10 Terms: ");
        while (count < 10)
        {
            if (count <= 1)
            {
                sum = count;
            } else
            {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
            System.out.print(sum + " ");
            count++;
        }
    }

}
