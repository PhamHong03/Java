public class MyMath {
     public int timMin(int a, int b){
         if(a<b)return a;
         else return b;
     }
     public double timMin(double a, double b){
         if(a<b)return a;
         else return b;
     }
     public double tinhTong(double a, double b){
         return a+b;
     }
     public double tinhTong(double[] array){
         double tong =0;
         for(int i=0;i< array.length;i++){
             tong+=array[i];
         }
         return tong;
     }
     // Overloading: Ta viết những phương thức có tên giống nhau nhưng giá trị truyền vào mỗi phương thức là khác nhau
    // Tên phương thức trùng nhau_truyền vào khác nhau
}
