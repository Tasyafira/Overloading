package overloading;
public class Overloading {
    public static void main(String[] args) {
        //Membuat objek
        Individu oke = new Individu();
        
        //Membuat objek
        Biodata1 data = new Biodata1();
        oke.setIdentitas();  //pemanggilan method pada class Individu
        data.setIdentitas("Tata"); //pemanggilan method pada class biodata1
        data.cetakIdentitas(); //pemanggilan method pada class biodata1
        

        data.setIdentitas("Tata", "Putih");  //pemanggilan method pada class biodata1
        data.cetakIdentitas();  //pemanggilan method pada class biodata1
        System.out.println("---------------------------");
        
        data.setIdentitas("tata", "putih", 158);  //pemanggilan method pada class biodata1
        data.cetakIdentitas();  //pemanggilan method pada class biodata1
        System.out.println("---------------------------");

        data.setIdentitas("Tata", "Putih", 158, 52);  //pemanggilan method pada class biodata1
        data.cetakIdentitas();  //pemanggilan method pada class biodata1
        System.out.println("---------------------------");
        
        System.out.println("\n\n");
        //membuat objek
        Biodata2 dt = new Biodata2(); 
        oke.setIdentitas();  //pemanggilan method pada class Individu
        dt.setIdentitas("Geri");  //pemanggilan method pada class biodata2
        dt.cetakIdentitas();  //pemanggilan method pada class biodata2
        System.out.println("---------------------------");
        
        dt.setIdentitas("Geri", "Hitam");  //pemanggilan method pada class biodata2
        dt.cetakIdentitas();  //pemanggilan method pada class biodata2
        System.out.println("---------------------------");
        
        dt.setIdentitas("Geri", "Hitam", 165);  //pemanggilan method pada class biodata2
        dt.cetakIdentitas();  //pemanggilan method pada class biodata2
        System.out.println("---------------------------");

        dt.setIdentitas("Geri", "Hitam", 165, 56);  //pemanggilan method pada class biodata2
        dt.cetakIdentitas();  //pemanggilan method pada class biodata2
        System.out.println("---------------------------");

    }
}
    

