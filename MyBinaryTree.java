public class MyBinaryTree{
  public int num;
  public StudentInfo current;
  public StudentInfo root;

  public void addToTree(StudentInfo studentToAdd){
    if(root == null){ //if root doesn't exist this will be root
      root = studentToAdd;
      num++;
    }
    else{
      current = root; //current starts at the top of the tree
      for(int i = 0; i < num; i++){
        //the tree adds the new student to the left if the new student's id is less than the current student's id
        if(studentToAdd.studentNum < current.studentNum){
          //if the left child is null, the new student will be the left child
          if(current.left == null){
            current.left = studentToAdd;
            num++;
            break;
          }
          else{
            //if the left child is not null, the current student will become the new current
            current = current.left;
          }
        }
        else{
          //the tree adds the new student to the right if the new student's id is greater than the current student's id
          if(current.right == null){
            current.right = studentToAdd;
            num++;
            break;
          }
          else{
            //if the right child is not null, the current student will become the new current
            current = current.right;
          }
        }
      }
    }
  }

  public void preOrder(StudentInfo root){
    if(root == null){
      return;
    }
    if(root.midName == null){
      System.out.println(root.studentNum + " " + root.firstName + " " + root.lastName);
    }
    else{
      System.out.println(root.studentNum + " " + root.firstName + " " + root.midName + " " + root.lastName);
    }
    preOrder(root.left);
    preOrder(root.right);
  }

  public void postOrder(StudentInfo root){
    if(root == null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    if(root.midName == null){
      System.out.println(root.studentNum + " " + root.firstName + " " + root.lastName);
    }
    else{
      System.out.println(root.studentNum + " " + root.firstName + " " + root.midName + " " + root.lastName);
    }
  }

  public void inOrder(StudentInfo root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    if(root.midName == null){
      System.out.println(root.studentNum + " " + root.firstName + " " + root.lastName);
    }
    else{
      System.out.println(root.studentNum + " " + root.firstName + " " + root.midName + " " + root.lastName);
    }
    inOrder(root.right);
  }
}