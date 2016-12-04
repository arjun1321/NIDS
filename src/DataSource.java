

/**
 *
 * @author Dewesh
 */

import weka.core.Instances;
import weka.core.converters.ArffLoader;
import java.io.File;

public class DataSource {
    public static Instances read(String filename) throws Exception {
    ArffLoader loader = new ArffLoader();
    loader.setSource(new File(filename));
    Instances data = loader.getDataSet();
    return data;
  }
}
