/* NIM              : 13020210026
   Nama             : Ida Mawaddah Nur
   Hari/Tanggal     : Senin, 06 Maret 2023 
   Waktu Pengerjaan : 20.59 */

public class Bacakar {

    /**
    * @param args
    * @throws IOException
    */
    
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        char cc;
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        // atau
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        /* Algoritma */
        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");

        //perintah baca karakter cc
        cc =dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");

        //perintah baca bil
        bil =Integer.parseInt(datAIn.readLine());
        /*String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);*/
        //JOptionPane.showMessageDialog(null, "hello");
        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

    }
}