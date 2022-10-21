public abstract class CompressionTemplate {
    public int[] compresser(int[] data){
        System.out.println("image compresser avec succès");
        int a =compresser1();
        int b = compresser2();
        System.out.println(a + " " + b);
        return data;
    }
    protected abstract int compresser1();
    protected abstract int compresser2();
}
