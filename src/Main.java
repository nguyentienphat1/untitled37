import java.util.Scanner;

public class Main {
    public static void tong(int a[]){
        int tong=0;
        for (int i=0;i< a.length;i++){
            tong = tong+a[i];
        }
        System.out.println("tong la : "+tong);
    }
    public static void chanle(int a[]){
        System.out.println("cac so chan la : ");
        for (int i=0;i< a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println(" cac so le la : ");
        for (int i=0;i< a.length;i++){
            if (a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
    public  static boolean ispremis(int a){
        if (a<=1){
            return false;
        }
        for (int i=2;i<a;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void thucthisnt(int a[]){
        System.out.println("cac so nguyen to la");
        for (int i=0;i< a.length;i++){
            if (ispremis(a[i]))
                System.out.println(a[i]);
        }
    }
    public static void chinhphuong(int a[]){
        System.out.println("cac so chinh phuong la");
        for (int i=0;i< a.length;i++) {
            double j = Math.sqrt(a[i]);
            if (a[i]==Math.pow(j,2)){
                System.out.println(a[i]);
            }
        }
    }
    public static void vitrile(int a[]){
        System.out.println("cac so o vi tri le la :");
        for (int i=0;i< a.length;i++){
            if (i%2!=0){
                System.out.println(a[i]);
            }
        }
    }
    public static void doivitri(int a[]){
        System.out.println("vi tri sau khi doi la : ");
        for (int i=0;i< a.length;i++){
            int temp = a[0];
            a[0]=a[a.length-1];
            a[a.length-1]=temp;
            System.out.println(a[i]);
        }
    }
    public static void kiemtrax(int a[]){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println("vi tri ma x nam trong ma la : ");
        for (int i=0;i< a.length;i++){
            if (a[i]==x){
                System.out.println(i);
            }
        }
    }
    public static void daonguoc(int a[]){
        System.out.println("phan tu sau khi dao nguoc mang la : ");
        for (int i= a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    public static void sapxep(int a[]){
        System.out.println("vi tri tang dan la : ");
        for (int i=0;i< a.length;i++){
            for (int j=i;j< a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("gia vi sau khi sap xep giam dan la :");
        for (int i=0;i< a.length;i++){
            for (int j=i;j< a.length;j++){
                if (a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int n;
        boolean continew=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n= scanner.nextInt();
        int array[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap gia tri tung phan tu "+i);
            array[i] = scanner.nextInt();
        }

        do {
            System.out.println("1. tinh tong mang");
            System.out.println("2. xua cac so chan va so le");
            System.out.println("3. xuat cac so nguyen to trong mang");
            System.out.println("4. xuat cac so chinh phuong trong mang");
            System.out.println("5.xuat cac so o vi tri le trong mang");
            System.out.println("6. doi phan tu dau tien va phan tu cuoi cung trong mang");
            System.out.println("7. kiem tra x co trong mang hay khong va no nam o vi tri nao");
            System.out.println("8. dao nguoc mang ban dau");
            System.out.println("9. sap xep gia tri cua mang tang dan va giam dan");
            System.out.println("0.ket thuc chuong trinh");
            int chon;
            System.out.println("nhap truong hop ban muon chon");
            chon = scanner.nextInt();
            switch (chon){
                case 1: tong(array);
                break;
                case 2: chanle(array);
                break;
                case 3:  thucthisnt(array);
                break;
                case 4: chinhphuong(array);
                break;
                case 5: vitrile(array);
                break;
                case 6: doivitri(array);
                break;
                case 7: kiemtrax(array);
                break;
                case 8: daonguoc(array);
                break;
                case 9: sapxep(array);
                break;
                case 0:
                    continew = false;
                    System.out.println(" ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("chon sai xin cho lai ");
                    break;
            }
        }
        while (continew);
    }
}