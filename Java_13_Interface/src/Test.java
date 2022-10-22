public class Test {
    public static void main(String[] args) {
        System.out.println("Test cau a: ");
        //MayTinhBoTuiInterface mt = new MayTinhBoTuiInterface() {
        MayTinhCasioFX500 mfx = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn = new MayTinhVinacal500();

        System.out.println("5+3= "+mfx.cong(5,3));
        System.out.println("4*5= "+mvn.nhan(4,5));
        System.out.println("4/0= "+mfx.chia(4,0));

        System.out.println("Test cau b:");
        double[] arr = new double[]{3,2,5,6,8,35,1};
        double[] arr2 = new double[]{5,3,6,32,7,56};
        SapXepChen sxc = new SapXepChen();
        SapXepChon sxch = new SapXepChon();


        System.out.println("Sap xep Tang");
        sxc.sapXepTang(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sxch.sapXepTang(arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println("Sap xep Giam");
        sxc.sapXepGiam(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        sxch.sapXepGiam(arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("Test cau c: ");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3+5= "+pmmt.cong(3,5));
        double[] arr3 = new double[]{37,5,2,6,4};
        pmmt.sapXepGiam(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
