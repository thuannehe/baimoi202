import java.util.Scanner;

public class buoi202 {
    public static void main(String[] args) {//psvm
//        System.out.println();//sout
//        int a=3;
//        int b=5;
//        float c=1.5f;
//        int tong1=a+b;
//        float tong2=a+c;
//        System.out.println(tong1);
//        System.out.println(tong2);
//        Scanner sc=new Scanner(System.in);
//        int e=sc.nextInt();
//        System.out.println("Số bạn vừa nhập là"+" "+e);

//        int a;
//        Scanner sc = new Scanner(System.in);
//        a= sc.nextInt();
//        System.out.println("số tiền bạn muốn đổi:"+" "+a);
//        int b = 23000;
//        System.out.println("số tiền đổi sang VND là:"+" "+a*b);

//        int a;
//        Scanner sc = new Scanner(System.in);
//        a= sc.nextInt();
//        int b= sc.nextInt();
//        if(a>b){
//            System.out.println("haha");
//        }
//int c =sc.nextInt();
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println("Giá trị lớn nhất là: " + max);

//        int a,b;
//        int tich=1;
//        Scanner sc =new Scanner(System.in);
//        a=sc.nextInt();
//        System.out.println("Nhập a:" );
//        b=sc.nextInt();
//        System.out.println("Nhập b:" );
//        for(int i=a;i<=b;i++){
//            tich*=i;
//        }
//        System.out.println(tich);


        float[] a={  1.2f, 2, 3, 5, 6.2f};
        float tong=0;
        float max = a[0];
        float tich =1;

        for (int i =0;i<a.length;i++){
            tong+=a[i];
            tich*=a[i];
           if(max<a[i]){
               max=a[i];
           }
        }
        System.out.println(tong);
        System.out.println(tich);
        System.out.println("số lơn nhất trong mảng "+max);
    }
}



