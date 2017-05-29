import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mike76 on 20.05.17.
 */
public class Run {


    public static void main(String[] args) {

    List<Employees> list = new ArrayList<Employees>();

        Employees unit1 = new Employees(1, "Ivanov", Post.POST1, Departament.DEPARTAMENT1, 1);
                Employees unit2 = new Employees(2, "Jvanov", Post.POST2, Departament.DEPARTAMENT1, 1);
                Employees unit3 =new Employees(3, "Kvanov", Post.POST3, Departament.DEPARTAMENT1, 1);
                Employees unit4 =new Employees(4, "Lvanov", Post.POST2, Departament.DEPARTAMENT2, 2);
                Employees unit5 = new Employees(5, "Mvanov", Post.POST1, Departament.DEPARTAMENT2, 2);
                Employees unit6 =new Employees(6, "Ovanov", Post.POST3, Departament.DEPARTAMENT2, 2);
                Employees unit7 =new Employees(7, "Pvanov", Post.POST3, Departament.DEPARTAMENT3, 3);
                Employees unit8 =new Employees(8, "Qvanov", Post.POST1, Departament.DEPARTAMENT3, 3);
                Employees unit9 = new Employees(9, "Rvanov", Post.POST2, Departament.DEPARTAMENT3, 3);
                Employees unit10 =new Employees(10, "Svanov", Post.POST1, Departament.DEPARTAMENT2, 2);
        list.add(unit1);
        list.add(unit2);
        list.add(unit3);
        list.add(unit4);
        list.add(unit5);
        list.add(unit6);
        list.add(unit7);
        list.add(unit8);
        list.add(unit9);
        list.add(unit10);

        //System.out.println(list.get(1).getDepartament().equals(list.get(2).getDepartament()));

        Map<String, List<Employees>> indexDepartament = new HashMap<String, List<Employees>>();
        for(Employees e : list){
            String departament = e.getDepartament().toString();
            //List<Employees> empsInDep = indexDepartament.get(departament);
            if (indexDepartament.containsKey(departament)){
                indexDepartament.get(departament).add(e);
            } else
            {
                List<Employees> one = new ArrayList<>();
                one.add(e);
                indexDepartament.put(departament.toString(), one);
            }
        }

        for (Map.Entry<String, List<Employees>> entry : indexDepartament.entrySet()) {
            //System.out.println(entry.getKey() + " / " + entry.getValue());
            System.out.println(entry.getKey());
            for (Employees empl: entry.getValue())
            {
                System.out.println(empl.getFullName());
            }
            System.out.println();

        }






       //System.out.println(list);



    }



}
