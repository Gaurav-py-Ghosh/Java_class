public class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    Employee() {
        empno = 0;
        ename = null;
        basic = 0;
        hra = 0;
        da = 0;
        netpay = 0;
    }

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}
