package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpensiveObjectImpl implements ExpensiveObject {

    final Logger logger = LoggerFactory.getLogger(ExpensiveObjectImpl.class);

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        logger.info("processing complete.");
    }

    private void heavyInitialConfiguration() {
        logger.info("Loading initial configuration..");
    }

}