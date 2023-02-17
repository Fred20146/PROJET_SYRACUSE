public class syracuse
public static void main (string args []){
    syracuse(15);
}

static boolean funpair(int n){
    int a = n;
    if ( a == 1 )
    return false;
    if ( a == 2)
    return true;
    a-=1
    return funpair(n-1);
}

static int collatz(x){
    if (funpair(x))
    return x/2;
    else
    return 3*x+1;    
}
static void syracuse( int x){
    if (x == 1)
        return;
    else
        System.out.println(x);
        syracuse(collatz(x))
        }
