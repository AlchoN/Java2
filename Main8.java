import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Map<Integer, List<User> > MapaMap = new HashMap<>();
       
        for (int i = 1; i <= 5; i++ ) {
            System.out.println("Введите имя пользователя " + i + ":");
            String UserName = in.nextLine();
            System.out.println("Введите возраст пользователя " + i + ":");
            int UserAge = in.nextInt();
            User human = new User(UserName, UserAge);
            MapaMap.putIfAbsent(UserAge, new ArrayList<>());
            MapaMap.get(UserAge).add(human);
            in.nextLine();
            
        }
        System.out.println("Введите требуемый возраст:");
        int YearsOld = Integer.parseInt(in.nextLine());
        if (MapaMap.containsKey(YearsOld)) {
            List<User> users = MapaMap.get(YearsOld);
            users.sort(Comparator.comparing(User::getName));
        for(User human : users ) {
            System.out.println(human);
        }
    }
}
}
class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name =  name;
        this.age = age;
     }
    public void setName(String UserName){
        name = UserName;
        
    }
    public String getName(){
        return name;
    }
    public void setAge(int UserAge) {
        age = UserAge;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + "," + " возраст " + age + " лет");

    }
}