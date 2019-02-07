
package person;

public class Person implements Weighable{
    private String fName,lName;
    private int age;
    private static int count=0;
    private double pounds=0;
    public Person(){
        age=0;
        fName="";
        lName="";
        count++;
    }
    public Person(String fName,String lName, int age){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
        count++;
    }
    @Override
    public void addWeight(double pounds){
        this.pounds+=pounds;
    }
    @Override
    public void loseWeight(double pounds){
        this.pounds-=pounds;
    }
    public double getWeight(){
        return pounds;
    }
    public void setName(String fName, String lName){
        this.fName=fName;
        this.lName=lName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public int getAge(){
        return age;
    }
    public int getCount(){
        return count;
    }
    @Override
    public String toString(){
        return fName+" "+lName+", "+age;
    }
    
}
