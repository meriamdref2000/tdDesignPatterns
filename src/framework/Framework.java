package framework;

import compression.CompressionTemplate;
import fitrage.Filter;

public class Framework {
    private Filter filter;
    private CompressionTemplate compressionTemplate;
    public int[] appliquerFiltre(int[] data){
        return filter.filtrer(data);
    }
    public void setFilter(Filter filter){
        this.filter = filter;
    }

    public int[] appliquerCompression(int[] data){
        return compressionTemplate.compresser(data);
    }

    public void setCompressionTemplate(CompressionTemplate compressionTemplate){
        this.compressionTemplate=compressionTemplate;
    }
}
