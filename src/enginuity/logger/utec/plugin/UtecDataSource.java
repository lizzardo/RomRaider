package enginuity.logger.utec.plugin;

import enginuity.logger.ecu.external.ExternalDataItem;
import enginuity.logger.ecu.external.ExternalDataSource;

import java.util.ArrayList;
import java.util.List;

//NOTE: This class is instantiated via a no-args constructor.
public final class UtecDataSource implements ExternalDataSource {

    public String getName() {
        return "UTEC Datasource";
    }

    public String getVersion() {
        return "0.01";
    }

    public List<ExternalDataItem> getDataItems() {
        //TODO: Populate and return list of UTEC ExternalDataItem implementations
        return new ArrayList<ExternalDataItem>();
    }
}