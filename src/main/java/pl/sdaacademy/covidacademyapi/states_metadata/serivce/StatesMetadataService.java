package pl.sdaacademy.covidacademyapi.states_metadata.serivce;

import org.springframework.stereotype.Service;
import pl.sdaacademy.covidacademyapi.states_metadata.repository.StatesMetadata;
import pl.sdaacademy.covidacademyapi.states_metadata.repository.StatesMetadataApi;

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
