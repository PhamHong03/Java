public class Studnet {
    private  int id;
    private String ten;

    public Studnet(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                '}';
    }
}
