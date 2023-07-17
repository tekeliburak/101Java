public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        double taxvalue;
        if ((this.salary <1000 && this.salary>0) || (this.salary<=0)){
            taxvalue = 0;
        }
        else{
            taxvalue = this.salary*(0.03);
        }
        return taxvalue;
    }
    public int bonus(){
        int bonusvalue;
        if (this.workHours >40){
            bonusvalue = this.workHours - 40;
            bonusvalue = bonusvalue * 30;
            return bonusvalue;
        }
        else{
            return 0;
        }
    }
    public double raiseSalary(){
        double increase;
        int remainYear = 2021 - this.hireYear;
        if (remainYear<10&&remainYear>0){
            increase = this.salary*0.05;
        }
        else if (remainYear>9 && remainYear<20){
            increase = this.salary*0.1;
        }
        else if (remainYear > 19){
            increase = this.salary*0.15;
        }
        else{
            increase = 0;
        }
        return increase;
    }
    public void tooString(){
        if ((this.salary<=0)||(this.workHours<=0)||(this.hireYear>2021&&this.hireYear<=0)){
            System.out.println("Hatalı Giriş Yaptınız.");
        }
        else{
            System.out.println("Adı: " + this.name);
            System.out.println("Maaşı: " + this.salary);
            System.out.println("Çalışma Saati: " + this.workHours);
            System.out.println("Başlangıç Yılı: " + this.hireYear);
            System.out.println("Vergi: " + this.tax());
            System.out.println("Bonus: " + this.bonus());
            System.out.println("Maaş Artışı: " + this.raiseSalary());
            System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + (this.bonus()-this.tax())));
            System.out.println("Toplam Maaş: " + (this.salary + this.raiseSalary()));
        }

    }
}
