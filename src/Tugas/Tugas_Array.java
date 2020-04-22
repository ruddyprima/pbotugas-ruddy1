package Tugas;

public class Tugas_Array {
    public static void main(String[] args) {
        String mahasiswa[] = new String[4];

        mahasiswa[0] = "Ruddy";
        mahasiswa[1] = "Rasyid";
        mahasiswa[2] = "Maruf";
        mahasiswa[3] = "Randy";

        System.out.println("------------------------------");
        for (int i = 0;
             i < mahasiswa.length;
             i++) {

            System.out.println(
                    "Mahasiswa Terpintar ke-" + (i + 1) + " adalah " + mahasiswa[i]);
        }
    }
}
