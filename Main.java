public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("");

    //new Binary tree
    MyBinaryTree theTree = new MyBinaryTree();

    StudentInfo aStudent = new StudentInfo(17, "Daffy", null, "Duck", null ,null);
    theTree.addToTree(aStudent);
    StudentInfo root = aStudent;

    aStudent = new StudentInfo(12, "Lola", null, "Bunny",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(15, "Fredrick", "Fitzgerald", "Fazbear",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(9, "Thomas", "Jasper", "Cat",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(21, "Gerald", "Jinx", "Mouse",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(19, "Ayaka", null, "Kamisato",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(11, "William", null, "Afton",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(23, "Michael", null, "Afton",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(7, "Elvis", "Aaron", "Presley",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(27, "Ei", null, "Raiden",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(26, "Johnathan", null, "Joestar",null,null);
    theTree.addToTree(aStudent);

    aStudent = new StudentInfo(6, "Joseph", null, "Joestar",null,null);
    theTree.addToTree(aStudent);

    System.out.println("Preorder Traversal");
    theTree.preOrder(root);
    System.out.println("");

    System.out.println("Postorder Traversal");
    theTree.postOrder(root);
    System.out.println("");

    System.out.println("Inorder Traversal");
    theTree.inOrder(root);
  }
}
