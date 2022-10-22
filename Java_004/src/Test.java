import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Random random = new Random();

        for(int i=0;i<n;i++){
            int rad = random.nextInt(3);

            IInputOutput io;
            switch (rad){
                case 0:
                    io = new Instruction();
                    break;
                case 1:
                    io = new Drinks();
                    break;
                default:
                    io = new Ticket();
                    break;
            }
            io.input();
            DataMrg.getInstance().getIolist().add(io);
        }
        for(IInputOutput io: DataMrg.getInstance().getIolist() ){
            io.display();
        }

    }
}
