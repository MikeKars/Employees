/**
 * Created by mike76 on 20.05.17.
 */
public class Employees {

    @Override
    public int hashCode() {
        //return super.hashCode();

    final int var = 31;
    int result = 1;


    return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private int id;
    private String fullName;
    private Post post;
    private Departament departament;
    private int chief;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setChief(int chief) {
        this.chief = chief;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public int getChief() {
        return chief;
    }

    public Post getPost() {
        return post;
    }

    public String getFullName() {
        return fullName;
    }

    public Employees(int id, String fullName, Post post, Departament departament, int chief){

        this.id = id;
        this.fullName = fullName;
        this.post = post;
        this.departament = departament;
        this.chief = chief;

    }


}
