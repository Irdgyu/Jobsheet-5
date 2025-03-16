public class MainNilai06 {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 89, 84};

        int tinggiUTS = Nilai06.utsTinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        int rendahUTS = Nilai06.utsRendah(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = Nilai06.rataUAS(nilaiUAS);

        System.out.println("Nilai UTS Tertinggi: " + tinggiUTS);
        System.out.println("Nilai UTS Terendah: " + rendahUTS);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);
    }
}
