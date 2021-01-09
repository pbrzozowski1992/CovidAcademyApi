package pl.sdaacademy.covidacademyapi.states_stats.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdaacademy.covidacademyapi.states_metadata.repository.StatesMetadata;
import pl.sdaacademy.covidacademyapi.states_metadata.serivce.StatesMetadataService;
import pl.sdaacademy.covidacademyapi.states_stats.repository.CovidTrackingApi;
import pl.sdaacademy.covidacademyapi.states_stats.repository.StateStats;

import java.util.List;

@Service
public class StatesStatsService {

    private final CovidTrackingApi covidTrackingApi;
    private final StatesMetadataService statesMetadataService;

    @Autowired
    public StatesStatsService(StatesMetadataService statesMetadataService, CovidTrackingApi covidTrackingApi) {
        this.covidTrackingApi = covidTrackingApi;
        this.statesMetadataService = statesMetadataService;
    }

    public StateStats[] getAllStatesCurrentStats() {
        //logika bizensowa, np. mapowanie, validacja, itp
        return covidTrackingApi.getAllStatesCurrentStats();
    }

    public StateStats getStatsForState(String state, String date) {
        String acronym = statesMetadataService.getStateByName(state)
                .orElseThrow(()->{
                    throw new NoStateFoundException(state);
                }).getState();
        return covidTrackingApi.getStatsForState(acronym, date);
    }
}
