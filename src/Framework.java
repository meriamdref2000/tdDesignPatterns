public class Framework {
    protected Filter filter;
    public CompressionTemplate compressionTemplate;
    int[] data;

    public void effectuerFiltre() {
        filter.filtrer(data);
    }
    public void effectuerCompression(){compressionTemplate.compresser(data);}
}
