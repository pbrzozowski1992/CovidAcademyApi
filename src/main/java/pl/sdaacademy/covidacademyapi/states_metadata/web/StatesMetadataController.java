package pl.sdaacademy.covidacademyapi.states_metadata.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdaacademy.covidacademyapi.states_metadata.serivce.StatesMetadataService;
import pl.sdaacademy.covidacademyapi.states_metadata.repository.StatesMetadata;

@RequestMapping("/info")
@RestController
public class StatesMetadataController {

    private StatesMetadataService statesMetadataService;

    public StatesMetadataController(StatesMetadataService statesMetadataService) {
        this.statesMetadataService = statesMetadataService;
    }

    @GetMapping
    public StatesMetadata[] getStatesMetadata() {
        return statesMetadataService.getStatesMetadata();
    }
}
