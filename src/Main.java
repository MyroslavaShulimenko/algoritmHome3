public class Main {
    public static void main(String[] args) {
        method(300,10);
        method1(4);
        method3(5);
        // доп 1 ответ - O (log n)
    }
     public static    void method(int a, int b) {
        System.out.println(a+" "+b);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
                System.out.println(a+" "+b);

            }

        }


       // доп 2 ответ-O(n^2)
      public static   void method1(int n) {
            for (int i = 0; i < n / 2; i++) {
                for (int j = 1; j + n / 2 <= n; j++) {
                    for (int k = 1; k <= n; k = k * 2) {
                        System.out.println("I am ___expert!");
                    }
                }
            }
        }


       // доп 3 ответ - О(n)
      public static   void method3(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j = j + i) {
                    System.out.println("I am expert!");
                }
            }
        }

    }
