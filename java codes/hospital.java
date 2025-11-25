abstract class Doctor {
    abstract void treatPatient();
    void hospitalInfo() {
        System.out.println("Max Hospital");

    }

    String name;
    Doctor (String name){
        this.name = name;
    }
}
    class district extends Doctor{
        district(String name){
            super(name);
        }
        void treatPatient(){
            System.out.println( name + " is treating a dental case");
        }

    }

    class cardiologist extends Doctor
    {
        cardiologist(String name)
        {
            super(name);
        }
        void treatPatient()
        {
            System.out.println( name + " is treating a heart case");
        
        }

    } 
    public class hospital{
        public static void main(String[] args)
        {
            Doctor d = new district("Dr. James");
            Doctor c = new cardiologist("Dr. David");
           
            d.hospitalInfo();
            d.treatPatient();
            c.hospitalInfo();
            c.treatPatient();
        }
    }
 




