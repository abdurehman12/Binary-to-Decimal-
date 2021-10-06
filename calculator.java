public class cal {
    public int real;
    public int img;
public cal(int real,int img){
    this.real=real;
    this.img=img;
}
public void Show(){
    System.out.println(""+real+"+"+img+"i");
}
public static void main(String[]args){
        //int real=Integer.parseInt(args[0]);
        //int img=Integer.parseInt(args[1]);
        cal a=new cal(2,3);
        cal b=new cal(4,5);
      cal ans = a.add(b);
      cal ans2=  a.multiply(b);
      cal ans3= a.subtract(b);
      cal ans4=a.divide(b);

        ans.Show();
    }
public cal add(cal a, cal b) {
    //cal ans = null;
    int real = this.real + b.real;
    int img = this.img + b.img;
    cal ans =new cal(real,img);
    return ans;
}
    public cal divide(cal a , cal b){
       int d= (b.real*b.real)+(b.img*b.img);
       int real=((a.real*b.real)+(a.img*b.img)/d);
       int img=((b.real*b.img)-(a.real*b.img)/2);

       cal ans=new cal(real,img);
       return ans;
    }
public static cal multiply(cal a, cal b ){
    int real=a.real*b.real-a.img*b.img;
    int img=a.real+b.img+a.img*b.real;


    cal ans= new cal(real,img);
    return ans;

}
public static void subtract(int real,int imag){

}
}
