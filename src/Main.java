import compression.CompressionImpl1;
import compression.CompressionImpl2;
import compression.CompressionTemplate;
import fitrage.Filter;
import fitrage.FilterImpl1;
import fitrage.FilterImplAdapter;

public class Main {

    public static void main(String[] args) {
        int[] image = {1, 5, 6, 2, 8, 34, 0};
        Filter filter1 = new FilterImpl1();
        Filter filter2 = new FilterImplAdapter();
        CompressionTemplate compressionTemplate1= new CompressionImpl1();
        CompressionTemplate compressionTemplate2= new CompressionImpl2();
       /* filter1.filtrer(image);

        */
        filter2.filtrer(image);
        //compressionTemplate1.compresser(image);
        compressionTemplate2.compresser(image);
    }
}
