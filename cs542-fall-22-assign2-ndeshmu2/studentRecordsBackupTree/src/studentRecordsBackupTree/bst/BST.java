package studentRecordsBackupTree.bst;

public class BST {
    Node rootNode;
    public int i;

    public BST(){
        rootNode = null;
    }

    public BST(int id){
        rootNode = new Node(id);
    }

    public void insert(Node node){rootNode = insertRecur(rootNode, node); }
    Node insertRecur(Node root, Node node){
        if(node == null) return root;

        if(root == null){
            root = node;
            return root;
        }
        else if(node.getStudentId() < root.getStudentId()){
            root.left = insertRecur(root.left, node);
        }
        else if(node.getStudentId() > root.getStudentId()){
            root.right = insertRecur(root.right, node);
        }

        return root;
    }

    Node search(int id){return searchRecur(rootNode, id);}
    Node searchRecur(Node root, int id){
        if(root == null || root.getStudentId() == id) return root;

        if(root.getStudentId() < id){
            return searchRecur(root.right, id);
        }
        return searchRecur(root.left, id);
    }

    public int printInorder(){return inorderRecur(rootNode);}
    int inorderRecur(Node root){
        if(root != null){
            inorderRecur(root.left);
            System.out.print(root.getStudentId() + " ");
            i = root.getStudentId();
            inorderRecur(root.right); 
        }
        return i;
    }
    public int calcSum(){return calcSumRecur(rootNode);}
    int calcSumRecur(Node root){
        if(root == null) return 0;
        return root.getStudentId() + calcSumRecur(root.left) + calcSumRecur(root.right);
    }

    public void increment(int amount){incrementRecur(rootNode, amount);}
    void incrementRecur(Node root, int amount){
        if(root ==null) return;
        root.setStudentId(root.getStudentId() + amount);
        incrementRecur(root.left, amount);
        incrementRecur(root.right, amount);
    }


}
