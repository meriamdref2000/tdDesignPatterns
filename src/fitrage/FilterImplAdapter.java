package fitrage;

public class FilterImplAdapter extends ImplNonStandard implements Filter {
    @Override
    public int[] filtrer(int[] data) {
        return filtrerAncienne(data);
    }
}
