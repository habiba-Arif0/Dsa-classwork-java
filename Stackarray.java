public class Stackarray {
    int top=-1;
    int[] stack=new int[5];

    void push(int x){
        stack[++top]=x;
    }
    int pop(){
        return stack[top--];
    }

    public static void main(String[] args) {
        Stackarray s=new Stackarray();
        s.push(10); s.push(120);
        System.out.println(s.pop());
    }
}
