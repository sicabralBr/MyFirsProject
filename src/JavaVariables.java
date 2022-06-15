public class JavaVariables {
    static int memberVar = 123;

    public static void main(String[] args) {
        int twoLine;
        twoLine = 2;
        int oneLine = 1;
        oneLine = twoLine;
        int fromExpression = 2 + 3;
        final int finalVAR = 10;
        int myVar = getInt();
        int myInnerVar = memberVar + getInt();

        System.out.println(myInnerVar);
    }

    public static int getInt(){
        int methodScope = 22;
        return methodScope;
    }
}
