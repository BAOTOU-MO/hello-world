public class e{
    public static void main(String[] args) {

        MyCircle mc = new MyCircle();
        mc.r = 4;

        mc.areaCricle();
        System.out.println();

        mc.circumference();
        System.out.println();

        mc.intersect(1,2,3,4,5,6);
        System.out.println();

        mc.myLineCircle(1,2,3,4,5,6);
    }
}

class MyCircle{

    int centerCricle;//圆心
    int r;//半径
    double pi = 3.14;

    public void areaCricle(){
        //计算圆的面积 S = π r的 平方
        System.out.println(pi*r*r);
    }

    public void circumference(){
        //计算圆的周长 c  = 2 π r  = π d
        System.out.println(2*pi*r);
    }

    public void intersect(int x1,int y1,int x2,int y2,int circleR1,int circleR2){
        //判断元是否相交 半径和等于圆心距 相切 半径和 小于圆心距 相离 半径和大于圆心距 相交
        //圆心距+小圆半径 小于大圆半径 是包含关系否则相交

        //求两点距离 既是圆心距
        double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        if (circleR1 + circleR2 < d){
            System.out.println("两圆相离");
        }
        if (circleR1 + circleR2 == d){
            System.out.println("两圆相切");
        }
       if (circleR1 + circleR2 > d){
            System.out.println("两圆相交");
       }

    }

    //直线与圆的位置关系
    public void myLineCircle(int x1,int y1,int x2,int y2,int cx,int cy){
        //公式 d=|Ax0+By0+C|/√(A^2+B^2)

        int a = y2-y1;
        int b = x1-x2;
        int c = x2*y1 - x1*y2;

        double d;

        d=Math.abs(a*cx + b*cy + c) / Math.sqrt(a*a+b*b);

        if (d > r){
            System.out.println("圆和直线的关系是：相离");
        }

        if (d == r){
            System.out.println("圆和直线的关系是：相切");
        }

        if (d < r){
            System.out.println("圆和直线的关系是：相交");
        }
    }

}

