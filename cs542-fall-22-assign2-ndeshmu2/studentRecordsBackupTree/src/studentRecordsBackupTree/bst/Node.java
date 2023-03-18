package studentRecordsBackupTree.bst;
public class Node extends BstObservable implements BstObserver{
    private int studentId;
    private String description;

    Node left;
    Node right;

    public Node(){
        this.studentId = 0;
        this.description = "";
        left = null;
        right = null;
    }

    public Node(int id){
        this.studentId = id;
        this.description = "";
        left = null;
        right = null;
    }

    public void Node(int id, String des){
        this.studentId = id;
        this.description = des;
        left = null;
        right = null;
    }

    public void setStudentId(int id){
        this.studentId = id;
        setState(id);
    }

    public int getStudentId(){
        return this.studentId;
    }

    public void setDescription(String des){
        this.description = des;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public void update(int id) {
        this.studentId = id;
    }
}