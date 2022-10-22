package test;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday,"Toan Ly Hoa");
        ThoiKhoaBieu tkb_t3= new ThoiKhoaBieu(Day.Tuesday,"Van Su Dia");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday,"Tin Hoa Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thurday,"Su GD Anh");
        System.out.println(tkb_t5);

        System.out.println(tkb_t3);

        int x = Month.January.soNgay();
        System.out.println(x);
    }

}
