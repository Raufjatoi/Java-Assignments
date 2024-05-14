class parent{
    String father, mother;

    public void set_val(String father, String mother){
        this.father = father;
        this.mother = mother;
    }
}
class son extends parent{
    String son ;
    public void set_val(String son){
        this.son = son;
    }
    public void get_somethin(){
        System.out.println(this.father + " and " + this.mother + " have one son and his name is " + this.son);
    }
}
public class practice4 {
    public static void main (String[] args){
        son fam = new son();
        fam.set_val("akbar");
        fam.set_val("ali raza", "noor");
        fam.get_somethin();

    }
    
}
