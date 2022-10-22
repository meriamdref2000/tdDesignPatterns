package compression;

public class CompressionImpl1 extends CompressionTemplate{

    protected int compresser1(){
        System.out.println("Compresser1 version1");
        return 3;
    }


    @Override
    protected int compresser2() {
        System.out.println("Compresser2 version1");
        return 4;
    }


}
