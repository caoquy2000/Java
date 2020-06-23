
public class Bank {

    int getRateOfInterest() {
        return 0;
    }
}

class VCB extends Bank {

    int getRateOfInterest() {
        return 8;
    }
}

class AGR extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class CTG extends Bank {

    int getRateOfInterest() {
        return 9;
    }
}

class Test3 {

    public static void main(String[] args) {
        Bank b1 = new VCB();
        Bank b2 = new AGR();
        Bank b3 = new CTG();
        System.out.println("VCB lai xuat la: " + b1.getRateOfInterest());
        System.out.println("AGR lai xuat la: " + b2.getRateOfInterest());
        System.out.println("CTG lai xuat la: " + b3.getRateOfInterest());
    }
}
