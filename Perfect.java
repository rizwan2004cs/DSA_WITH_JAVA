import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int tar = input.nextInt();
    // System.out.println(tar1);
    int count = 0;
    for(int i = a;i <= b;i++ )
    {   int sum = 0;
        for(int j = 1;j <= i/2;j++ )
        {
            
            if(i%j == 0){
                sum+=j;
            }
        }
        if(sum == i){
          count++;
          if(count == tar)
          System.out.println(sum);
        }
        // if(sum == i )
        // {
        //   System.out.println(count);
        //     count++;
        //     if(count == tar1)
        //     System.out.println(sum);
        //     break;

        // }

    }
 
    }
    
}
