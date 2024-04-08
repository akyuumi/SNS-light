package com.app.mealman.services;

import com.app.mealman.entities.Sample;
import com.app.mealman.repositories.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    SampleService(SampleRepository testRepository) {
        this.sampleRepository = testRepository;
    }

    public Sample insertText(String text) {
        Sample entity = new Sample();
        entity.setText(text);
        return sampleRepository.save(entity);
    }

}
