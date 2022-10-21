public class FilterImplAdapter extends ImplNonStandard implements Filter{


    @Override
    public int[] filtrer(int[] data) {
        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }
        System.out.println("Filtrage de l'adaptateur'");
        filtrerAncienne(data);
        return data;
    }
}
