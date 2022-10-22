public class Test {
    public static void main(String[] args) {
        Day d1 = new Day(12,2,2022);
        Day d2 = new Day(3,12,3022);
        Day d3 = new Day(25,4,2012);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A","VietNam");
        HangSanXuat hangSanXuat2 =  new HangSanXuat("Hang B","Korean");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C","Japan");

        Film boPhim1 = new Film("Bo Gia", 2020, hangSanXuat1,55000,d1);
        Film boPhim2 = new Film("Nghe Sieu De", 2022, hangSanXuat2,60000,d2);
        Film boPhim3 = new Film("Tam Cam", 1990, hangSanXuat3,44000,d3);

        System.out.println("Fime 1 co re hon Film 2: "+ boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("Fime 1 co re hon Film 3: "+ boPhim1.kiemTraGiaVeReHon(boPhim3));

        System.out.println(boPhim1.layTenHangSanXuat());
        System.out.println(boPhim2.layTenHangSanXuat());
        System.out.println(boPhim3.layTenHangSanXuat());

        System.out.println("Gia bo phim 1: "+boPhim1.giaSauKhiKhuyenMai(10));
        System.out.println("Gia bo phim 2:" + boPhim2.giaSauKhiKhuyenMai(20));
        System.out.println("Gia bo phim 3: "+boPhim3.giaSauKhiKhuyenMai(30));
    }
}
