package fitrage.adapter;

import fitrage.Filter;

public class FilterImplAdapter extends ImplNonStandard implements Filter {
    @Override
    public int[] filtrer(int[] data) {
        return filtrerAncienne(data);
    }
}
