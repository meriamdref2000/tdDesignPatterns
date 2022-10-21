public class CompressionImpl2 extends CompressionTemplate{
    @Override
    protected int compresser1() {
        System.out.println("Compresser1 version2");
        return 7;
    }

    @Override
    protected int compresser2() {
        System.out.println("Compresser2 version2");
        return 5;
    }
}
