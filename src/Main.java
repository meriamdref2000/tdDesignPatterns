import compression.CompressionImpl1;
import compression.CompressionImpl2;
import compression.CompressionTemplate;
import fitrage.Filter;
import fitrage.FilterImpl1;
import fitrage.adapter.FilterImplAdapter;
import fitrage.adapter.ImplNonStandard;
import framework.Framework;

public class Main {

    public static void main(String[] args) {
        int[] image = {1, 5, 6};
        Framework framework = new Framework();
        System.out.println("impl filtre1");
        framework.setFilter(new FilterImpl1());
        framework.appliquerFiltre(image);
        System.out.println("impl ancienne");
        framework.setFilter(new FilterImplAdapter());
        framework.appliquerFiltre(image);

        framework.setCompressionTemplate(new CompressionImpl1());
        framework.appliquerCompression(image);


    }
}
