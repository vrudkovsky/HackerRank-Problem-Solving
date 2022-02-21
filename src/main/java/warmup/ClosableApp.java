package warmup;

public class ClosableApp {
    public static void main(String[] args) {
        MyClosable myClosable = new MyClosable();
        System.out.println(myClosable.close());
    }
}

//alias j17="export JAVA_HOME=`/usr/libexec/java_home -v 17.0.1`; java -version"
//alias j11="export JAVA_HOME=`/usr/libexec/java_home -v 11.0.13`; java -version"
//alias j8="export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_311`; java -version"