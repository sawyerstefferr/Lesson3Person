package person;
import java.util.ArrayList;

public class Startup {
    public static void printAr(ArrayList a){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }

    public static void main(String[] args){


        Person me=new Person("Sawyer","Steffen",18);
        me.addWeight(130.0);
        Person maddie=new Person("Maddie","Kern",16);
        Person bob=new Person("Bob","Joe",56);
        Person sister=new Person("Ilya","Steffen",20);
        Person mom=new Person("Megan","David",39);
        ArrayList people=new ArrayList<Person>(0);
        people.add(me);
        
        people.add(maddie);
        people.add(bob);
        people.add(sister);
        people.add(mom);
        printAr(people);
        System.out.println(me.getWeight());

    }

}
