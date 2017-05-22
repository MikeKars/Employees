import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mike76 on 20.05.17.
 */
public class Run {


    public static void main(String[] args) {

    ArrayList<Employees> list = new ArrayList<Employees>();


    list.add(new Employees(1, "Ivanov", Post.POST1, Departament.DEPARTAMENT1, 1));
    list.add(new Employees(2, "Jvanov", Post.POST2, Departament.DEPARTAMENT1, 1));
    list.add(new Employees(3, "Kvanov", Post.POST3, Departament.DEPARTAMENT1, 1));
    list.add(new Employees(4, "Lvanov", Post.POST2, Departament.DEPARTAMENT2, 2));
    list.add(new Employees(5, "Mvanov", Post.POST1, Departament.DEPARTAMENT2, 2));
    list.add(new Employees(6, "Ovanov", Post.POST3, Departament.DEPARTAMENT2, 2));
    list.add(new Employees(7, "Pvanov", Post.POST3, Departament.DEPARTAMENT3, 3));
    list.add(new Employees(8, "Qvanov", Post.POST1, Departament.DEPARTAMENT3, 3));
    list.add(new Employees(9, "Rvanov", Post.POST2, Departament.DEPARTAMENT3, 3));
    list.add(new Employees(10, "Svanov", Post.POST1, Departament.DEPARTAMENT2, 2));

    Map<String, List<Employees>> indexDepartament = new HashMap<String, List<Employees>>();

    for(Employees e : list){
       Departament departament = e.getDepartament();
       List<Employees> empsInDep = indexDepartament.get(departament);
       if (empsInDep == null){
           empsInDep = new ArrayList<>();
           indexDepartament.put(String.valueOf(departament), empsInDep);

       }
        empsInDep.add(e);
    }

        System.out.println(indexDepartament);



    }



}
