public class Komplex {
  double real;
  double imagine;

  public Komplex(double real, double imagine) {
    this.real = real;
    this.imagine = imagine;

    //Assigns the value from real(white) to this.real for each variable
  }

  @Override
  public String toString() {
    return "Komplex" +"\n" + "{Real = " + real + ", Real = " + imagine + "i}";
  }

  public Komplex add(Komplex b) {
    double c = this.real + b.real;
    double cv = this.imagine + b.imagine;
    return new Komplex(c, cv);
  }

  public Komplex multiply(Komplex b) {
    double v = this.real * b.real;
    double vc = this.imagine * b.imagine;
    return new Komplex(v, vc);
  }
}
