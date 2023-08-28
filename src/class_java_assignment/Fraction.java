package class_java_assignment;

public class Fraction {
private int a, b;
Fraction(){
}
Fraction(int a, int b){
	this.a = a;
	this.b = b;
}
public int geta() {
	return a;
}
public void seta(int a) {
	this.a = a;
}
public int getb() {
	return b;
}
public void setb(int b) {
	this.b = b;
}
void display() {
	System.out.println(a+"/"+b);
}
boolean equals(float n) {
	float a = geta();
	float b = getb();
	float one = a/b;
	boolean result = (one == n);
	return result;
}
public static void main(String[]args) {
	Fraction obj = new Fraction (1, 2);
	obj.display();
	System.out.println(obj.equals(0.5f));
}
}
