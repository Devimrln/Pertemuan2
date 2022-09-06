public class Terbesar {
    public static void main(String [] args){
        int max = 0;
        int min = 1000000;
        for (String number : args){
            System.out.println(" number = "+number);
            int angka = Integer.parseInt(number);
            if(angka > max){
                max = angka;
            }
            if(angka < min){
                min = angka;
            }
        }
        System.out.println("Terbesar = "+max);
        System.out.println("Terkecil = "+min);
    }
}
