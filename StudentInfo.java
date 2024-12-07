public class StudentInfo{
  public int studentNum;
  public String firstName;
  public String midName;
  public String lastName;
  public StudentInfo next;
  public StudentInfo left;
  public StudentInfo right;
  public StudentInfo root;

  public StudentInfo(int studentNum, String firstName, String midName, String lastName, StudentInfo left, StudentInfo right){
    this.studentNum = studentNum;
    this.firstName = firstName;
    this.midName = midName;
    this.lastName = lastName;
    this.left = null;
    this.right = null;
    this.next = null;
  }
}