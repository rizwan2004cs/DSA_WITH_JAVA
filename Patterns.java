import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int n = input.nextInt();
        switch(choice){
        case 1:PatternOne(n);break;
        case 2:PatternTwo(n);break;
        case 3:PatternThree(n);break;
        case 4:PatternFour(n);break;
        case 5:PatternFive(n);break;
        case 6:PatternSix(n);break;
        case 7:PatternSeven(n);break;
        case 8:PatternEight(n);break;
        case 9:PatternNine(n);break;
        case 10:PatternTen(n);break;
        case 11:PatternEleven(n);break;
        case 12:PatternTwelve(n);break;
        case 13:PatternThirteen(n);break;
        case 14:PatternFourteen(n);break;
        case 15:PatternFifteen(n);break;
        case 16:PatternSixteen(n);break;
        case 17:PatternSeventeen(n);break;
        case 18:PatternEighteen(n);break;
        case 19:PatternNinteen(n);break;
        case 20:PatternTwenty(n);break;
        case 21:PatternTwentyOne(n);break;
        case 22:PatternTwentyTwo(n);break;
        }
    }
    static void PatternOne(int n){
        System.out.println("PatternOne");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternTwo(int n){
        System.out.println("PatternTwo");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternThree(int n){
        System.out.println("PatternThree");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void PatternFour(int n){
        System.out.println("PatternFour");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void PatternFive(int n){
        System.out.println("PatternFive");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternSix(int n){
        System.out.println("PatternSix");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void PatternSeven(int n){
        System.out.println("PatternSeven");
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n-i;j++)
                System.out.print("  ");
            for(int k = 1;k <= 2*(i-1)+1;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
    static void PatternEight(int n){
        System.out.println("PatternEight");
        for(int i = n;i >= 1;i--){
            for(int j = 1;j <= n-i;j++)
                System.out.print("  ");
            for(int k = 1;k <= 2*(i-1)+1;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
    static void PatternNine(int n){
        System.out.println("PatternNine");
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n-i;j++)
                System.out.print("  ");
            for(int k = 1;k <= 2*(i-1)+1;k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i = n;i >= 1;i--){
            for(int j = 1;j <= n-i;j++)
                System.out.print("  ");
            for(int k = 1;k <= 2*(i-1)+1;k++)
                System.out.print("* ");
            System.out.println();
        }  
    }
    static void PatternTen(int n){
        System.out.println("PatternTen");
        System.out.println(2*n-1);
        for(int i = 1; i <= 2*n-1;i++){
            int x = i;
            if(x > n){
                x = 2*n-i;
            }
            for(int j = 1;j <= x;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    static void PatternEleven(int n){
        System.out.println("PatternEleven");
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((j+i+1)%2+" ");          
                // x++;
            }
            System.out.println();
        }
    }
    static void PatternTwelve(int n){
        System.out.println("PatternTwelve");
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++)
                System.out.print(j+" ");
            for(int j = 1;j <= 2*(n-i);j++)
                System.out.print("  ");
            for(int j = i;j >= 1;j--)
                System.out.print(j+" ");  
            System.out.println();         
        }
    }
    static void PatternThirteen(int n){
        System.out.println("PatternThirteen");
        int x = 1;
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }    
    static void PatternFourteen(int n){
        System.out.println("PatternFourteen");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
    static void PatternFifteen(int n){
        System.out.println("PatternFifteen");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= n-i+1;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
    static void PatternSixteen(int n){
        System.out.println("PatternSixteen");
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println();
        }
    }
    static void PatternSeventeen(int n){
        System.out.println("PatternSeventeen");
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n-i;j++)
                System.out.print("  ");
            for(int j = 1;j <= (2*(i))-1;j++){
                int x = j;
                if(j > i) x = 2*i-x; 
                System.out.print((char)('A'+x-1)+" ");
            }
            System.out.println();
        }
    }
    static void PatternEighteen(int n){
        System.out.println("PatternEighteen");
        for(int i = 1;i <= n;i++){
            for(int j = i;j >= 1;j--){
                System.out.print((char)('A'+n-j)+" ");
            }
            System.out.println();
        }
    }
    static void PatternNinteen(int n){
        System.out.println("PatternNinteen");
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n-i+1;j++)
                System.out.print("* ");
            for(int k = 1;k <= 2*(i-1);k++)
                System.out.print("  ");
            for(int j = 1;j <= n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i = n;i >= 1;i--){
            for(int j = 1;j <= n-i+1;j++)
                System.out.print("* ");
            for(int k = 1;k <= 2*(i-1);k++)
                System.out.print("  ");
            for(int j = 1;j <= n-i+1;j++)
                System.out.print("* ");
            System.out.println(); 
        }  
    }
    static void PatternTwenty(int n){
        System.out.println("PatternTwenty");
        for(int i = 1;i <= 2*n-1;i++){
            int x = i;
            if(x > n) x = 2*n-i;
            // System.out.println(x);
            for(int j = 1;j <= x;j++)
                System.out.print("* ");
            for(int j = 1;j <= 2*(n-x);j++)
                System.out.print("  ");
            for(int j = 1;j <= x;j++)
                System.out.print("* ");
                System.out.println();
        }
    }
    static void PatternTwentyOne(int n){
        System.out.println("PatternTwentyOne");
        for(int i = 1;i <= n;i++){
            char x = ' ';
            for(int j = 1;j <= n;j++){
                x = ' ';
                if(i == 1||i == n || j == 1 || j == n){
                    x = '*';
                }
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static void PatternTwentyTwo(int n){
        System.out.println("PatternTwentyTwo");
        for(int i = 1; i <=2*n-1;i++)
        {
            // int x = i;
            // if(x > n)   x = 2*n-i;
            // System.out.println(x);
            for(int j = 1 ; j <= 2*n-1;j++){
                // if(x == i||x == 2*n-i+1||j == i || j== 2*n-i+1){
                //     System.out.print(n-i+1);
                // }else{System.out.print(" ");}
                int min = Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j));
                System.out.print((n-min+1)+" "); 
            }
            System.out.println();
            
        }
    }
}
