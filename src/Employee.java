public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        double tax=0;

        if (salary > 1000) tax=(salary*0.03);

        return tax;

    }

    public double bonus() {

        double bonus=0;

        if (workHours > 40) bonus=((workHours-40)*30*4);

        return bonus;
    }

    public double raiseSalary() {
        double raiseSalary=0;

        if (2021 - hireYear < 10 && 2021-hireYear >=0) raiseSalary=salary*0.05;
        else if (2021 - hireYear > 9 && 2021 - hireYear < 20 ) raiseSalary=salary*0.10;
        else if (2021 - hireYear >19) raiseSalary=salary*0.15;
        else raiseSalary=0;

        return raiseSalary;
    }

    @Override
    public String toString() {

        if (2021 - hireYear < 10 && 2021-hireYear >=0 && salary+raiseSalary() > 1000)
            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nVergi kesintisi : "+ tax() +
                " TL\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %5\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası brüt maaş : " + (salary +raiseSalary()) + " TL" +"\nZam sonrası vergi kesintisi : "
                    +((salary+raiseSalary())*0.03) + "\nZam sonrası net maaş : "+
                    ((salary +raiseSalary())-((salary +raiseSalary())*0.03))
                    +"\nBu ayki net gelir : " + (salary-tax()+bonus());

        if (2021 - hireYear < 10 && 2021-hireYear >=0 && salary+raiseSalary() < 1000)
            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %5\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası net maaş : " + (salary +raiseSalary()) + " TL" + "\nBu ayki net gelir : " + (salary+bonus());


        if (2021 - hireYear > 9 && 2021 - hireYear < 20 && salary+raiseSalary() > 1000)
            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nVergi kesintisi : "+ tax() +
                    " TL\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %10\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası brüt maaş : " + (salary +raiseSalary()) + " TL" +"\nZam sonrası vergi kesintisi : "
                    +((salary+raiseSalary())*0.03) + "\nZam sonrası net maaş : "+
                    ((salary +raiseSalary())-((salary +raiseSalary())*0.03))
                    +"\nBu ayki net gelir : " + (salary-tax()+bonus());

        if (2021 - hireYear > 9 && 2021 - hireYear < 20 && salary+raiseSalary() < 1000)
            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %10\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası maaş : " + (salary +raiseSalary()) + " TL" + "\nBu ayki net gelir : " + (salary+bonus());

        if (2021 - hireYear > 19 && salary+raiseSalary() > 1000 )
            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nVergi kesintisi : "+ tax() +
                    " TL\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %15\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası brüt maaş : " + (salary +raiseSalary()) + " TL" +"\nZam sonrası vergi kesintisi : "
                    +((salary+raiseSalary())*0.03) + "\nZam sonrası net maaş : "+
                    ((salary +raiseSalary())-((salary +raiseSalary())*0.03))
                    +"\nBu ayki net gelir : " + (salary-tax()+bonus());

        if (2021 - hireYear > 19 && salary+raiseSalary() < 1000 )

            return "Çalışan adı : " + name + "\nMevcut maaş : "+salary+" TL\nKuruma giriş tarihi : " + hireYear + "\nKurumda çalışma süresi : " +
                    (2021-hireYear)+" yıl\nAylık mesai : " + (workHours-40)*4 +" saat\nKazanılan bonus : "+ bonus()+" TL\nZam oranı : %10\nZam miktarı : "
                    + raiseSalary() + " TL\nZam sonrası net maaş : " + (salary +raiseSalary()) + " TL" + "\nBu ayki net gelir : " + (salary+bonus());

        else return "Geçersiz bilgi girdiniz. Lütfen girdiğiniz bilgileri kontrol edip yeniden deneyiniz.";

    }
}
