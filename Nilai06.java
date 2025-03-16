public class Nilai06 {
    public static int utsTinggi(int[] arr, int l, int r) {
        if (l == r) return arr[l];
        int mid = (l + r) / 2;
        int lTinggi = utsTinggi(arr, l, mid);
        int rTinggi = utsTinggi(arr, mid + 1, r);
        return Math.max(lTinggi, rTinggi);
    }

    public static int utsRendah(int[] arr, int l, int r) {
        if (l == r) return arr[l];
        int mid = (l + r) / 2;
        int lRendah = utsRendah(arr, l, mid);
        int rRendah = utsRendah(arr, mid + 1, r);
        return Math.min(lRendah, rRendah);
    }

    public static double rataUAS(int[] arr) {
        int sum = 0;
        for (int nilai : arr) {
            sum += nilai;
        }
        return (double) sum / arr.length;
    }
}
