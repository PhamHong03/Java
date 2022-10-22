import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        // kieu du lieu nguyen thuy
        int[] mang1 = {1,2,4,5,7};
        int[] mang2 = new int[]{3,65,3,6,2,7};

        //copy mang
        int[] mang1_a = mang1;
        mang1_a[0] = 100;//gia tri bi thay doi theo
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_a));

        // Ham copy mang: clone

        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;//Gia tri mang ban dau khong bi thay doi theo
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_b));

        //Ham system.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0 ,mang1_c,0,mang1.length);
        mang1_c[0] = 90;
        System.out.println(Arrays.toString(mang1_c));

        //
        String[] mangdt = {"toi yeu anh","anh khong yeu toi dung khong"};
        String[] mangt = mangdt;
        System.out.println(Arrays.toString(mangt));

        String[] mangr = mangdt.clone();
        System.out.println(Arrays.toString(mangr));

        String[] mangj = new String[mangdt.length];
        System.arraycopy(mangdt,0,mangj,0,mangdt.length);
        System.out.println(Arrays.toString(mangj));

    }
}
