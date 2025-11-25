class Student1
 {
    String name; 

int age; 

static String city; 

Student1(String n, int a, String c) {
name= n;
age=a;
city=c;

}

void display()
{ 

System.out.println("Name:" + name +"Age:"+age+" city:" + city);
}
public static void main(String[] args){

Student1 s1= new Student1( "Karan",  20,"Kanpur");

Student1 s2= new Student1( "Ashutus", 22,"Delhi");

s1.display();
s2.display();
}
 }
