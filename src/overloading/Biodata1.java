package overloading;
public class Biodata1 extends Individu{
    public void setIdentitas(String nama){ //method dan parameter
    this.nama = nama; //this untuk menyatakan variabel nama yang dimaksud adalah nama yang ada di dalam class Individu
  }
  public void setIdentitas(String nama, String warnaKulit){ //method dan parameter
    this.nama = nama; //this untuk menyatakan variabel nama yang dimaksud adalah nama yang ada di dalam class Individu
    this.warnaKulit = warnaKulit; //this untuk menyatakan variabel warnaKulit yang dimaksud adalah warnaKulit yang ada di dalam class Individu
  }
 public void setIdentitas(String nama, String warnaKulit, double tinggiBadan){ //method dan parameter
    this.nama = nama; //this untuk menyatakan variabel nama yang dimaksud adalah nama yang ada di dalam class Individu
    this.warnaKulit = warnaKulit; //this untuk menyatakan variabel warnaKulit yang dimaksud adalah warnaKulit yang ada di dalam class Individu
    this.tinggiBadan = tinggiBadan; //this untuk menyatakan variabel tinggiBadan yang dimaksud adalah tinggiBadanyang ada di dalam class Individu
  }
  public void setIdentitas(String nama, String warnaKulit, double tinggiBadan, double beratBadan){ //method dan parameter
    this.nama = nama; //this untuk menyatakan variabel nama yang dimaksud adalah nama yang ada di dalam class Individu
    this.warnaKulit = warnaKulit; //this untuk menyatakan variabel warnaKulit yang dimaksud adalah warnaKulit yang ada di dalam class Individu
    this.tinggiBadan = tinggiBadan; //this untuk menyatakan variabel tinggiBadan yang dimaksud adalah tinggiBadanyang ada di dalam class Individu
    this.beratBadan = beratBadan; //this untuk menyatakan variabel beratBadan yang dimaksud adalah beratBadanyang ada di dalam class Individu
  }
   public void cetakIdentitas(){
    System.out.println("Nama         : "+nama);
    System.out.println("Warna Kulit  : "+warnaKulit);
    System.out.println("Tinggi Badan : "+tinggiBadan);
    System.out.println("Berat Badan  : "+beratBadan);
    System.out.println();
   }
}
