import java.util.Locale;
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        System.out.println("Nhap vao chuoi");
//        s = sc.nextLine();
//        System.out.println("------");
//        //Ham length();
//        int doDai = s.length();
//        System.out.println(doDai);
//        // Ham charArt: lấy ra 1 kí tự tại vị trí bất kì
//        for(int i=0;i<doDai;i++){
//            System.out.println("Vi tri "+ i +" la: "+s.charAt(i));
//        }
//        // Ham getchar: co 4 thong so can dien vao(vitri bat dau, vitri ket thuc, mang luu du lieu, vitri bat dau luu mang du lieu
//        char[] arraychar = new char[20];
//        s.getChars(2,6,arraychar,0);
//        for(int i=0;i<arraychar.length;i++){
//                    System.out.println("Gia tri cua mang tai "+ i+" la: "+arraychar[i]);
//                    // tru di 1 don vi
//        }
//        // Ham getByte ==. co 3 cach lay ra gia tri cua cac ki tu thanh 1 mang
//        byte[] arrayByte = s.getBytes();
//        for (byte b: arrayByte){
//                System.out.println(b);
//        }
//        // Hàm equals: co phan biet hoa thuong
//        String s1 = "pham thi cam hong";
//        String s2 = "PHAM THI CAM HONG";
//        String s3 = "pham thi cam hong";
//        System.out.println("s1 equals s2: "+s1.equals(s2));
//        System.out.println("s1 equals s3: "+s1.equals(s3));
//
//        // ham equalsIsgnoreCase: khong phan biet hoa thuong
//        System.out.println("s1 equalsIsgnoreCase s2: "+s1.equalsIgnoreCase(s2));
//        System.out.println("s1 equalsIsgnoreCase s3: "+s1.equalsIgnoreCase(s3));
//
//        // Ham ConpareTo: so sanh lon hon, be hon > < = ;
//        String sv1 = "Nguyen Van A";
//        String sv2 = "Nguyen Van B";
//        String sv3 = "Nguyen Van";
//        String sv4 = "Nguyen Van A";
//        System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
//        System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
//        System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
//
//        // Ham compareToIsgnoreCase ==> khong phan biet chu hoa chu thuong
//        // Ham regionMatches => so sanh mot doan
//        String r1 = "titv.vn";
//        String r2 = "tv.v";
//        boolean check = r1.regionMatches(2,r2,0,4);
//        System.out.println(check);
//
//        //Ham startWith va Ham endWith: kiem tra chuoi bat dau va ket thuc
//        String sdt = "037456789";
//        System.out.println(sdt.startsWith("037"));
//        System.out.println(sdt.startsWith("034"));
//
//        String tenFile = "i love you.JPG";
//        String tenFile2 = "Java.PDF";
//        if(tenFile.endsWith("JPG")){
//            System.out.println("File la hinh anh");
//        }else if(tenFile.endsWith("PDF")){
//            System.out.println("File la file PDF");
//        }
//
//        if(tenFile2.endsWith("PDF")){
//            System.out.println("File nay la file PDF");
//        }else if(tenFile2.endsWith("JPG")){
//            System.out.println("File la file hinh anh");
//        }


//        String h1 = "Xin chao co chu, xin chao cac ban, Xin chao!";
//        String h2 = "Xin chao";
//        String h3 = "Xin chao 123";
//        //Ham indexOf
//        System.out.println(h1.indexOf(h2));
//        System.out.println(h1.indexOf(h3));
//        char C1 = 'o';
//       // Su dung vi tri bat dau;
//        System.out.println("Vi tri h2 tring h1: "+h1.indexOf(h2));
//        System.out.println("Vi tri h2 tring h1: "+h1.indexOf(h2,2));
//        // Tim kiem char
//        System.out.println("Vi tri C1 tring h1: "+h1.indexOf(C1));
//        System.out.println("Vi tri C1 tring h1: "+h1.indexOf(C1,20));
//
//        // Ham lastindexOf
//        System.out.println("Vi tri h2 tring h1: "+h1.lastIndexOf(h2));
//        // tenFile = "BAi tap.excel.doc.xls";
//
//          //Ham concat: cong chuoi
         String t1 = "TiTv";
         String t2 = ".vN";
         String t3 = t1 + t2;
         String t4 = t1.concat(t2);

        System.out.println(t3);
        System.out.println(t4);
        // Ham replace : thay the, thay doi;
        String t5 = "Hong.vn";
        String t6 =  t5.replaceAll("Hong","TITV");
        System.out.println(t6);

        // Ham toloweCase and toupperCase
        String t7 = t3.toLowerCase(Locale.ROOT);
        String t8 = t3.toUpperCase(Locale.ROOT);
        System.out.println(t7);
        System.out.println(t8);

        // Ham trim: xoa khoang trang du thua o dau chuoi;
        String t9 = "  Xin chao em yeu nho  ";
        System.out.println(t9.trim());

        // Ham toCharArray();
        // Ham subString : cat chuoi con;
        String t10 = "Xin chao em yeu nho";
        String t11 = t10.substring(5);
        System.out.println(t11);
        String t12 = t10.substring(3,16);
        System.out.println(t12);


    }
}
