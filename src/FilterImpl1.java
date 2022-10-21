public class FilterImpl1 implements Filter{
    public int[] filtrer(int[] data){
        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }
        System.out.println("Filtrage de la première version");
        return data;
    }
}
