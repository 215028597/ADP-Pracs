// Author: Keagan Tabisher 
// Student numeber: 215028597
package practten;

/**
 *
 * @author Junade
 */
public class Graduate extends Student implements Comparable<Graduate> {
  String qualification;
  double fee;

  public Graduate() {
  }

  public Graduate(String qualification, double fee) {
    this.qualification = qualification;
    this.fee = fee;
  }

  public Graduate(String qualification, double fee, String iD, String name, int score) {
    super(iD, name, score);
    this.qualification = qualification;
    this.fee = fee;
  }

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public double getFee() {
    return fee;
  }

  public void setFee(double fee) {
    this.fee = fee;
  }

  @Override
  public String toString() {
    return "Student surname: " + name +  ", Qualification: " + qualification + ", Fee: R" +  fee + "\n";
  }

  @Override
  public int compareTo(Graduate o) {
    return this.name.compareTo(o.name);
  }
}
