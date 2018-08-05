public class Calculations {

     int salary;
    private final double LOWEST_AMOUNT= 11850;

    public Calculations(int salary){
        this.salary = salary;
    }

    public  double tax(){
        if(salary<LOWEST_AMOUNT){
            return 0;
        }else if(salary>LOWEST_AMOUNT && salary<46350){
            return (salary-LOWEST_AMOUNT)*0.2;
        }else if(salary>46350 && salary<150000){
            return 6900+ (salary-46350)*0.4;
        }else{
            return 4000;
        }
    }

    public double ni(){
        if(salary>8424) {
            return  (salary - 8424) * 0.138;
        }else{
            return 0;
        }
    }

    public double student(){
        if(salary>25000){
            return (salary-25000)*0.09;
        }else{
            return 0;
        }
    }




}
