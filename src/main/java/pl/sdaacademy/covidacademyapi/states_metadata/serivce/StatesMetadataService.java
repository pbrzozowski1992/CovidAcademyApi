package pl.sdaacademy.covidacademyapi.states_metadata;

import org.springframework.stereotype.Service;

@Service
public class StatesMetadataService {

    private final StatesMetadataApi statesMetadataApi;

    public StatesMetadataService(StatesMetadataApi statesMetadataApi) {
        this.statesMetadataApi = statesMetadataApi;
    }

    public StatesMetadata[] getStatesMetadata() {
        return statesMetadataApi.getStatesMetadata();
    }
}
